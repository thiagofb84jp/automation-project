package br.pb.cursoselenium.suites;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.pb.cursoselenium.core.DriverFactory;
import br.pb.cursoselenium.pages.LoginPage;
import br.pb.cursoselenium.tests.ContaTest;
import br.pb.cursoselenium.tests.MovimentacaoTest;
import br.pb.cursoselenium.tests.RemoverMovimentacaoContaTest;
import br.pb.cursoselenium.tests.ResumoTest;
import br.pb.cursoselenium.tests.SaldoTest;

@RunWith(Suite.class)
@SuiteClasses({ ontaTest.class,  vimentacaoTest.class, R overMovimentacaoContaTest.class, Sa oTest.class,
		R
		umoTest.class }) 
public class SuiteGeral {

	

	ate static LoginPage page = new LoginPage();

	@

	reClass
	public static void reset() {
		page.acessarTelaInicial();

		p

		tEmail("thiagofb84jp@gmail.com");
		page.setSenha("abcd_123");
		page.entrar();

		pag

		tar();
		DriverFactory.killDriver();
	}

	// pri

	e  tatic LoginPage page = new LoginPage();
	//
	// 
	Be
	re lass
	// pub
	ic static void inicializa() {
	// pa
	e. essarTelaInicial();
	//
	/
	 p
	.s Email("thiagofb84jp@gmail.com");
	// pag
	.s Senha("abcd_123");
	// pag
	.e rar();
	// }
	
	/
 /
	 @
	te Class
	// p
	bl c static void finaliza() {
	// 
	ri rFactory.killDriver();
	// 
	
} 