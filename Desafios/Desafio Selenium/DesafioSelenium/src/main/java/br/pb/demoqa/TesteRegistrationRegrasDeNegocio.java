package br.pb.demoqa;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteRegistrationRegrasDeNegocio {

	private WebDriver driver;

	String getNome = "José Danilo";
	String getSobrenome = "da Silva Santos Lima";
	String getTelefone = "5583982211";
	String getUsername = "jose_danilo";
	String getEmail = "jose_danilo@gmail.com";
	String getPassword = "abcd_123";

	@Before
	public void inicializa() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoqa.com/");
		driver.findElement(By.linkText("Registration")).click();
	}

	@After
	public void finaliza() {
		driver.quit();
	}

	@Test
	public void deveValidarNomeObrigatorio() {
		driver.findElement(By.xpath(".//*[@id='pie_register']/li[14]/div/input")).click();

		String getMensagemErro = ".//*[@id='pie_register']/li[1]/div[1]/div[2]/span";
		String devePreencherCampo = driver.findElement(By.xpath(getMensagemErro)).getText();
		String texto = "* This field is required";

		Assert.assertEquals(texto, devePreencherCampo);
	}

	@Test
	public void deveValidarSobrenomeObrigatorio() {
		driver.findElement(By.id("name_3_firstname")).sendKeys(getNome);
		driver.findElement(By.xpath(".//*[@id='pie_register']/li[14]/div/input")).click();

		String getMensagemErro = ".//*[@id='pie_register']/li[1]/div[1]/div[2]/span";
		String devePreencherCampo = driver.findElement(By.xpath(getMensagemErro)).getText();
		String texto = "* This field is required";

		Assert.assertEquals(texto, devePreencherCampo);
	}

	@Test
	public void deveValidarHobby() {
		driver.findElement(By.id("name_3_firstname")).sendKeys(getNome);
		driver.findElement(By.id("name_3_lastname")).sendKeys(getSobrenome);
		driver.findElement(By.xpath(".//*[@id='pie_register']/li[14]/div/input")).click();

		String getMensagemErro = ".//*[@id='pie_register']/li[3]/div/div[2]/span";
		String devePreencherCampo = driver.findElement(By.xpath(getMensagemErro)).getText();
		String texto = "* This field is required";

		Assert.assertEquals(texto, devePreencherCampo);
	}

	@Test
	public void deveValidarTelefone() {
		driver.findElement(By.id("name_3_firstname")).sendKeys(getNome);
		driver.findElement(By.id("name_3_lastname")).sendKeys(getSobrenome);

		String dance = ".//*[@id='pie_register']/li[3]/div/div/input[1]";
		String reading = ".//*[@id='pie_register']/li[3]/div/div/input[2]";

		driver.findElement(By.xpath(dance)).click();
		driver.findElement(By.xpath(reading)).click();

		driver.findElement(By.xpath(".//*[@id='pie_register']/li[14]/div/input")).click();

		String getMensagemErro = ".//*[@id='pie_register']/li[6]/div/div/span";
		String devePreencherCampo = driver.findElement(By.xpath(getMensagemErro)).getText();
		String texto = "* This field is required";

		Assert.assertEquals(texto, devePreencherCampo);
	}

	@Test
	public void deveValidarUsername() {
		driver.findElement(By.id("name_3_firstname")).sendKeys(getNome);
		driver.findElement(By.id("name_3_lastname")).sendKeys(getSobrenome);

		String dance = ".//*[@id='pie_register']/li[3]/div/div/input[1]";
		String reading = ".//*[@id='pie_register']/li[3]/div/div/input[2]";

		driver.findElement(By.xpath(dance)).click();
		driver.findElement(By.xpath(reading)).click();

		driver.findElement(By.id("phone_9")).sendKeys("5583982211");

		driver.findElement(By.xpath(".//*[@id='pie_register']/li[14]/div/input")).click();

		String getMensagemErro = ".//*[@id='pie_register']/li[7]/div/div/span";
		String devePreencherCampo = driver.findElement(By.xpath(getMensagemErro)).getText();
		String texto = "* This field is required";

		Assert.assertEquals(texto, devePreencherCampo);
	}

	@Test
	public void deveValidarEmail() {
		driver.findElement(By.id("name_3_firstname")).sendKeys(getNome);
		driver.findElement(By.id("name_3_lastname")).sendKeys(getSobrenome);

		String dance = ".//*[@id='pie_register']/li[3]/div/div/input[1]";
		String reading = ".//*[@id='pie_register']/li[3]/div/div/input[2]";

		driver.findElement(By.xpath(dance)).click();
		driver.findElement(By.xpath(reading)).click();

		driver.findElement(By.id("phone_9")).sendKeys(getTelefone);

		driver.findElement(By.id("username")).sendKeys(getUsername);

		driver.findElement(By.xpath(".//*[@id='pie_register']/li[14]/div/input")).click();

		String getMensagemErro = ".//*[@id='pie_register']/li[8]/div/div/span";
		String devePreencherCampo = driver.findElement(By.xpath(getMensagemErro)).getText();
		String texto = "* This field is required";

		Assert.assertEquals(texto, devePreencherCampo);
	}

	@Test
	public void deveValidarSenha() {
		driver.findElement(By.id("name_3_firstname")).sendKeys(getNome);
		driver.findElement(By.id("name_3_lastname")).sendKeys(getSobrenome);

		String dance = ".//*[@id='pie_register']/li[3]/div/div/input[1]";
		String reading = ".//*[@id='pie_register']/li[3]/div/div/input[2]";

		driver.findElement(By.xpath(dance)).click();
		driver.findElement(By.xpath(reading)).click();

		driver.findElement(By.id("phone_9")).sendKeys(getTelefone);
		driver.findElement(By.id("username")).sendKeys(getUsername);
		driver.findElement(By.id("email_1")).sendKeys(getEmail);

		driver.findElement(By.xpath(".//*[@id='pie_register']/li[14]/div/input")).click();

		String getMensagemErro = ".//*[@id='pie_register']/li[11]/div/div/span";
		String devePreencherCampo = driver.findElement(By.xpath(getMensagemErro)).getText();
		String texto = "* This field is required";

		Assert.assertEquals(texto, devePreencherCampo);
	}

	@Test
	public void deveValidarConfirmacaoSenha() {
		driver.findElement(By.id("name_3_firstname")).sendKeys(getNome);
		driver.findElement(By.id("name_3_lastname")).sendKeys(getSobrenome);

		String dance = ".//*[@id='pie_register']/li[3]/div/div/input[1]";
		String reading = ".//*[@id='pie_register']/li[3]/div/div/input[2]";

		driver.findElement(By.xpath(dance)).click();
		driver.findElement(By.xpath(reading)).click();

		driver.findElement(By.id("phone_9")).sendKeys(getTelefone);
		driver.findElement(By.id("username")).sendKeys(getUsername);
		driver.findElement(By.id("email_1")).sendKeys(getEmail);
		driver.findElement(By.id("password_2")).sendKeys(getPassword);

		driver.findElement(By.xpath(".//*[@id='pie_register']/li[14]/div/input")).click();

		String getMensagemErro = ".//*[@id='pie_register']/li[12]/div/div/span";
		String devePreencherCampo = driver.findElement(By.xpath(getMensagemErro)).getText();
		String texto = "* This field is required";

		Assert.assertEquals(texto, devePreencherCampo);
	}
}