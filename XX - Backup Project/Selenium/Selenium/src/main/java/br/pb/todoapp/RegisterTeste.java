package br.pb.todoapp;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.pb.core.FuncionalTest;

public class RegisterTeste extends FuncionalTest{

	private static final String URL_TODO_APP = "https://qa-test.avenuecode.com/";

	RegisterPage registerPage = new RegisterPage(driver);

	public RegisterTeste() {
		driver.get(URL_TODO_APP);
		registerPage.obterLink("Register");
	}
	
	@Test
	public void registrarSemPreencherCamposObrigatorios() {
		registerPage.salvarRegistro();
		
		List<String> erros = registerPage.obterErros();
		Assert.assertEquals(3, erros.size());
		Assert.assertTrue(erros.contains("Email can't be blank"));
	}
	
	@Test
	public void registrarSemPreencherNome() {
		registerPage.obterEmail("brunocarloseduardodacosta@vetech.vet.br");
		registerPage.obterSenha("abcd_123");
		registerPage.confirmarSenha("abcd_123");
		registerPage.salvarRegistro();
		
		List<String> erros = registerPage.obterErros();
		Assert.assertTrue(erros.contains("Name can't be blank"));
	}
	
	@Test
	public void registrarSemPreencherEmail() {
		registerPage.obterNome("Renan Bruno da Paz");
		registerPage.obterSenha("abcd_123");
		registerPage.confirmarSenha("abcd_123");
		registerPage.salvarRegistro();
		
		List<String> erros = registerPage.obterErros();
		Assert.assertEquals(1, erros.size());
		Assert.assertTrue(erros.contains("Email can't be blank"));
	}
	
	@Test
	public void registrarComEmailInvalido() {
		registerPage.obterNome("Bruno Eduardo da Costa");
		registerPage.obterEmail("brunocarloseduardodacosta@vetech");
		registerPage.obterSenha("abcd_123");
		registerPage.confirmarSenha("abcd_123");
		registerPage.salvarRegistro();
		
		List<String> erros = registerPage.obterErros();
		Assert.assertEquals(1, erros.size());
		Assert.assertTrue(erros.contains("Email is invalid"));
	}
	
	@Test
	public void informarSenhasDivergentes() {
		registerPage.obterNome("Enrico Eduardo Danilo Fernandes");
		registerPage.obterEmail("enricoeduardodanilofernandes@renatoseguros.com");
		registerPage.obterSenha("abcd_123");
		registerPage.confirmarSenha("7890_abc");
		registerPage.salvarRegistro();
		
		List<String> erros = registerPage.obterErros();
		Assert.assertEquals(1, erros.size());
		Assert.assertTrue(erros.contains("Password confirmation doesn't match Password"));
	}
	
	@Test
	public void realizarNovoRegistro() {
		registerPage.obterNome("Benício Carlos Eduardo Levi dos Santos");
		registerPage.obterEmail("beniciocarloseduardolevidossantos@dyna.com.br");
		registerPage.obterSenha("abcd_123");
		registerPage.confirmarSenha("abcd_123");
		registerPage.salvarRegistro();
		registerPage.validarMsgSucesso("Welcome! You have signed up successfully.");
	}
}