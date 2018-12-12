package br.com.desafiofuncionario.control.funcionario;

import br.com.desafiofuncionario.enums.Ocupacao;
import br.com.desafiofuncionario.enums.Setor;
import br.com.desafiofuncionario.model.Funcionario;
import io.swagger.annotations.ApiModelProperty;

class FuncionarioRespDTO {

	@ApiModelProperty(position = 1, value = "Identificador do usuário", example = "1")
	private Long id;
	
	@ApiModelProperty(position = 2, value = "Nome do funcionário", example = "João de Souza")
	private String nome;
	
	@ApiModelProperty(position = 3, value = "Matrícula do funcionário", example = "423552")
	private String matricula;
	
	@ApiModelProperty(position = 4, value = "Ocupação do funcionário", allowableValues = "ATENDENTE, COORDENADOR, GERENTE")
	private Ocupacao ocupacao;
	
	@ApiModelProperty(position = 5, value = "Setor do funcionário", allowableValues = "RH,ATENDIMENTO,FINANCEIRO")
	private Setor setor;
	
	@ApiModelProperty(position = 6, value = "Status do funcionário")
	private boolean ativo;
	
	public FuncionarioRespDTO(final Funcionario funcionario) {
		this.setId(funcionario.getId());
		this.setNome(funcionario.getNome());
		this.setOcupacao(funcionario.getOcupacao());
		this.setSetor(funcionario.getSetor());
		this.setAtivo(funcionario.isAtivo());
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