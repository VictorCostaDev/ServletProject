package br.com.victor.servlet;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/helloWorld")
public class PrimeiroServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("Método: " + request.getMethod());
		response.getWriter().append("Primeiro Servlet funcionando!");
	}
	
}
