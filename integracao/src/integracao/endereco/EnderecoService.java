package integracao.endereco;

public class EnderecoService {

	public Endereco getEndereco(String rua) {
		return new Endereco(rua);
	}

}
