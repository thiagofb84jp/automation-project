package br.pb.todoapp;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.pb.signup.PageObject;

public class SignInPage extends PageObject {

	public SignInPage(WebDriver driver) {
		super(driver);
	}

	public void obterEmail(String email) {
		driver.findElement(By.id("user_email")).sendKeys(email);
	}

	public void obterSenha(String password) {
		driver.findElement(By.id("user_password")).sendKeys(password);
	}

	public void logar() {
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();
	}
	
	public void obterLink(String link) {
		driver.findElement(By.linkText(link)).click();
	}
	
	public void validarMsgFalha(String valorResultado) {
		String getResultado = driver.findElement(By.xpath("//div[@class='alert alert-warning']")).getText();
		Assert.assertEquals(valorResultado, getResultado);
	}
	
	public void validarMsgSucesso(String valorResultado) {
		String getResultado = driver.findElement(By.xpath("//div[@class='alert alert-info']")).getText();
		Assert.assertEquals(valorResultado, getResultado);
	}
}