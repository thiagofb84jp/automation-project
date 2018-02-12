package br.pb.automationpracticle;

import static br.pb.core.DriverFactory.getDriver;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.pb.core.DSL;
import br.pb.core.DriverFactory;

public class Authentication {

	private DSL dsl;

	String msgErro1 = "Invalid email address.";
	String msgErro2 = "An account using this email address has already been registered. Please enter a valid password or request a new one.";
	String msgErro3 = "An email address required.";
	String msgErro4 = "Invalid email address.";
	String msgErro5 = "Password is required.";
	String msgErro6 = "Authentication failed.";
	
	String msgInfo1 = "YOUR PERSONAL INFORMATION";
	String msgInfo2 = "Welcome to your account. Here you can manage all of your personal information and orders.";
	
	@Before
	public void inicializa() {
		getDriver().get("http://www.automationpractice.com/");
		dsl = new DSL();

		dsl.clicarLink("Sign in");
	}

	@After
	public void finaliza() {
		DriverFactory.killDriver();
	}

	/*
	 * Create an account
	 */
	@Test
	public void testCriarNovoUsuarioComCamposVazios() {
		dsl.clicarBotao("SubmitCreate");

		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='create_account_error']//ol//li")));

		List<String> erros = dsl.obterErros();

		Assert.assertEquals(1, erros.size());
		Assert.assertTrue(erros.containsAll(Arrays.asList(msgErro1)));

		/*
		 * List<WebElement> erros = DriverFactory.getDriver()
		 * .findElements(By.xpath(".//*[@id='create_account_error']//ol//li"));
		 * 
		 * List<String> msgs = new ArrayList<String>(); for (WebElement el : erros) {
		 * msgs.add(el.getText()); }
		 * 
		 * Assert.assertEquals(1, erros.size());
		 * Assert.assertTrue(msgs.containsAll(Arrays.asList("Invalid email address.")));
		 * 
		 */
	}

	@Test
	public void testCriarNovoUsuarioComEmailInvalido() {
		dsl.escrever("email_create", "joao@#$%%.com");
		dsl.clicarBotao("SubmitCreate");

		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='create_account_error']//ol//li")));

		List<String> erros = dsl.obterErros();

		Assert.assertEquals(1, erros.size());
		Assert.assertTrue(erros.containsAll(Arrays.asList(msgErro1)));

	}

	@Test
	public void testCriarNovoUsuarioExistente() {
		dsl.escrever("email_create", "joseph@gmail.com");
		dsl.clicarBotao("SubmitCreate");

		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='create_account_error']//ol//li")));

		List<String> erros = dsl.obterErros();

		Assert.assertEquals(1, erros.size());
		Assert.assertTrue(erros.containsAll(Arrays.asList(msgErro2)));
	}
	
	@Test
	public void testCriarNovoUsuarioComSucesso() {
		dsl.escrever("email_create", "joao@gmail.com");
		dsl.clicarBotao("SubmitCreate");

		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='account_creation']//h3")));
		
		Assert.assertEquals(msgInfo1, dsl.obterTexto(By.xpath("//div[@class='account_creation']//h3")));
	}
	
	/*
	 * Already registered?
	 */
	@Test
	public void testAcessarSistemaComCamposVazios() {
		dsl.clicarBotao("SubmitLogin");

		List<String> erros = dsl.obterErros();

		Assert.assertEquals(1, erros.size());
		Assert.assertTrue(erros.containsAll(Arrays.asList(msgErro3)));		
	}
	
	@Test
	public void testAcessarSistemaComEmailInvalido() {
		dsl.escrever("email", "joao@#$%%.com");
		dsl.clicarBotao("SubmitLogin");
		
		List<String> erros = dsl.obterErros();

		Assert.assertEquals(1, erros.size());
		Assert.assertTrue(erros.containsAll(Arrays.asList(msgErro4)));
	}
	
	@Test
	public void testAcessarSistemaSemSenha() {
		dsl.escrever("email", "joseph@gmail.com");
		dsl.clicarBotao("SubmitLogin");
		
		List<String> erros = dsl.obterErros();

		Assert.assertEquals(1, erros.size());
		Assert.assertTrue(erros.containsAll(Arrays.asList(msgErro5)));
	}
	
	@Test
	public void testAcessarSistemaComSenhaInvalida() {
		dsl.escrever("email", "joseph@gmail.com");
		dsl.escrever("passwd", "abcd_111");
		dsl.clicarBotao("SubmitLogin");
		
		List<String> erros = dsl.obterErros();

		Assert.assertEquals(1, erros.size());
		Assert.assertTrue(erros.containsAll(Arrays.asList(msgErro6)));
	}
	
	@Test
	public void testAcessarSistemaComSucesso() {
		dsl.escrever("email", "joseph@gmail.com");
		dsl.escrever("passwd", "abcd_123");
		dsl.clicarBotao("SubmitLogin");
		
		Assert.assertEquals(msgInfo2, dsl.obterTexto(By.xpath("//div[@id='center_column']//p[@class='info-account']")));
	}
}