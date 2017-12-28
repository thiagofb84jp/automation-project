package br.pb.cursoselenium.tests;

import org.junit.Assert;
import org.junit.Test;

import br.pb.cursoselenium.core.BaseTest;
import br.pb.cursoselenium.pages.ContasPage;
import br.pb.cursoselenium.pages.MenuPage;

public class ContaTest extends BaseTest {

	MenuPage menuPage = new MenuPage();
	ContasPage contasPage = new ContasPage();

	@Test
	public void testInserirConta() {
		menuPage.acessarTelaInserirConta();

		contasPage.setNome("conta_002");
		contasPage.salvar();

		Assert.assertEquals("Conta adicionada com sucesso!", contasPage.obterMensagemSucesso());
	}

	@Test
	public void testAlterarConta() {
		menuPage.acessarTelaListarConta();
		
		contasPage.clicarAlterarConta("conta_002");
		
		contasPage.setNome("conta_teste_alterada");
		contasPage.salvar();
		
		Assert.assertEquals("Conta alterada com sucesso!", contasPage.obterMensagemSucesso());
	}
	
	@Test
	public void testInserirContaMesmoNome() {
		menuPage.acessarTelaInserirConta();
		
		contasPage.setNome("conta_teste_alterada");
		contasPage.salvar();
		
		Assert.assertEquals("Já existe uma conta com esse nome!", contasPage.obterMensagemErro());
	}

}
