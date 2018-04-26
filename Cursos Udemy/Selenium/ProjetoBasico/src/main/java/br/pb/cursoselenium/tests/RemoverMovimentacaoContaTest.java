package br.pb.cursoselenium.tests;

import org.junit.Assert;
import org.junit.Test;

import br.pb.cursoselenium.core.BaseTest;
import br.pb.cursoselenium.pages.ContasPage;
import br.pb.cursoselenium.pages.MenuPage;

public class RemoverMovimentacaoContaTest extends BaseTest {

	MenuPage menuPage = new MenuPage();
	ContasPage contasPage = new ContasPage();

	@Test
	public void testExcluirContaComMovimentacao() {
		menuPage.acessarTelaListarConta();

//		contasPage.clicarExcluirConta(Propriedades.NOME_CONTA_ALTERADA);
		contasPage.clicarExcluirConta("Conta com movimentacao");

		Assert.assertEquals("Conta em uso na movimentações", contasPage.obterMensagemErro());
	}

}
