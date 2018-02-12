package br.pb.cursoselenium.tests;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.pb.cursoselenium.core.BaseTest;
import br.pb.cursoselenium.core.Propriedades;
import br.pb.cursoselenium.pages.ContasPage;
import br.pb.cursoselenium.pages.MenuPage;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ContaTest extends BaseTest {

	MenuPage menuPage = new MenuPage();
	ContasPage contasPage = new ContasPage();

	@Test
	public void test1_InserirConta() {
		menuPage.acessarTelaInserirConta();

		contasPage.setNome(Propriedades.NOME_NOVA_CONTA);
		contasPage.salvar();

		Assert.assertEquals("Conta adicionada com sucesso!", contasPage.obterMensagemSucesso());
	}

	@Test
	public void test2_AlterarConta() {
		menuPage.acessarTelaListarConta();
		
		contasPage.clicarAlterarConta(Propriedades.NOME_NOVA_CONTA);
		
		contasPage.setNome(Propriedades.NOME_CONTA_ALTERADA);
		contasPage.salvar();
		
		Assert.assertEquals("Conta alterada com sucesso!", contasPage.obterMensagemSucesso());
	}
	
	@Test
	public void test3_InserirContaMesmoNome() {
		menuPage.acessarTelaInserirConta();
		
		contasPage.setNome(Propriedades.NOME_CONTA_ALTERADA);
		contasPage.salvar();
		
		Assert.assertEquals("Já existe uma conta com esse nome!", contasPage.obterMensagemErro());
	}

}