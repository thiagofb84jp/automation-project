package br.pb.automationpracticle;

import static br.pb.core.DriverFactory.getDriver;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.pb.core.DSL;
import br.pb.core.DriverFactory;

public class SignUp {
	
	private DSL dsl;

	@Before
	public void inicializa() {
		getDriver().get("http://www.automationpractice.com/");
		dsl = new DSL();
	}

	@After
	public void finaliza() {
		 DriverFactory.killDriver();
	}
	
	@Test
	public void testCriarNovoUsuarioComCamposVazios() {
		dsl.clicarLink("Sign in");
		dsl.clicarBotao("SubmitCreate");
		
		List<String> erros = dsl.obterErros();
//		Assert.assertEquals("1. Invalid email address.", erros.get(0)); // Uma das formas de obter os erros
//		Assert.assertTrue(erros.contains("1. Invalid email address.")); // Outra forma de obter os erros
		Assert.assertTrue(erros.containsAll(Arrays.asList(
				"1. Invalid email address."
		))); // Monta uma coleção de textos e verifica todos os erros de uma única vez
		Assert.assertEquals(0, erros.size()); // Verifica se os '6' erros estão presentes 
		
		
		
	}
}
