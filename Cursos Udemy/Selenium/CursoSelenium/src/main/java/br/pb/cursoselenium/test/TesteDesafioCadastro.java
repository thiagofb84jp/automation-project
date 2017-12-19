package br.pb.cursoselenium.test;
import static br.pb.cursoselenium.core.DriverFactory.getDriver;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.pb.cursoselenium.core.BaseTest;
import br.pb.cursoselenium.page.CampoTreinamentoPage;

public class TesteDesafioCadastro extends BaseTest {

	private CampoTreinamentoPage page;

	@Before
	public void inicializa() {
		getDriver().get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		page = new CampoTreinamentoPage();
	}

	@Test
	public void deveRealizarCadastroComSucesso() {
		page.setNome("Jose Antonio");
		page.setSobrenome("da Silva Gomes Lima");
		page.setSexoMasculino();
		page.setComidaFrango();
		page.setComidaPizza();
		page.setEscolaridade("Mestrado");
		page.setEsporte("Natacao", "Corrida");
		page.cadastrar();

		String getCadastrado = "Cadastrado!";
		String getNome = "Jose Antonio";
		String getSobrenome = "da Silva Gomes Lima";
		String getSexo = "Masculino";
		String getComida = "Frango Pizza";
		String getEscolaridade = "mestrado";
		String getEsportes = "Natacao Corrida";

		Assert.assertTrue(page.obterResultadoCadastro().startsWith(getCadastrado));
		Assert.assertEquals(getNome, page.obterNomeCadastro());
		Assert.assertEquals(getSobrenome, page.obterSobrenomeCadastro());
		Assert.assertEquals(getSexo, page.obterSexo());
		Assert.assertEquals(getComida, page.obterComidaCadastro());
		Assert.assertEquals(getEscolaridade, page.obterEscolaridadeCadastro());
		Assert.assertEquals(getEsportes, page.obterEsportesCadastro());
	}
}