package br.pb.arquivei;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.pb.core.PageObject;

public class LoginPage extends PageObject {

	String btnFecharPeriodoTestes = "//div[@id='trialExpiring']//button[@id='modal-close-btn']";
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public void campoEmail(String email) {
		driver.findElement(By.id("login-email")).clear();
		driver.findElement(By.id("login-email")).click();
		driver.findElement(By.id("login-email")).sendKeys(email);
	}

	public void campoSenha(String senha) {
		driver.findElement(By.id("login-password")).clear();
		driver.findElement(By.id("login-password")).click();
		driver.findElement(By.id("login-password")).sendKeys(senha);
	}

	public void btnEntrar() {
		driver.findElement(By.id("login-submit")).click();
	}

	public void validarMsgFalha() {
		boolean getResultado = driver.getPageSource().contains("Falha ao entrar.");
		Assert.assertTrue(getResultado);
	}
	
	public void fecharPopUpPeriodoTestes() {
		WebDriverWait wait = new WebDriverWait (driver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(btnFecharPeriodoTestes))).click();
	}
	
	public void validarAcessoSistema(String valorResultado) {
		WebElement popUpPeriodoTestes = driver.findElement(By.xpath(btnFecharPeriodoTestes));

		if(popUpPeriodoTestes.isDisplayed()) {
			fecharPopUpPeriodoTestes();
		}
		
		String getResultado = driver.findElement(By.xpath("//span[contains(text(), '" + valorResultado + "')]")).getText();
		Assert.assertEquals(valorResultado, getResultado);
	}
}