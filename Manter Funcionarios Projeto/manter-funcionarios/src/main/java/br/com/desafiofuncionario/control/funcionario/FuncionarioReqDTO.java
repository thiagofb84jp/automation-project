package br.com.desafiofuncionario.control.funcionario;

import br.com.desafiofuncionario.enums.Ocupacao;
import br.com.desafiofuncionario.enums.Setor;
import br.com.desafiofuncionario.model.Funcionario;
import io.swagger.annotations.ApiModelProperty;

class FuncionarioReqDTO {

	@ApiModelProperty(position = 1, value = "Nome do funcionário", example = "João de Souza")
	private String nome;
	
	@ApiModelProperty(position = 2, value = "Matrícula do funcionário", example = "423552")
	private String matricula;
	
	@ApiModelProperty(position = 3, value = "Ocupação do funcionário", allowableValues = "ATENDENTE, COORDENADOR, GERENTE")
	private Ocupacao ocupacao;
	
	@ApiModelProperty(position = 4, value = "Setor do funcionário", allowableValues = "RH,ATENDIMENTO,FINANCEIRO")
	private Setor setor;
	
	public Funcionario transformar(final Funcionario funcionario) {
		
		funcionario.setNome(this.nome);
		funcionario.setMatricula(this.matricula);
		funcionario.setOcupacao(this.ocupacao);
		funcionario.setSetor(this.setor);
		
		return funcionario;
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
}
