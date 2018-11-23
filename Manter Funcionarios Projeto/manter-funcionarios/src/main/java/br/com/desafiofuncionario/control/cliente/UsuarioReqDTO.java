package br.com.desafiofuncionario.control.cliente;

import br.com.desafiofuncionario.model.Usuario;
import io.swagger.annotations.ApiModelProperty;

class UsuarioReqDTO {

	@ApiModelProperty(position = 1, required = true, value = "Nome do usuário", example= "Maria da Silva")
	private String nome;
	
	@ApiModelProperty(position = 2, required = true, value = "Login do usuário", example = "maria.silva")
	private String login;
	
	@ApiModelProperty(position = 3, required = true, value = "Senha do usuário", example = "123!@#$")
	private String senha;
	
	public Usuario transformar(final Usuario usuario) {
		
		usuario.setNome(this.nome);
		usuario.setLogin(this.login);
		usuario.setSenha(this.senha);
		
		return usuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
