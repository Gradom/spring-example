package it.dg.springexample.configuration.security;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;
import org.springframework.stereotype.Component;

/**
 * @author Grasso Domenico
 *
 *         Time: 16:23:03 Date: 28 apr 2020
 * 
 *         In a web application with views ( jsp,ecc ), managed by a
 *         ViewResolverBean, in case of Bad credentials, Spring render a html
 *         code for the 401 status as well. But in a Rest context is not the
 *         best way, so we configurre this class in order to render a good
 *         response to manage
 */
@Component
public class BasicAuthenticationEntryPointConfig extends BasicAuthenticationEntryPoint {

	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException authException) throws IOException {
		response.setStatus(HttpStatus.UNAUTHORIZED.value());
		response.getWriter().write("Error for bad credentials!!!");

	}

	@Override
	public void afterPropertiesSet() {
		setRealmName("SpringExample");
		super.afterPropertiesSet();
	}
}
