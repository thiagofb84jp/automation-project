package integracao.contato;

import org.junit.Assert;
import org.junit.Test;

import integracao.contato.Contato;
import integracao.contato.ContatoService;

public class ContatoServiceIntegrationTest {

	private ContatoService contatoService = new ContatoService();

	@Test
	public void criaContato () {

		String nomePessoa = "Chefe";
		String endereco = "Rua do código, 123";
		Contato contato = contatoService.criaContato(nomePessoa, endereco);

		Assert.assertEquals(nomePessoa, contato.getPessoa().getNome());
		Assert.assertEquals(endereco, contato.getEndereco().getRua());
	}
}
