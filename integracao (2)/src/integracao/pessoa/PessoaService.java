package integracao.pessoa;

public class PessoaService {

	public Pessoa getPessoa(String nome) {
		return new Pessoa(nome);
	}

}
