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
	
	@Before
	public void inicializa() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");		
	}
	
	@After
	public void finaliza() {
		driver.quit();
	}

	@Test
	public void testeTextField() {
		driver.findElement(By.id("elementosForm:nome")).sendKeys("Maria da Penha");
		String getValueNome = driver.findElement(By.id("elementosForm:nome")).getAttribute("value");
		Assert.assertEquals("Maria da Penha", getValueNome);
		
		driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("da Silva Lima");
		String getValueSobrenome = driver.findElement(By.id("elementosForm:sobrenome")).getAttribute("value");
		Assert.assertEquals("da Silva Lima", getValueSobrenome);
	}
	
	@Test
	public void deveInteragirComTextArea() {
		String textoQualquer = "Estou escrevendo um texto qualquer \n Este texto ainda não está bem definido...";
		driver.findElement(By.id("elementosForm:sugestoes")).sendKeys(textoQualquer);
		String getValueText = driver.findElement(By.id("elementosForm:sugestoes")).getAttribute("value");
		Assert.assertEquals(textoQualquer, getValueText);
	}
	
	@Test
	public void deveInteragirComRadioButton() {
		driver.findElement(By.id("elementosForm:sexo:0")).click();
		boolean isSelected = driver.findElement(By.id("elementosForm:sexo:0")).isSelected();
		Assert.assertTrue(isSelected);
	}
	
	@Test
	public void deveInteragirComCheckbox() {
		driver.findElement(By.id("elementosForm:comidaFavorita:2")).click();
		boolean isSelected = driver.findElement(By.id("elementosForm:comidaFavorita:2")).isSelected();
		Assert.assertTrue(isSelected);
	}
	
	@Test
	public void deveInteragirComCombobox() {
		WebElement element = driver.findElement(By.id("elementosForm:escolaridade"));
		Select combo = new Select(element);
//		combo.selectByIndex(2);
//		combo.selectByValue("superior");
		combo.selectByVisibleText("2o grau completo");

		Assert.assertEquals("2o grau completo", combo.getFirstSelectedOption().getText());
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
		WebElement botao = driver.findElement(By.id("buttonSimple"));
		botao.click();

		Assert.assertEquals("Obrigado!", botao.getAttribute("value"));
	}
	
	@Test
	public void deveInteragirComLinks() {
		driver.findElement(By.linkText("Voltar")).click();
		//Força a barra para que os testes falhem
		//Assert.fail();
		
		String textoLink = "Voltou!";
		Assert.assertEquals(textoLink, driver.findElement(By.id("resultado")).getText());
	}
	
	@Test
	public void deveBuscarTextosNaPagina() {
//		Assert.assertTrue(driver.findElement(By.tagName("body")).
//				getText().contains("Campo de Treinamento"));

		String campoTreinamento = "Campo de Treinamento";
		Assert.assertEquals(campoTreinamento, driver.findElement(By.tagName("h3")).getText());
		
		String cuidado = "Cuidado onde clica, muitas armadilhas..."; 
//		Assert.assertEquals(cuidado, driver.findElement(By.tagName("span")).getText());		
		Assert.assertEquals(cuidado, driver.findElement(By.className("facilAchar")).getText());
	}
}