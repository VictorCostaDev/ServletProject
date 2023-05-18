package br.com.victor.servlet;

import java.io.IOException;
import java.util.stream.Collectors;

import com.google.gson.Gson;

import br.com.victor.servlet.model.Book;
import br.com.victor.servlet.repository.BookRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/cadastroDeLivro")
public class registerOfBookAPI extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// InputStream -> String
		String requestJSON = req.getReader().lines().collect(Collectors.joining());
		
		// String -> Objeto
		Gson gson = new Gson();
		Book book = gson.fromJson(requestJSON, Book.class); // Enviado pela request
		
		BookRepository repository = new BookRepository();
		Book bookRegistered = repository.save(book);
		
		resp.getWriter().append(gson.toJson(bookRegistered));
		resp.setStatus(201);
	}

}
