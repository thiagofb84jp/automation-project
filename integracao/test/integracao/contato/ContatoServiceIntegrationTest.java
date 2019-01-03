package integracao.contato;

import org.junit.Assert;
import org.junit.Test;

import integracao.contato.Contato;
import integracao.contato.ContatoService;

public class ContatoServiceIntegrationTest {

	private ContatoService contatoService = new ContatoService();

	@Test
	public void criaContato () {
		
		String nome = "Nathan Davi Alves";
		String cpf = "059.568.984-10";
		String endereco = "Travessa Professora Maria Guita, 899";
		
		Contato contato = contatoService.criaContato(nome, cpf, endereco);
		System.out.println(contato.apresentarDados());
		
		Assert.assertEquals(nome, contato.getPessoa().getNome());
		Assert.assertEquals(cpf, contato.getPessoa().getCpf());
		Assert.assertEquals(endereco, contato.getEndereco().getRua());
	}
}