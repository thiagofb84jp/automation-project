package br.pb.cursoselenium.test;
import static br.pb.cursoselenium.core.DriverFactory.getDriver;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import br.pb.cursoselenium.core.DSL;
import br.pb.cursoselenium.core.DriverFactory;

public class TesteCampoTreinamento {

	private DSL dsl;

	@Before
	public void inicializa() {
		getDriver().get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		dsl = new DSL();
	}

	@After
	public void finaliza() {
		DriverFactory.killDriver();
	}

	@Test
	public void testeTextField() {
		String nome = "Maria da Penha";
		String sobreNome = "da Silva Lima";

		dsl.escrever("elementosForm:nome", nome);
		Assert.assertEquals(nome, dsl.obterValorCampo("elementosForm:nome"));

		dsl.escrever("elementosForm:sobrenome", sobreNome);
		Assert.assertEquals(sobreNome, dsl.obterValorCampo("elementosForm:sobrenome"));
	}

	@Test
	public void testeTextFieldDuplo() {
		dsl.escrever("elementosForm:nome", "Joseana");
		Assert.assertEquals("Joseana", dsl.obterValorCampo("elementosForm:nome"));

		dsl.escrever("elementosForm:nome", "Marianna");
		Assert.assertEquals("Marianna", dsl.obterValorCampo("elementosForm:nome"));
	}

	@Test
	public void deveInteragirComTextArea() {
		String textoQualquer = "Estou escreverndo um texto qualquer \n Este texto ainda não está bem definido...";

		dsl.escrever("elementosForm:sugestoes", textoQualquer);
		Assert.assertEquals(textoQualquer, dsl.obterValorCampo("elementosForm:sugestoes"));
	}

	@Test
	public void deveInteragirComRadioButton() {
		dsl.clicarRadio("elementosForm:sexo:0");
		Assert.assertTrue(dsl.isRadioMarcado("elementosForm:sexo:0"));
	}

	@Test
	public void deveInteragirComCheckbox() {
		dsl.clicarCheck("elementosForm:comidaFavorita");
		Assert.assertTrue(dsl.isCheckMarcado("elementosForm:comidaFavorita:2"));
	}

	@Test
	public void deveInteragirComCombobox() {
		String valor = "2o grau completo";

		dsl.selecionarCombo("elementosForm:escolaridade", valor);
		Assert.assertEquals(valor, dsl.obterValorCombo("elementosForm:escolaridade"));
	}

	@Test
	public void deveVerificarValoresCombo() {
		WebElement element = getDriver().findElement(By.id("elementosForm:escolaridade"));
		Select combo = new Select(element);

		// Verifica a quantidade de opções que o combobox possui
		List<WebElement> options = combo.getOptions();
		Assert.assertEquals(8, options.size());

		// Lógica criada para verificar se existe a opção "Mestrado"
		boolean encontrou = false;
		for (WebElement option : options) {
			if (option.getText().equals("Mestrado")) {
				encontrou = true;
				break;
			}
		}
		Assert.assertTrue(encontrou);
	}

	@Test
	public void deveVerificarValoresComboMultiplo() {
		String valor1 = "Natacao";
		String valor2 = "Corrida";
		String valor3 = "O que eh esporte?";

		dsl.selecionarCombo("elementosForm:esportes", valor1);
		dsl.selecionarCombo("elementosForm:esportes", valor2);
		dsl.selecionarCombo("elementosForm:esportes", valor3);

		WebElement element = getDriver().findElement(By.id("elementosForm:esportes"));
		Select combo = new Select(element);
		combo.selectByVisibleText("Natacao");
		combo.selectByVisibleText("Corrida");
		combo.selectByVisibleText("O que eh esporte?");

		List<WebElement> allSelectedOptions = combo.getAllSelectedOptions();
		Assert.assertEquals(3, allSelectedOptions.size());

		combo.deselectByVisibleText("Corrida");
		allSelectedOptions = combo.getAllSelectedOptions();
		Assert.assertEquals(2, allSelectedOptions.size());
	}

	@Test
	public void deveInteragirComBotoes() {
		dsl.clicarBotao("buttonSimple");
		Assert.assertEquals("Obrigado!", dsl.obterValueElemento("buttonSimple"));
	}

	@Test
	public void deveInteragirComLinks() {
		dsl.clicarLink("Voltar");
		Assert.assertEquals("Voltou!", dsl.obterTexto("resultado"));
	}

	@Test
	public void deveBuscarTextosNaPagina() {
		// Assert.assertTrue(driver.findElement(By.tagName("body")).
		// getText().contains("Campo de Treinamento"));

		String campoTreinamento = "Campo de Treinamento";
		Assert.assertEquals(campoTreinamento, dsl.obterTexto(By.tagName("h3")));

		String cuidado = "Cuidado onde clica, muitas armadilhas...";
		// Assert.assertEquals(cuidado,
		// driver.findElement(By.tagName("span")).getText());
		Assert.assertEquals(cuidado, dsl.obterTexto(By.className("facilAchar")));
	}

	@Test
	public void testJavascript() {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		// js.executeScript("alert('Testando JS via Selenium')");

		js.executeScript("document.getElementById('elementosForm:nome').value = 'Escrito via JS'");
		js.executeScript("document.getElementById('elementosForm:sobrenome').type = 'radio'");

		WebElement element = getDriver().findElement(By.id("elementosForm:nome"));
		js.executeScript("arguments[0].style.border = arguments[1]", element, "solid 4px red");
	}

	@Test
	public void deveClicarBotaoTabela() {
		dsl.clicarBotaoTabela("Escolaridade", "Mestrado", "Botao", "elementosForm:tableUsuarios");
		// dsl.clicarBotaoTabela("Nome", "Usuario A", "Botao",
		// "elementosForm:tableUsuarios");
	}
}