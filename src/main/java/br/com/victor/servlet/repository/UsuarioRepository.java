package br.com.victor.servlet.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import br.com.victor.servlet.model.Usuario;

public class UsuarioRepository {
	
	List<Usuario> usuarios = new ArrayList<>(); // tabela de usuarios (Banco de dados em memoria)
	
	public Usuario salvar(Usuario usuario) {
		usuario.setId(UUID.randomUUID());
		this.usuarios.add(usuario);
		return usuario;
	}

}
