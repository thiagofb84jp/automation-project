package br.com.cucumber.steps;
import org.junit.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class Calculadora {

	private int vlr1;
	private int vlr2;
	private int soma;
	
	
	@Dado("^que eu tenho dois números$")
	public void que_eu_tenho_dois_números() throws Throwable {
		vlr1 = 0;
		vlr2 = 0;
	}

	@Quando("^eu somar (\\d+) mais (\\d+)$")
	public void eu_somar_mais(int vlr1, int vlr2) throws Throwable {
		soma = vlr1 + vlr2;
	}

	@Então("^o resultado será (\\d+)$")
	public void o_resultado_será(int value) throws Throwable {
		Assert.assertEquals(soma, value);
	}

	@Quando("^eu subtrair (\\d+) menos (\\d+)$")
	public void eu_subtrair_menos(int arg1, int arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Quando("^eu multiplicar (\\d+) vezes (\\d+)$")
	public void eu_multiplicar_vezes(int arg1, int arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Quando("^eu dividir (\\d+) dividido (\\d+)$")
	public void eu_dividir_dividido(int arg1, int arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

}
