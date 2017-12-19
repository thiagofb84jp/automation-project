package br.pb.cursoselenium.test;
import static br.pb.cursoselenium.core.DriverFactory.getDriver;
import static br.pb.cursoselenium.core.DriverFactory.killDriver;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.pb.cursoselenium.core.DSL;
import br.pb.cursoselenium.page.CampoTreinamentoPage;

public class TesteRegrasDeNegocio {

	private DSL dsl;
	private CampoTreinamentoPage page;

	@Before
	public void inicializa() {
		getDriver().get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		dsl = new DSL();
		page = new CampoTreinamentoPage();
	}

	@After
	public void finaliza() {
		killDriver();
	}

	@Test
	public void deveValidarNomeObrigatorio() {
		page.cadastrar();
		Assert.assertEquals("Nome eh obrigatorio", dsl.alertaObterTextoEAceita());
	}

	@Test
	public void deveValidarSobrenomeObrigatorio() {
		page.setNome("Joao Antonio");
		page.cadastrar();

		Assert.assertEquals("Sobrenome eh obrigatorio", dsl.alertaObterTextoEAceita());
	}

	@Test
	public void deveValidarSexoObrigatorio() {
		page.setNome("Joao Antonio");
		page.setSobrenome("da Silva Lima Paiva");
		page.cadastrar();

		Assert.assertEquals("Sexo eh obrigatorio", dsl.alertaObterTextoEAceita());
	}

	@Test
	public void deveValidarComidaVegetariano() {
		page.setNome("Joao Antonio");
		page.setSobrenome("da Silva Lima Paiva");
		page.setSexoMasculino();
		page.setComidaCarne();
		page.setComidaVegetariano();
		page.cadastrar();

		Assert.assertEquals("Tem certeza que voce eh vegetariano?", dsl.alertaObterTextoEAceita());
	}

	@Test
	public void deveValidarEsportistaIndeciso() {
		page.setNome("Joao Antonio");
		page.setSobrenome("da Silva Lima Paiva");
		page.setSexoMasculino();
		page.setComidaCarne();
		page.setEsporte("Corrida", "O que eh esporte?");
		page.cadastrar();

		Assert.assertEquals("Voce faz esporte ou nao?", dsl.alertaObterTextoEAceita());
	}
}