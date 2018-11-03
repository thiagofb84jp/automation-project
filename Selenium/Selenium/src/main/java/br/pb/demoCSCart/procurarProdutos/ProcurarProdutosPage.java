package br.pb.demoCSCart.procurarProdutos;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.pb.core.PageObject;

public class ProcurarProdutosPage extends PageObject{

	public ProcurarProdutosPage(WebDriver driver) {
		super(driver);
	}
	
	public void infomarProduto(String produto) {
		driver.findElement(By.id("search_input")).click();
		driver.findElement(By.id("search_input")).clear();
		driver.findElement(By.id("search_input")).sendKeys(produto);
	}
	
	public void pesquisar() {
		driver.findElement(By.xpath("//button[@title='Search']/i")).click();
	}
	
	public void selecionarProduto(String produto) {
		driver.findElement(By.xpath("//div[@class='ty-grid-list__item-name']//a[@title='" + produto + "']")).click();
		//driver.findElement(By.xpath("//div[@class='ty-grid-list__item-name']//a[contains(@title='" + produto + "')]")).click();
	}
	
	public void adicionarCarrinho() {
		driver.findElement(By.xpath("//button[@class='ty-btn__primary ty-btn__big ty-btn__add-to-cart cm-form-dialog-closer ty-btn']")).click();
	}
	
	public void fecharJanela() {
		WebDriverWait wait = new WebDriverWait (driver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(@class,'cm-notification-close close')]"))).click();
	}
	
	public void clicarLogoDemoStore() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='ty-logo-container']/a/img")).click();
	}
	
	public void clicarCarrinhoCompras() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='sw_dropdown_8']/a/i")).click();
	}
	
	public void verificarCarro() {
		driver.findElement(By.xpath("//div[@class='ty-float-left']/a")).click();
	}
	
	public void validarResultado(String valorResultado) {
		String getResultado = driver.findElement(By.xpath("//tbody/tr/td//a[contains(text(),'" + valorResultado + "')]")).getText();
		Assert.assertEquals(valorResultado, getResultado);
	}
}