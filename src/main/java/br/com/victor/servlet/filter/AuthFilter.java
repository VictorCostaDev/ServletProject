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

@WebFilter("/*")
public class AuthFilter implements Filter {


	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		String requestURI= httpServletRequest.getRequestURI();
		String method =  httpServletRequest.getMethod();
		
		if(requestURI.contains("cadastroDeUsuarioAPI") && method.toUpperCase().equals("GET")) {
			String header = httpServletRequest.getHeader("Authorization");
			HttpServletResponse httpServletResponse = (HttpServletResponse) response;
			
			if(!header.equals("Bearer dani@123")) {
				httpServletResponse.setStatus(401);
				return;
			}
		}
		
		chain.doFilter(request, response); 
	}
}
