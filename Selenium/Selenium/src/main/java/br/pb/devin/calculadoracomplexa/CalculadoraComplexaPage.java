package br.pb.devin.calculadoracomplexa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.pb.core.PageObject;

public class CalculadoraComplexaPage extends PageObject{

	public CalculadoraComplexaPage(WebDriver driver) {
		super(driver);
	}
	
	public void obterValor(String valorCalc) {
		driver.findElement(By.xpath("//input[@value='"+ valorCalc +"']"));
	}
	
	public void operador(String operador) {
		driver.findElement(By.xpath("//input[@value='"+ operador +"']"));
	}
	
	public void obterResultado() {
		driver.findElement(By.xpath("//input[@value='=']"));
	}
	
	//Resolver o problema relacionado ao obterValorResultado
	//Teste de visualização do GIT. Caso este arquivo seja versionado
	//Isso quer dizer que deu certo. :)
	
//	public String obterValorCampo(String id) {
//		return driver.findElement(By.id(id)).getAttribute("value");
//	}	
	
//	public void validarResultado(String resultado) {
//		String obterResultado = driver.findElement(By.id("visor")).getAttribute("value");
//		Assert.assertEquals(resultado, obterResultado);
//	}	
}