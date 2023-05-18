package br.com.victor.servlet;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import com.google.gson.Gson;

import br.com.victor.servlet.model.Usuario;
import br.com.victor.servlet.repository.UsuarioRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/cadastroDeUsuarioAPI")
public class CadastroDeUsuarioAPI extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	UsuarioRepository repository = new UsuarioRepository();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String requestJSON = req.getReader().lines().collect(Collectors.joining());
		Gson gson = new Gson();
		Usuario usuario = gson.fromJson(requestJSON, Usuario.class);
		
		Usuario usuarioCriado = repository.salvar(usuario);
		
		System.out.println("Nome " + usuario.getNome() + "- Email: " + usuario.getEmail()); 
		
		String usuarioConvertido = gson.toJson(usuarioCriado);
		//resp.getWriter().append(usuarioConvertido);
		resp.setStatus(201);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Gson gson = new Gson();
		
		List<Usuario> todosUsuarios = repository.listarTodos();
		String todosUsuariosJSON = gson.toJson(todosUsuarios);
		
		resp.getWriter().append(todosUsuariosJSON);
	}

}
