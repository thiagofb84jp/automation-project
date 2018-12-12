package br.pb.devin.calculadoracomplexa;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.pb.core.PageObject;

public class CalculadoraComplexaPage extends PageObject{

	public CalculadoraComplexaPage(WebDriver driver) {
		super(driver);
	}
	
	public void obterValor(String valorCalc) {
		driver.findElement(By.xpath("//input[@value='" + valorCalc + "']")).click();
	}
	
	public void operador(String operador) {
		driver.findElement(By.xpath("//input[@value='"+ operador +"']")).click();
	}
	
	public void obterResultado() {
		driver.findElement(By.xpath("//input[@value='=']")).click();;
	}
	
	public void validarResultado(String valorResultado) {
		String getResultado = driver.findElement(By.id("visor")).getAttribute("value");
		Assert.assertEquals(valorResultado, getResultado);
	}
}