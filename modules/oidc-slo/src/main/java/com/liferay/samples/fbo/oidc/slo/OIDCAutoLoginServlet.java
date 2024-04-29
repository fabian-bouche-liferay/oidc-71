package com.liferay.samples.fbo.oidc.slo;

import com.liferay.portal.kernel.util.ParamUtil;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
	    immediate = true,
	    property = {
	        "osgi.http.whiteboard.context.path=/",
	        "osgi.http.whiteboard.servlet.pattern=/oidcautologin"
	    },
	    service = Servlet.class
	)
public class OIDCAutoLoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final String HOME = "/web/guest/home";
	
	@Override
	protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {

		RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher("/oidclogin.jsp");
		httpServletRequest.setAttribute("oidc_provider_name", ParamUtil.get(httpServletRequest, "provider", ""));
		httpServletRequest.setAttribute("origin", HOME);
		
		Cookie oidcProviderCookie = new Cookie(OIDCConstants.OIDC_PROVIDER, "");
		oidcProviderCookie.setPath("/");
		oidcProviderCookie.setMaxAge(0);
		httpServletResponse.addCookie(oidcProviderCookie);
		
		requestDispatcher.include(httpServletRequest, httpServletResponse);
	}	
	
    @Reference(
            target = "(osgi.web.symbolicname=com.liferay.samples.fbo.oidc.slo)"
        )
    private ServletContext servletContext;
}
