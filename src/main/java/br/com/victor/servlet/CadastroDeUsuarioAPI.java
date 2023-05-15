package br.com.victor.servlet;

import java.io.IOException;
import java.util.stream.Collectors;

import com.google.gson.Gson;

import br.com.victor.servlet.model.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/cadastroDeUsuarioAPI")
public class CadastroDeUsuarioAPI extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);
		// ** pegar o json da requisicao -> req.getInputStream()
		
		// ** Transformar a InputStream() em uma String 
		String requestJSON = req.getReader().lines().collect(Collectors.joining());
		// {	"name": "Victor",	"email": "victor@gmail.com"}
		
		// ** transformar a String em um Objeto (Usar a dependencia gson)
		Gson gson = new Gson();
		var usuario = gson.fromJson(requestJSON, Usuario.class);
		
		System.out.println("Nome " + usuario.getNome() + "- Email: " + usuario.getEmail()); 
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doGet(req, resp);
	}

}
