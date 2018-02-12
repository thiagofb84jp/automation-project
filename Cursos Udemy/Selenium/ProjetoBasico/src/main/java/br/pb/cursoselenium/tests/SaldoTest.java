package br.pb.cursoselenium.tests;

import org.junit.Assert;
import org.junit.Test;

import br.pb.cursoselenium.core.BaseTest;
import br.pb.cursoselenium.core.Propriedades;
import br.pb.cursoselenium.pages.HomePage;
import br.pb.cursoselenium.pages.MenuPage;

public class SaldoTest extends BaseTest {

	HomePage page = new HomePage();
	MenuPage menu = new MenuPage();

	@Test
	public void testSaldoConta() {
		menu.acessarTelaPrincipal();
		Assert.assertEquals("500.00", page.obterSaldoConta(Propriedades.NOME_CONTA_ALTERADA));
	}

}
