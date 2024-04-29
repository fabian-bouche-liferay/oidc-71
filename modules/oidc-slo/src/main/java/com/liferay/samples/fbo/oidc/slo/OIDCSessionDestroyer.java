package com.liferay.samples.fbo.oidc.slo;

import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.LifecycleAction;
import com.liferay.portal.kernel.events.SessionAction;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.security.sso.openid.connect.OpenIdConnectSession;
import com.liferay.portal.security.sso.openid.connect.provider.OpenIdConnectSessionProvider;
import com.liferay.samples.fbo.oidc.sid.exception.NoSuchOidcSidException;
import com.liferay.samples.fbo.oidc.sid.model.OidcSid;
import com.liferay.samples.fbo.oidc.sid.service.OidcSidLocalService;

import javax.servlet.http.HttpSession;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
		property = "key=" + PropsKeys.SERVLET_SESSION_DESTROY_EVENTS,
		service = LifecycleAction.class
	)
public class OIDCSessionDestroyer extends SessionAction {

	@Override
	public void run(HttpSession httpSession) throws ActionException {

		String sessionId = httpSession.getId();
		
		OpenIdConnectSession oidcSession = _openIdConnectSessionProvider.getOpenIdConnectSession(httpSession);
		if(oidcSession != null) {
			
			try {
				OidcSid sid = _oidcSidLocalService.getBySessionId(sessionId);
				_oidcSidLocalService.deleteOidcSid(sid);
			} catch (NoSuchOidcSidException e) {
				_log.debug("OIDC Session not found", e);
			}

		}
	
	}
	
	@Reference
	private OidcSidLocalService _oidcSidLocalService;
	
	@Reference
	private OpenIdConnectSessionProvider _openIdConnectSessionProvider;
	
	private static final Log _log = LogFactoryUtil.getLog(
			OIDCSessionDestroyer.class);

}
