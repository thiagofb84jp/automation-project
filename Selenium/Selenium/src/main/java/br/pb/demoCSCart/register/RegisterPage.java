package br.pb.demoCSCart.register;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.pb.core.PageObject;

public class RegisterPage extends PageObject{

	public RegisterPage(WebDriver driver) {
		super(driver);
	}
	
	public void clicarMinhaConta() {
		driver.findElement(By.xpath("//span[@class='hidden-phone']")).click();
	}
	
	public void realizarNovoRegistro() {
		driver.findElement(By.xpath("//div[@class='ty-account-info__buttons buttons-container']/a[contains(text(), 'Register')]")).click();
	}
	
	public void informarEmail(String email) {
		driver.findElement(By.id("email")).click();
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(email);
	}
	
	public void informarSenha(String senha) {
		driver.findElement(By.id("password1")).click();
		driver.findElement(By.id("password1")).clear();
		driver.findElement(By.id("password1")).sendKeys(senha);
	}
	
	public void confirmarSenha(String confirmarSenha) {
		driver.findElement(By.id("password2")).click();
		driver.findElement(By.id("password2")).clear();
		driver.findElement(By.id("password2")).sendKeys(confirmarSenha);
	}
	
	public void validarCaptcha() {
		driver.findElement(By.xpath("//span[@id='recaptcha-anchor']//div[@class='recaptcha-checkbox-checkmark']")).click();
	}
	
	public void registrar() {
		driver.findElement(By.xpath("//div[@class='ty-profile-field__buttons buttons-container']/button")).click();
	}
	
	public void validarMsgFalhaEmail(String valorResultado) {
		String getResultado = driver.findElement(By.xpath("//span[@id='email_error_message']/p")).getText();
		Assert.assertEquals(valorResultado, getResultado);
	}
	
	public void validarMsgFalhaSenha(String valorResultado) {
		String getResultado = driver.findElement(By.xpath("//span[@id='password1_error_message']/p")).getText();
		Assert.assertEquals(valorResultado, getResultado);
	}
	
	public void validarMsgFalhaConfirmSenha(String valorResultado) {
		String getResultado = driver.findElement(By.xpath("//span[@id='password2_error_message']/p")).getText();
		Assert.assertEquals(valorResultado, getResultado);
	}
	
	public void validarMsgRegistroSucesso(String valorResultado) {
		String getResultado = driver.findElement(By.xpath("")).getText();
		Assert.assertEquals(valorResultado, getResultado);
	}
}