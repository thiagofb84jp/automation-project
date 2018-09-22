package br.pb.devin.calculadorasimples;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import br.pb.core.PageObject;

public class CalculadoraSimplesPage extends PageObject{
	
	public CalculadoraSimplesPage(WebDriver driver) {
		super(driver);
	}
	
	public void obterValor1(String valor1) {
		driver.findElement(By.id("valor1")).sendKeys(valor1);
	}
	
	public void obterValor2(String valor2) {
		driver.findElement(By.id("valor2")).sendKeys(valor2);
	}
	
	public void somar() {
		WebElement element = driver.findElement(By.id("oper"));
		Select combo = new Select(element);
		combo.selectByVisibleText("Somar");
		driver.findElement(By.xpath("//input[@value='Calcular']")).click();
	}
	
	public void subtrair() {
		WebElement element = driver.findElement(By.id("oper"));
		Select combo = new Select(element);
		combo.selectByVisibleText("Subtrair");
		driver.findElement(By.xpath("//input[@value='Calcular']")).click();
	}
	
	public void multiplicar() {
		WebElement element = driver.findElement(By.id("oper"));
		Select combo = new Select(element);
		combo.selectByVisibleText("Multiplicar");
		driver.findElement(By.xpath("//input[@value='Calcular']")).click();
	}

	public void dividir() {
		WebElement element = driver.findElement(By.id("oper"));
		Select combo = new Select(element);
		combo.selectByVisibleText("Dividir");
		driver.findElement(By.xpath("//input[@value='Calcular']")).click();
	}
	
	public void validarResultado(String valorResultado) {
		String getResultado = driver.findElement(By.id("res")).getAttribute("value");
		Assert.assertEquals(valorResultado, getResultado);
	}
}