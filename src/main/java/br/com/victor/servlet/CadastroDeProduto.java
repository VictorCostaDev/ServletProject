package br.com.victor.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/cadastroDeProduto")
public class CadastroDeProduto extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// todos os parametros da request
		String name = req.getParameter("name");
		String price = req.getParameter("price");
		String quantity = req.getParameter("quantity");
		String code = req.getParameter("code");
		
		System.out.println("Nome = " + name);
		System.out.println("Preço = " + price);
		System.out.println("Quantidade = " + quantity);
		System.out.println("Código = " + code);
	}
}
