package br.pb.todoapp;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.pb.core.PageObject;

public class RegisterPage extends PageObject {

	public RegisterPage(WebDriver driver) {
		super(driver);
	}
	
	public void obterNome(String nome) {
		driver.findElement(By.id("user_name")).sendKeys(nome);
	}
	
	public void obterEmail(String email) {
		driver.findElement(By.id("user_email")).sendKeys(email);
	}
	
	public void obterSenha(String senha) {
		driver.findElement(By.id("user_password")).sendKeys(senha);
	}
	
	public void confirmarSenha(String senha) {
		driver.findElement(By.id("user_password_confirmation")).sendKeys(senha);
	}

	public void salvarRegistro() {
		driver.findElement(By.xpath("//input[@value='Sign up']")).click();
	}
	
	public void obterLink(String link) {
		driver.findElement(By.linkText(link)).click();
	}
	
	public List<String> obterErros() {
		List<WebElement> erros = driver.findElements(By.xpath("//div[@class='alert alert-danger alert-block']//li"));		
		List<String> retorno = new ArrayList<String>();		
		for (WebElement erro : erros) {
			retorno.add(erro.getText());
		}		
		return retorno;
	}
	
	public void validarMsgSucesso(String valorResultado) {
		String getResultado = driver.findElement(By.xpath("//div[@class='alert alert-info']")).getText();
		Assert.assertEquals(valorResultado, getResultado);
	}
}