package com.liferay.samples.fbo.oidc.slo;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.BaseFilter;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.security.sso.openid.connect.OpenIdConnectProvider;
import com.liferay.portal.security.sso.openid.connect.OpenIdConnectProviderRegistry;
import com.liferay.portal.security.sso.openid.connect.OpenIdConnectSession;
import com.liferay.portal.security.sso.openid.connect.provider.OpenIdConnectSessionProvider;
import com.liferay.samples.fbo.oidc.sid.service.OidcSidLocalService;

import java.net.URLDecoder;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;


@Component(
		immediate = true,
		property = {
			"before-filter=Auto Login Filter", "servlet-context-name=",
			"servlet-filter-name=SSO OpenId Connect Reconnect Filter",
			"url-pattern=/c/portal/login/*" 
		},
		service = Filter.class
	)
public class OIDCReconnectServletFilter extends BaseFilter {

	@Override
	protected Log getLog() {
		return _log;
	}
	
	@Override
	protected void processFilter(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws Exception {
		
		HttpSession session = request.getSession();				
		OpenIdConnectSession oidcSession = _openIdConnectSessionProvider.getOpenIdConnectSession(session);
		if(oidcSession == null && !request.getRequestURI().startsWith("/o/oidcautologin")) {
			
			String oidcProviderName = getOIDCProvider(request);
			if(oidcProviderName != null) {
				OpenIdConnectProvider oidcProvider = _openIdConnectProviderRegistry.getOpenIdConnectProvider(oidcProviderName);
				response.sendRedirect("/o/oidcautologin?provider=" + oidcProvider.getName()); 
				return;
			}

		}
		
		super.processFilter(request, response, filterChain);
	}
	
	private String getOIDCProvider(HttpServletRequest request) {
		
		Cookie[] cookies = request.getCookies();
		for(int i = 0; i < cookies.length; i++) {
			if(OIDCConstants.OIDC_PROVIDER.equals(cookies[i].getName())) {
				return URLDecoder.decode(cookies[i].getValue());
			}
		}
		
		return null;
		
	}
	
	@Reference
	private OidcSidLocalService _oidcSidLocalService;
	
	@Reference
	private OpenIdConnectSessionProvider _openIdConnectSessionProvider;

	@Reference
	private Portal _portal;
	
	private static final Log _log = LogFactoryUtil.getLog(
			OIDCReconnectServletFilter.class);

	@Reference
	private OpenIdConnectProviderRegistry _openIdConnectProviderRegistry;
}
