package br.pb.cursoselenium.suites;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.pb.cursoselenium.core.DriverFactory;
import br.pb.cursoselenium.test.TesteDesafioCadastro;
import br.pb.cursoselenium.test.TesteRegrasCadastro;

@RunWith(Suite.class)
@SuiteClasses({
	TesteDesafioCadastro.class,
	TesteRegrasCadastro.class,
})
public class SuiteTeste {
	
	/*
	 * Esse método pertence a classe. Portanto, é preciso que seja executado de modo estático
	 */
	@AfterClass
	public static void finalizaTudo() {
		DriverFactory.killDriver();
	}
	

}