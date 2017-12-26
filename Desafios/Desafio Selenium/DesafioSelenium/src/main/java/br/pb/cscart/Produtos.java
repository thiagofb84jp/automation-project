package br.pb.cscart;

import static br.pb.core.DriverFactory.getDriver;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import br.pb.core.DSL;

public class Produtos {

	private DSL dsl;

	@Before
	public void inicializa() {
		dsl = new DSL();
		getDriver().get("http://demo.cs-cart.com/");
	}

	@After
	public void finaliza() {
//		killDriver();
	}

	@Test
	public void pesquisarProdutos() {		
		dsl.selecionarArea(By.xpath(".//*[@id='search_input']"));		
		dsl.escrever("search_input", "Batman");
		dsl.clicarBotao(
				By.xpath(".//*[@id='tygh_main_container']/div[2]/div/div[1]/div[3]/div/div[1]/div/div/form/button")); // Clicando no item de pesquisa
		dsl.clicarBotao("det_img_94"); // Selecionando o item
		dsl.clicarBotao("button_cart_94"); // Adicionado ao carrinho de compras
		Assert.assertEquals("Batman: Arkham City (X360)", dsl.obterTexto(By.className("ty-product-notification__product-name"))); // Validando se de fato foi adicionado
		dsl.clicarBotao(By.xpath("html/body/div[7]/h1/span"));// Fechando o carrinho de compras
				
		dsl.escrever("search_input", "PS3");
		dsl.clicarBotao(
				By.xpath(".//*[@id='tygh_main_container']/div[2]/div/div[1]/div[3]/div/div[1]/div/div/form/button")); // Clicando no item de pesquisa
		dsl.clicarBotao("det_img_90");
		dsl.clicarBotao("button_cart_90");
		Assert.assertEquals("F.E.A.R. 3 (PS3) MX", dsl.obterTexto(By.className("ty-product-notification__product-name")));
		dsl.clicarBotao(By.xpath("html/body/div[7]/h1/span"));
		
		dsl.clicarBotao(By.xpath(".//*[@id='sw_dropdown_8']/a/i"));
		dsl.clicarBotao(".//*[@id='dropdown_8']/div/div[2]/div[1]/a");
		Assert.assertEquals("F.E.A.R. 3 (PS3) MX", dsl.obterTexto(By.className("ty-cart-content__product-title")));
		Assert.assertEquals("Batman: Arkham City (X360)", dsl.obterTexto(By.className("ty-cart-content__product-title")));	
	}

}
