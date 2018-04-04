package br.pb.demoqa.tests;

import static br.pb.core.DriverFactory.getDriver;
import static br.pb.core.DriverFactory.killDriver;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import br.pb.core.DSL;

public class TesteRegistrationRegrasDeNegocio {

	private DSL dsl;

	String getNome = "Maria da Guia";
	String getSobrenome = "Joseana dos Santos Silva";
	String getTelefone = "5583982211";
	String getUsername = "maria_guia";
	String getEmail = "maria_guia@gmail.com";
	String getPassword = "abcd_123";
	String getDance = ".//*[@id='pie_register']/li[3]/div/div/input[1]";
	String getReading = ".//*[@id='pie_register']/li[3]/div/div/input[2]";
	
	String texto = "* This field is required";
	
	String msgErroNome = ".//*[@id='pie_register']/li[1]/div[1]/div[2]/span";
	String msgErroSobrenome = ".//*[@id='pie_register']/li[1]/div[1]/div[2]/span";
	String msgErroHobby = ".//*[@id='pie_register']/li[3]/div/div[2]/span";
	String msgErroTelefone = ".//*[@id='pie_register']/li[6]/div/div/span";
	String msgErroUsername = ".//*[@id='pie_register']/li[7]/div/div/span";
	String msgErroEmail = ".//*[@id='pie_register']/li[8]/div/div/span";
	String msgErroSenha = ".//*[@id='pie_register']/li[11]/div/div/span";
	String msgErroConfirmaSenha = ".//*[@id='pie_register']/li[12]/div/div/span";


	@Before
	public void inicializa() {
		dsl = new DSL();
		getDriver().get("http://demoqa.com/");
		dsl.clicarLink("Registration");
	}

	@After
	public void finaliza() {
		killDriver();
	}

	@Test
	public void deveValidarNomeObrigatorio() {
		dsl.clicarBotao(By.xpath(".//*[@id='pie_register']/li[14]/div/input"));
		Assert.assertEquals(texto, dsl.obterTexto(By.xpath(msgErroNome)));
		
	}

	@Test
	public void deveValidarSobrenomeObrigatorio() {
		dsl.escrever("name_3_firstname", getNome);
		dsl.clicarBotao(By.xpath(".//*[@id='pie_register']/li[14]/div/input"));

		Assert.assertEquals(texto, dsl.obterTexto(By.xpath(msgErroSobrenome)));
	}

	@Test
	public void deveValidarHobby() {
		dsl.escrever("name_3_firstname", getNome);
		dsl.escrever("name_3_lastname", getSobrenome);
		dsl.clicarBotao(By.xpath(".//*[@id='pie_register']/li[14]/div/input"));

		Assert.assertEquals(texto, dsl.obterTexto(By.xpath(msgErroHobby)));
	}

	@Test
	public void deveValidarTelefone() {
		dsl.escrever("name_3_firstname", getNome);
		dsl.escrever("name_3_lastname", getSobrenome);

		dsl.clicarRadio(getDance);
		dsl.clicarRadio(getReading);

		dsl.clicarBotao(By.xpath(".//*[@id='pie_register']/li[14]/div/input"));

		Assert.assertEquals(texto, dsl.obterTexto(By.xpath(msgErroTelefone)));
	}

	@Test
	public void deveValidarUsername() {
		dsl.escrever("name_3_firstname", getNome);
		dsl.escrever("name_3_lastname", getSobrenome);

		dsl.clicarRadio(getDance);
		dsl.clicarRadio(getReading);

		dsl.escrever("phone_9", getTelefone);

		dsl.clicarBotao(By.xpath(".//*[@id='pie_register']/li[14]/div/input"));

		Assert.assertEquals(texto, dsl.obterTexto(By.xpath(msgErroUsername)));
	}

	@Test
	public void deveValidarEmail() {
		dsl.escrever("name_3_firstname", getNome);
		dsl.escrever("name_3_lastname", getSobrenome);

		dsl.clicarRadio(getDance);
		dsl.clicarRadio(getReading);

		dsl.escrever("phone_9", getTelefone);
		dsl.escrever("username", getUsername);

		dsl.clicarBotao(By.xpath(".//*[@id='pie_register']/li[14]/div/input"));

		String msgErroEmail = ".//*[@id='pie_register']/li[8]/div/div/span";

		Assert.assertEquals(texto, dsl.obterTexto(By.xpath(msgErroEmail)));
	}

	@Test
	public void deveValidarSenha() {
		dsl.escrever("name_3_firstname", getNome);
		dsl.escrever("name_3_lastname", getSobrenome);

		dsl.clicarRadio(getDance);
		dsl.clicarRadio(getReading);

		dsl.escrever("phone_9", getTelefone);
		dsl.escrever("username", getUsername);
		dsl.escrever("email_1", getEmail);

		dsl.clicarBotao(By.xpath(".//*[@id='pie_register']/li[14]/div/input"));

		Assert.assertEquals(texto, dsl.obterTexto(By.xpath(msgErroSenha)));
	}

	@Test
	public void deveValidarConfirmacaoSenha() {
		dsl.escrever("name_3_firstname", getNome);
		dsl.escrever("name_3_lastname", getSobrenome);

		dsl.clicarRadio(getDance);
		dsl.clicarRadio(getReading);

		dsl.escrever("phone_9", getTelefone);
		dsl.escrever("username", getUsername);
		dsl.escrever("email_1", getEmail);
		dsl.escrever("password_2", getPassword);

		dsl.clicarBotao(By.xpath(".//*[@id='pie_register']/li[14]/div/input"));

		Assert.assertEquals(texto, dsl.obterTexto(By.xpath(msgErroConfirmaSenha)));
	}
}