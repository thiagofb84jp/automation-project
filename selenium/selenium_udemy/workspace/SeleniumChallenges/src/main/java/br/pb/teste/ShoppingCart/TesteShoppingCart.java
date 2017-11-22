package br.pb.teste.ShoppingCart;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteShoppingCart {

	private WebDriver driver;
	private DSL dsl;

	@Before
	public void inicializa() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.cs-cart.com");
		dsl = new DSL(driver);
		
		dsl.clicarBotao(".//*[@id='sw_dropdown_4']/a/span");
		dsl.clicarBotao(".//*[@id='account_info_4']/div[2]/a[2]");
	}
	
	@After
	public void finaliza() {
		driver.quit();
	}
	
	@Test
	public void cadastrarNovaContaComCamposVazios() {
		dsl.clicarBotao(".//*[@id='tygh_main_container']/div[3]/div/div[2]/div[1]/div/div/div/form/div[7]/button");
		
		Assert.assertEquals("O endereço de e-mail no campo E-mail é inválido.", driver.findElement(By.id("email_error_message")).getText());
		Assert.assertEquals("O campo Senha é obrigatório.", driver.findElement(By.id("password1_error_message")).getText());
		Assert.assertEquals("O campo Confirmação de senha é obrigatório.", driver.findElement(By.id("password2_error_message")).getText());		
	}
	
	@Test
	public void cadastrarNovaContaApenasComEmail() {
		dsl.escrever("email", "jose_silva@gmail.com");
		dsl.clicarBotao(".//*[@id='tygh_main_container']/div[3]/div/div[2]/div[1]/div/div/div/form/div[7]/button");
		
		Assert.assertEquals("jose_silva@gmail.com", driver.findElement(By.id("email")).getAttribute("value"));
		Assert.assertEquals("O campo Senha é obrigatório.", driver.findElement(By.id("password1_error_message")).getText());
		Assert.assertEquals("O campo Confirmação de senha é obrigatório.", driver.findElement(By.id("password2_error_message")).getText());		
	}
	
	@Test
	public void cadastrarNovaContaApenasComSenha() {
		dsl.escrever("password1", "123_abc");
		dsl.escrever("password2", "123_abc");
		dsl.clicarBotao(".//*[@id='tygh_main_container']/div[3]/div/div[2]/div[1]/div/div/div/form/div[7]/button");
		
		Assert.assertEquals("O endereço de e-mail no campo E-mail é inválido.", driver.findElement(By.id("email_error_message")).getText());		
	}
	
	@Test
	@Ignore
	public void cadastrarNovaContaComSucesso() {
		dsl.escrever("email", "jose_pb55jp@gmail.com");
		dsl.escrever("password1", "123_abc");
		dsl.escrever("password2", "123_abc");
		dsl.clicarBotao(".//*[@id='tygh_main_container']/div[3]/div/div[2]/div[1]/div/div/div/form/div[7]/button");
	}
	
	@Test
	@Ignore
	public void preencherEnderecoCobranca() {
		
	}
}