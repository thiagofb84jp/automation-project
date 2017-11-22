package br.pb.teste.AutomationPractice;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteSignIn {
	
	private WebDriver driver;

	@Before
	public void inicializa() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com");
		driver.findElement(By.className("login")).click();
	}
	
	@After
	public void finaliza() {
		driver.quit();
	}

	@Test
	public void criarNovaContaComCampoEmailVazio() {
		driver.findElement(By.id("SubmitCreate")).click();		
//		String invalidEmail = driver.findElement(By.cssSelector(".alert.alert-danger")).getText();
		String invalidEmail = driver.findElement(By.id("create_account_error")).getText();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Assert.assertEquals("Invalid Email", invalidEmail);
	}
	
	@Test
	public void criarContaComFormatoEmailInvalido() {
		driver.findElement(By.id("email_create")).sendKeys("joao@");	
		driver.findElement(By.id("SubmitCreate")).click();
		Assert.assertEquals("Invalid email address.", driver.findElement(By.id("create_account_error")));
		
		driver.findElement(By.id("email_create")).clear();
		
		driver.findElement(By.id("email_create")).sendKeys("@gmail");		
		driver.findElement(By.id("SubmitCreate")).click();
		Assert.assertEquals("Invalid email address.", driver.findElement(By.id("create_account_error")));
		
		driver.findElement(By.id("email_create")).clear();

		driver.findElement(By.id("email_create")).sendKeys("joao@gmail");		
		driver.findElement(By.id("SubmitCreate")).click();
		Assert.assertEquals("Invalid email address.", driver.findElement(By.id("create_account_error")));
		
		driver.findElement(By.id("email_create")).clear();

		driver.findElement(By.id("email_create")).sendKeys("joao@gmail.com#");		
		driver.findElement(By.id("SubmitCreate")).click();
		Assert.assertEquals("Invalid email address.", driver.findElement(By.id("create_account_error")));
	}
		
	@Test
	public void criarNovaConta() {
		driver.findElement(By.id("email_create")).sendKeys("joao_silvapb@gmail.com");	
		driver.findElement(By.id("SubmitCreate")).click();
	}
	
	@Test
	public void verificarRegistroComCamposVazios() {
		
	}
	
	@Test
	public void verificarRegistroComCampoEmailVazio() {
		
	}
	
	@Test
	public void verificarRegistroComCampoSenhaVazio() {
		
	}
	
	@Test
	public void verificarRegistroComCampoSenhaIncorreto() {
		
	}
	
	@Test
	public void esqueceuSenhaLink() {
		driver.findElement(By.xpath(".//*[@id='login_form']/div/p[1]/a")).click();
		Assert.assertEquals("FORGOT YOUR PASSWORD?", driver.findElement(By.className("page-subheading")).getText());
	}
	
	@Test
	public void esqueceuSenhaComCampoEmailVazio() {
		
	}
	
	@Test
	public void esqueceuSenhaComEmailInvalido() {
		
	}
	
	@Test
	public void esqueceuSenhaComEmailNaoRegistrado() {
		
	}	
	
}