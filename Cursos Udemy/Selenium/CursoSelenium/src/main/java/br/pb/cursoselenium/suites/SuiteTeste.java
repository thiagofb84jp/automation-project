package br.pb.cursoselenium.suites;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.pb.cursoselenium.test.TesteCampoTreinamento;
import br.pb.cursoselenium.test.TesteDesafioCadastro;
import br.pb.cursoselenium.test.TesteRegrasCadastro;

@RunWith(Suite.class)
@SuiteClasses({
	TesteDesafioCadastro.class,
	TesteRegrasCadastro.class,
	TesteCampoTreinamento.class
})
public class SuiteTeste {
	

}