package br.pb.demoqa;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TesteRegistration {

	private WebDriver driver;

	String getNome = "Marcos Antônio";
	String getSobrenome = "Souza Guedes Lima";
	String getTelefone = "5583982211";
	String getUsername = "marcos_souza";
	String getEmail = "marcos_souza@gmail.com";
	String getPassword = "abcd_789#";

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
	public void testeTextField() {
		String getNome = "Maria";
		String getSobrenome = "da Silva Lima Alencar";
		String getTelefone = "5583999882";
		String getUsername = "maria_silva_lima";
		String getEmail = "maria_silva_alencar@gmail.com";
		String getSenha = "abcd_123";

		driver.findElement(By.id("name_3_firstname")).sendKeys(getNome);
		driver.findElement(By.id("name_3_lastname")).sendKeys(getSobrenome);
		driver.findElement(By.id("phone_9")).sendKeys(getTelefone);
		driver.findElement(By.id("username")).sendKeys(getUsername);
		driver.findElement(By.id("email_1")).sendKeys(getEmail);
		driver.findElement(By.id("password_2")).sendKeys(getSenha);
		driver.findElement(By.id("confirm_password_password_2")).sendKeys(getSenha);

		Assert.assertEquals(getNome, driver.findElement(By.id("name_3_firstname")).getAttribute("value"));
		Assert.assertEquals(getSobrenome, driver.findElement(By.id("name_3_lastname")).getAttribute("value"));
		Assert.assertEquals(getTelefone, driver.findElement(By.id("phone_9")).getAttribute("value"));
		Assert.assertEquals(getUsername, driver.findElement(By.id("username")).getAttribute("value"));
		Assert.assertEquals(getEmail, driver.findElement(By.id("email_1")).getAttribute("value"));
		Assert.assertEquals(getSenha, driver.findElement(By.id("password_2")).getAttribute("value"));
		Assert.assertEquals(getSenha, driver.findElement(By.id("confirm_password_password_2")).getAttribute("value"));
	}

	@Test
	public void testeTextArea() {
		String textoQualquer = "Caros amigos, a competitividade nas transações comerciais prepara-nos para enfrentar situações atípicas decorrentes das condições inegavelmente apropriadas. \nPor outro lado, o fenômeno da Internet afeta positivamente a correta previsão dos métodos utilizados na avaliação de resultados.";
		driver.findElement(By.id("description")).sendKeys(textoQualquer);
		Assert.assertEquals(textoQualquer, driver.findElement(By.id("description")).getAttribute("value"));
	}

	@Test
	public void testeRadioButton() {
		String solteiro = ".//*[@id='pie_register']/li[2]/div/div/input[1]";

		driver.findElement(By.xpath(solteiro)).click();
		boolean isSelectedSolteiro = driver.findElement(By.xpath(solteiro)).isSelected();
		Assert.assertTrue(isSelectedSolteiro);
	}

	@Test
	public void testeCheckBox() {
		String dance = ".//*[@id='pie_register']/li[3]/div/div/input[1]";
		String reading = ".//*[@id='pie_register']/li[3]/div/div/input[2]";

		driver.findElement(By.xpath(dance)).click();
		driver.findElement(By.xpath(reading)).click();

		boolean isSelectedDance = driver.findElement(By.xpath(dance)).isSelected();
		boolean isSelectedReading = driver.findElement(By.xpath(reading)).isSelected();

		Assert.assertTrue(isSelectedDance);
		Assert.assertTrue(isSelectedReading);
	}

	@Test
	public void deveInteragirComCombobox() {
		//Combo Cidade
		WebElement country = driver.findElement(By.id("dropdown_7"));
		Select comboCountry = new Select(country);

		String cidade = "Brazil";

		comboCountry.selectByVisibleText(cidade);
		Assert.assertEquals(cidade, comboCountry.getFirstSelectedOption().getText());

		//Combo Mês
		WebElement month = driver.findElement(By.id("mm_date_8"));
		Select comboMonth = new Select(month);

		String mes = "10";
		
		comboMonth.selectByVisibleText(mes);
		Assert.assertEquals(mes, comboMonth.getFirstSelectedOption().getText());
		
		//Combo Dia
		WebElement day = driver.findElement(By.id("dd_date_8"));
		Select comboDay = new Select(day);

		String dia = "30";
		
		comboDay.selectByVisibleText(dia);
		Assert.assertEquals(dia, comboDay.getFirstSelectedOption().getText());
		
		//Combo Ano
		WebElement year = driver.findElement(By.id("yy_date_8"));
		Select comboYear = new Select(year);

		String ano = "1982";
		
		comboYear.selectByVisibleText(ano);
		Assert.assertEquals(ano, comboYear.getFirstSelectedOption().getText());
	}

	@Test
	public void deveValidarCadastroComSucesso() {
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
		driver.findElement(By.id("confirm_password_password_2")).sendKeys(getPassword);

		driver.findElement(By.xpath(".//*[@id='pie_register']/li[14]/div/input")).click();

		String mensagemConfirmacao = driver.findElement(By.className("piereg_message")).getText();
		String texto = "Thank you for your registration";
		Assert.assertEquals(texto, mensagemConfirmacao);
	}

	@Test
	public void deveValidarCadastroUsuarioExistente() {
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
		driver.findElement(By.id("confirm_password_password_2")).sendKeys(getPassword);

		driver.findElement(By.xpath(".//*[@id='pie_register']/li[14]/div/input")).click();

		String mensagemUsuarioExistente = driver.findElement(By.className("piereg_login_error")).getText();
		String texto = "Error: Username already exists";
		Assert.assertEquals(texto, mensagemUsuarioExistente);
	}

}