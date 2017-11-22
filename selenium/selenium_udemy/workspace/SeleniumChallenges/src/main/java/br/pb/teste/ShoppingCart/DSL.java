package br.pb.teste.ShoppingCart;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DSL {
	
	private WebDriver driver;
	
	public DSL(WebDriver driver) {
		this.driver = driver;
	}
	
	/***************** TextField e TextArea *****************/

	public void escrever(By by, String texto) {
		driver.findElement(by).clear();
		driver.findElement(by).sendKeys(texto);
	}
	
	public void escrever(String id_campo, String texto) {
		escrever(By.id(id_campo), texto);
	}
		
	public String obterValorCampo(String id_campo) {
		return driver.findElement(By.id(id_campo)).getAttribute("value");
	}

	/***************** Botões *****************/
	
	public void clicarBotao(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}
}
