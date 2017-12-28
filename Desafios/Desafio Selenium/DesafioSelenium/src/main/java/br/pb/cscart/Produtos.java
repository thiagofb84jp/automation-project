package br.pb.cscart;

import static br.pb.core.DriverFactory.getDriver;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.pb.core.DSL;
import br.pb.core.DriverFactory;

public class Produtos {

	private DSL dsl;

	@Before
	public void inicializa() {
		getDriver().get("http://demo.cs-cart.com");
		dsl = new DSL();
	}

	@After
	public void finaliza() {
		 DriverFactory.killDriver();
	}

	@Test
	public void pesquisarProdutos() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(getDriver(), 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("search_input")));

		// Realizando a primeira busca pelo item 'Batman'
		dsl.escrever("search_input", "Batman");
		dsl.clicarBotao(By.xpath(".//*[@id='tygh_main_container']/div[2]/div/div[1]/div[3]/div/div[1]/div/div/form/button"));
		dsl.clicarBotao("det_img_94");
		dsl.clicarBotao("button_cart_94");
		Thread.sleep(5000);
		dsl.clicarBotao(By.xpath("html/body/div[7]/div/div[2]/div[1]/a"));

		// Realizando a segunda busca pelo item 'PS3'
		dsl.escrever("search_input", "PS3");
		dsl.clicarBotao(By.xpath(".//*[@id='tygh_main_container']/div[2]/div/div[1]/div[3]/div/div[1]/div/div/form/button"));
		dsl.clicarBotao("det_img_90");
		dsl.clicarBotao("button_cart_90");
		Thread.sleep(5000);		
		dsl.clicarBotao(By.xpath("html/body/div[7]/div/div[2]/div[1]/a"));
		
		// Direcionando-se para o carrinho de compras
		dsl.clicarBotao(By.xpath("//div[@id='sw_dropdown_8']//a//i[@class='ty-minicart__icon ty-icon-moon-commerce filled']"));
		dsl.clicarBotao(By.xpath(".//*[@id='dropdown_8']//a[@class='ty-btn ty-btn__secondary']"));
				
		Assert.assertEquals("F.E.A.R. 3 (PS3) MX", dsl.obterTexto(By.xpath(".//*[@id='cart_items']/table/tbody/tr[1]/td[2]/a[1]")));
		Assert.assertEquals("Batman: Arkham City (X360)", dsl.obterTexto(By.xpath(".//*[@id='cart_items']/table/tbody/tr[2]/td[2]/a[1]")));
	}
}