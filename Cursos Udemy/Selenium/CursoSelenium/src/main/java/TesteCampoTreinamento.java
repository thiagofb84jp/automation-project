import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TesteCampoTreinamento {

	private WebDriver driver;
	private DSL dsl;
	
	@Before
	public void inicializa() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		dsl = new DSL(driver);
	}
	
	@After
	public void finaliza() {
		driver.quit();
	}

	@Test
	public void testeTextField() {
		String nome = "Maria da Penha";
		String sobreNome = "da Silva Lima";
		
		dsl.escreve("elementosForm:nome", nome);
		Assert.assertEquals(nome, dsl.obterValorCampo("elementosForm:nome"));
		
		dsl.escreve("elementosForm:sobrenome", sobreNome);
		Assert.assertEquals(sobreNome, dsl.obterValorCampo("elementosForm:sobrenome"));
	}
	
	@Test
	public void deveInteragirComTextArea() {
		String textoQualquer = "Estou escrevendo um texto qualquer \n Este texto ainda não está bem definido...";
		
		dsl.escreve("elementosForm:sugestoes", textoQualquer);
		Assert.assertEquals(textoQualquer, dsl.obterValorCampo("elementosForm:sugestoes"));
	}
	
	@Test
	public void deveInteragirComRadioButton() {
		dsl.clicarRadio("elementosForm:sexo:0");
		Assert.assertTrue(dsl.isRadioMarcado("elementosForm:sexo:0"));
	}
	
	@Test
	public void deveInteragirComCheckbox() {
		driver.findElement(By.id("elementosForm:comidaFavorita:2")).click();
		Assert.assertTrue(dsl.isRadioMarcado("elementosForm:comidaFavorita:2"));		
	}
	
	@Test
	public void deveInteragirComCombobox() {
		String valor = "2o grau completo";
		
		dsl.selecionarCombo("elementosForm:escolaridade", valor);
		Assert.assertEquals(valor, dsl.obterValorCombo("elementosForm:escolaridade"));
	}
	
	@Test
	public void deveVerificarValoresCombo() {
		WebElement element = driver.findElement(By.id("elementosForm:escolaridade"));
		Select combo = new Select(element);
		
		//Verifica a quantidade de opções que o combobox possui
		List<WebElement> options = combo.getOptions();
		Assert.assertEquals(8, options.size());
		
		//Lógica criada para verificar se existe a opção "Mestrado"
		boolean encontrou = false;
		for(WebElement option: options) {
			if(option.getText().equals("Mestrado")) {
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
		
		WebElement element = driver.findElement(By.id("elementosForm:esportes"));
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
		//WebElement representa um componente HTML
		dsl.clicarBotao("buttonSimple");

		WebElement botao = driver.findElement(By.id("buttonSimple"));
		Assert.assertEquals("Obrigado!", botao.getAttribute("value"));
	}
	
	@Test
	public void deveInteragirComLinks() {
		dsl.clicarLink("Voltar");

		String textoLink = "Voltou!";
		Assert.assertEquals(textoLink, dsl.obterTexto("resultado"));
	}
	
	@Test
	public void deveBuscarTextosNaPagina() {
//		Assert.assertTrue(driver.findElement(By.tagName("body")).
//				getText().contains("Campo de Treinamento"));

		String campoTreinamento = "Campo de Treinamento";
		Assert.assertEquals(campoTreinamento, dsl.obterTexto(By.tagName("h3")));
		
		String cuidado = "Cuidado onde clica, muitas armadilhas..."; 
//		Assert.assertEquals(cuidado, driver.findElement(By.tagName("span")).getText());		
		Assert.assertEquals(cuidado, dsl.obterTexto(By.className("facilAchar")));
	}
}