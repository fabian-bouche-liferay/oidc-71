package com.liferay.samples.fbo.oidc.slo;

import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.security.sso.openid.connect.provider.OpenIdConnectSessionProvider;
import com.liferay.samples.fbo.oidc.sid.model.OidcSid;
import com.liferay.samples.fbo.oidc.sid.service.OidcSidLocalService;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.proc.BadJOSEException;
import com.nimbusds.jwt.JWT;
import com.nimbusds.jwt.JWTParser;
import com.nimbusds.oauth2.sdk.id.ClientID;
import com.nimbusds.oauth2.sdk.id.Issuer;
import com.nimbusds.openid.connect.sdk.validators.LogoutTokenValidator;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
		configurationPid = "com.liferay.portal.security.sso.openid.connect.internal.configuration.OpenIdConnectProviderConfiguration",
	    immediate = true,
	    property = {
	        "osgi.http.whiteboard.context.path=/",
	        "osgi.http.whiteboard.servlet.pattern=/backchannel"
	    },
	    service = Servlet.class
	)
public class BackchannelLogoutServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final static String LOGOUT_TOKEN = "logout_token";
	
	@Override
	protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {

		String logoutTokenJWT = ParamUtil.get(httpServletRequest, LOGOUT_TOKEN, StringPool.BLANK);

		if(!StringPool.BLANK.equals(logoutTokenJWT)) {

			if(_log.isDebugEnabled()) {
				_log.debug("Backchannel OIDC logout with token: " + logoutTokenJWT);
			}		

			try {
				JWT logoutToken = JWTParser.parse(logoutTokenJWT);
				
				if(_log.isDebugEnabled()) {
					_log.debug("Parsed Logout Token: " + logoutToken.getParsedString());
				}		
				
				List<String> clientIdList = (List<String>) logoutToken.getJWTClaimsSet().getClaim("aud");
				
				if(clientIdList != null && clientIdList.size() > 0) {

					String externalSessionId = (String) logoutToken.getJWTClaimsSet().getClaim("sid");

					OidcSid oidcSid = _oidcSidLocalService.getBySid(externalSessionId);
					
					String jwksUriString = oidcSid.getJwksUri();
					Issuer expectedIssuer = new Issuer(oidcSid.getIssuer());

					JWSAlgorithm expectedJWSAlg = JWSAlgorithm.RS256;
					
					if(jwksUriString != null) {
						URL jwkSetURI = new URL(jwksUriString);
						ClientID clientID = new ClientID(clientIdList.get(0));
						LogoutTokenValidator validator = new LogoutTokenValidator(expectedIssuer, clientID, expectedJWSAlg, jwkSetURI);
						
						try {
							validator.validate(logoutToken);
						} catch (BadJOSEException | JOSEException e) {
							_log.error("Failed to validate Logout Token", e);
							return;
						}
					}
					
					oidcSid.setStatus(false);
					_oidcSidLocalService.updateOidcSid(oidcSid);
					
					if(_log.isDebugEnabled()) {
						_log.debug("Expired session: " + externalSessionId);
					}		
					
				}				
			} catch (PortalException e) {
				_log.error("Failed to find session", e);
			} catch (java.text.ParseException e) {
				_log.error("Failed to parse token", e);
			}

		}

	}
	
	@Reference
	private OidcSidLocalService _oidcSidLocalService;
	
	@Reference
	private OpenIdConnectSessionProvider _openIdConnectSessionProvider;
	
	private static final Log _log = LogFactoryUtil.getLog(
			BackchannelLogoutServlet.class);
	
}
