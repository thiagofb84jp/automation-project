package br.com.desafiofuncionario.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.desafiofuncionario.enums.Ocupacao;
import br.com.desafiofuncionario.enums.Setor;

@Entity
@Table(name = "T_FUNCIONARIO")
public class Funcionario {

	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private String matricula; //Sem tratamento quando informado um valor diferente de String
	@Enumerated(EnumType.STRING)
	private Ocupacao ocupacao;
	@Enumerated(EnumType.STRING)
	private Setor setor;
	private boolean ativo = true; //Sem valor default, será criado como 'false'

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

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Ocupacao getOcupacao() {
		return ocupacao;
	}

	public void setOcupacao(Ocupacao ocupacao) {
		this.ocupacao = ocupacao;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

}
