package br.pb.devin;

import static br.pb.core.DriverFactory.getDriver;
import static br.pb.core.DriverFactory.killDriver;

import org.junit.After;
import org.junit.Before;

import br.pb.core.DSL;

public class TesteCalculadoraComplexa {
	private DSL dsl;

	@Before
	public void inicializa() {
		dsl = new DSL();
		getDriver().get("http:// www.devin.com.br/arquivos/calculadora-complexa.html");
	}

	@After
	public void finaliza() {
		killDriver();
	}
}