package integracao.contato;

import integracao.endereco.Endereco;
import integracao.endereco.EnderecoService;
import integracao.pessoa.Pessoa;
import integracao.pessoa.PessoaService;

public class ContatoService {

	private PessoaService pessoaService = new PessoaService();

	private EnderecoService enderecoService = new EnderecoService(); 

	public Contato criaContato(String nome, String cpf, String rua) {
		Pessoa pessoa = pessoaService.getPessoa(nome, cpf);
		Endereco endereco = enderecoService.getEndereco(rua);
		
		return new Contato(pessoa, endereco);
	}

}