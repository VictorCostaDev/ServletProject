package br.com.victor.servlet.filter;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebFilter("/cadastroDeLivro")
public class AuthFilterBook implements Filter {

	private final String authorizationToken = "Bearer authorized_user";
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		HttpServletResponse httpServletResponse = (HttpServletResponse) response;
		
		String requestMethod = httpServletRequest.getMethod();
		
		if(requestMethod.toUpperCase().equals("GET")) {
			String requestHeader = httpServletRequest.getHeader("Authorization");
			
			if (!requestHeader.equals(authorizationToken)) {
				httpServletResponse.setStatus(401);
				return;
			}
		}
		
		chain.doFilter(httpServletRequest, response);
		
	}

}
