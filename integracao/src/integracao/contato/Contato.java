package integracao.contato;

import integracao.endereco.Endereco;
import integracao.pessoa.Pessoa;

public class Contato {

	private Pessoa pessoa;
	private Endereco endereco;

	public Contato(Pessoa pessoa, Endereco endereco) {
		this.pessoa = pessoa;
		this.endereco = endereco;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String apresentarDados() {
		return "Dados de testes apresentados: \n" + "Nome completo: " + pessoa.getNome() + "\n" 
				+ "CPF: " + pessoa.getCpf() + "\nEndereço: " + endereco.getRua();
	}
}