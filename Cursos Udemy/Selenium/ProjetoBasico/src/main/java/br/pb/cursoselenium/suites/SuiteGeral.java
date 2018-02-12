package br.pb.cursoselenium.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.pb.cursoselenium.tests.ContaTest;
import br.pb.cursoselenium.tests.MovimentacaoTest;
import br.pb.cursoselenium.tests.RemoverMovimentacaoContaTest;
import br.pb.cursoselenium.tests.ResumoTest;
import br.pb.cursoselenium.tests.SaldoTest;

@RunWith(Suite.class)
@SuiteClasses({
	ContaTest.class,
	MovimentacaoTest.class,
	RemoverMovimentacaoContaTest.class,
	SaldoTest.class,
	ResumoTest.class
})
public class SuiteGeral {
	
//	private static LoginPage page = new LoginPage();
//	
//	@BeforeClass
//	public static void inicializa() {
//		page.acessarTelaInicial();
//		
//		page.setEmail("thiagofb84jp@gmail.com");
//		page.setSenha("abcd_123");
//		page.entrar();
//	}
//	
//	@AfterClass
//	public static void finaliza() {
//		DriverFactory.killDriver();
//	}
}
