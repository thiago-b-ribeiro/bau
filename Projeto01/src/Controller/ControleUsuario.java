package Controller;

import Model.Usuario;

public class ControleUsuario {

	Usuario usuario = new Usuario();
	
	public void cadastraUsuario (String nome, int idade, String genero) {
		usuario.setNome(nome);
		usuario.setIdade(idade);
		usuario.setGenero(genero);
	}
	
}
