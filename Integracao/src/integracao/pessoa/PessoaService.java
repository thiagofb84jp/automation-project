package integracao.pessoa;

public class PessoaService {

	public Pessoa getPessoa(String nome, String cpf) {
		return new Pessoa(nome, cpf);
	}
}