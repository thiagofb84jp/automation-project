package br.com.desafiofuncionario.control.cliente;

import br.com.desafiofuncionario.model.Usuario;
import io.swagger.annotations.ApiModelProperty;

class UsuarioRespDTO {

	@ApiModelProperty(position = 1, value = "Identificador do usuário", example = "1")
	private Long id;
	
	@ApiModelProperty(position = 2, value = "Nome do usuário", example= "Maria da Silva")
	private String nome;
	
	@ApiModelProperty(position = 3, value = "Login do usuário", example = "maria.silva")
	private String login;
	
	@ApiModelProperty(position = 4, value = "Status do usuário")
	private boolean ativo;
	
	public UsuarioRespDTO(final Usuario usuario) {
		this.setId(usuario.getId());
		this.setLogin(usuario.getLogin());
		this.setNome(usuario.getNome());
		this.setAtivo(usuario.isAtivo());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	
}
