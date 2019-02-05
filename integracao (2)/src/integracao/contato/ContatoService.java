package integracao.contato;

import integracao.endereco.Endereco;
import integracao.endereco.EnderecoService;
import integracao.pessoa.Pessoa;
import integracao.pessoa.PessoaService;

public class ContatoService {

	private PessoaService pessoaService = new PessoaService();

	private EnderecoService enderecoService = new EnderecoService(); 

	public Contato criaContato(String nome, String rua) {
		Pessoa pessoa = pessoaService.getPessoa(nome);
		Endereco endereco = enderecoService.getEndereco(rua);
		return new Contato(pessoa, endereco);
	}

}
