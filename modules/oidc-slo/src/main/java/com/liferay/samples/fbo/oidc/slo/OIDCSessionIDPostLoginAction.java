package com.liferay.samples.fbo.oidc.slo;

import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.LifecycleAction;
import com.liferay.portal.kernel.events.LifecycleEvent;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.security.sso.openid.connect.OpenIdConnectSession;
import com.liferay.portal.security.sso.openid.connect.provider.OpenIdConnectSessionProvider;
import com.liferay.samples.fbo.oidc.sid.model.OidcSid;
import com.liferay.samples.fbo.oidc.sid.service.OidcSidLocalService;
import com.nimbusds.jwt.JWT;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.JWTParser;

import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;


@Component(
		immediate = true, property = "key=login.events.post",
		service = LifecycleAction.class
	)
public class OIDCSessionIDPostLoginAction implements LifecycleAction {

	@Override
	public void processLifecycleEvent(LifecycleEvent lifecycleEvent) throws ActionException {
		
		HttpServletRequest httpServletRequest = lifecycleEvent.getRequest();
		HttpSession httpSession = httpServletRequest.getSession();
		
		OpenIdConnectSession openIdConnectSession =
				_openIdConnectSessionProvider.getOpenIdConnectSession(
					httpSession);

		long userId = _portal.getUserId(httpServletRequest);
		long companyId = _portal.getCompanyId(httpServletRequest);
		
		if(openIdConnectSession != null) {

			String accessToken = openIdConnectSession.getAccessTokenValue();
			
			try {
			
				JWT jwt = JWTParser.parse(accessToken);
				JWTClaimsSet claimsSet = jwt.getJWTClaimsSet();
				String sid = (String) claimsSet.getClaim("sid");
				
				String sessionId = httpSession.getId();
				
				OidcSid oidcSid = _oidcSidLocalService.createOidcSid(_counterLocalService.increment(OidcSid.class.getName()));
				oidcSid.setCompanyId(companyId);
				oidcSid.setUserId(userId);
				oidcSid.setSessionId(sessionId);
				oidcSid.setSid(sid);
				oidcSid.setStatus(true);
				oidcSid.setJwksUri("");
				_oidcSidLocalService.addOidcSid(oidcSid);

			} catch (ParseException parseException) {
				_log.error("Failed to parse token", parseException);
			}
		}
	}
	
	private static final Log _log = LogFactoryUtil.getLog(
			OIDCSessionIDPostLoginAction.class);
	
	@Reference
	private Portal _portal;
	
	@Reference
	private OpenIdConnectSessionProvider _openIdConnectSessionProvider;
	
	@Reference
	private OidcSidLocalService _oidcSidLocalService;
	
	@Reference
	private CounterLocalService _counterLocalService;
	
}
