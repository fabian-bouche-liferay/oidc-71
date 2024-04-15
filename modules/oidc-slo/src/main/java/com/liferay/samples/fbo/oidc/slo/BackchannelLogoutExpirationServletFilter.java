package com.liferay.samples.fbo.oidc.slo;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.BaseFilter;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.security.sso.openid.connect.OpenIdConnectSession;
import com.liferay.portal.security.sso.openid.connect.provider.OpenIdConnectSessionProvider;
import com.liferay.samples.fbo.oidc.sid.exception.NoSuchOidcSidException;
import com.liferay.samples.fbo.oidc.sid.model.OidcSid;
import com.liferay.samples.fbo.oidc.sid.service.OidcSidLocalService;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
		immediate = true,
		property = {
			"before-filter=Auto Login Filter", "servlet-context-name=",
			"servlet-filter-name=SSO OpenId Connect Backchannel Logout Expiration Filter",
			"url-pattern=/*" 
		},
		service = Filter.class
	)
public class BackchannelLogoutExpirationServletFilter extends BaseFilter {

	@Override
	protected Log getLog() {
		return _log;
	}
	
	@Override
	protected void processFilter(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws Exception {
		
		HttpSession session = request.getSession();
		String sessionId = session.getId();
		
		OpenIdConnectSession oidcSession = _openIdConnectSessionProvider.getOpenIdConnectSession(session);
		if(oidcSession != null) {
			
			try {
				OidcSid sid = _oidcSidLocalService.getBySessionId(sessionId);
				if(!sid.getStatus()) {
					session.invalidate();
					_oidcSidLocalService.deleteOidcSid(sid);
					response.sendRedirect(
							_portal.getHomeURL(request));
				}
			} catch (NoSuchOidcSidException e) {
				_log.error("OIDC Session not found", e);
			}

		}
		
		super.processFilter(request, response, filterChain);
	}
	
	@Reference
	private OidcSidLocalService _oidcSidLocalService;
	
	@Reference
	private OpenIdConnectSessionProvider _openIdConnectSessionProvider;

	@Reference
	private Portal _portal;
	
	private static final Log _log = LogFactoryUtil.getLog(
			BackchannelLogoutExpirationServletFilter.class);

}
