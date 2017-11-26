import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TesteDesafioCadastro {

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
	public void desafioCadastro() {
		//Captura dos componentes e inserção dos resultados
		String nome = "Jose Antonio";
		String sobrenome = "da Silva Gomes Lima";
				
		driver.findElement(By.id("elementosForm:nome")).sendKeys(nome);
		driver.findElement(By.id("elementosForm:sobrenome")).sendKeys(sobrenome);
		driver.findElement(By.id("elementosForm:sexo:0")).click();
		driver.findElement(By.id("elementosForm:comidaFavorita:1")).click();
		driver.findElement(By.id("elementosForm:comidaFavorita:2")).click();
		
		WebElement escolaridade = driver.findElement(By.id("elementosForm:escolaridade"));
		Select combo1 = new Select(escolaridade);
		combo1.selectByVisibleText("Mestrado");
		
		WebElement esportes = driver.findElement(By.id("elementosForm:esportes"));
		Select combo2 = new Select(esportes);
		combo2.selectByVisibleText("Natacao");
		combo2.selectByVisibleText("Corrida");
		
		driver.findElement(By.id("elementosForm:cadastrar")).click();

		//Verificação dos asserts
		String getNome = driver.findElement(By.id("descNome")).getText();
		String getSobrenome = driver.findElement(By.id("descSobrenome")).getText();
		String getSexo = driver.findElement(By.id("descSexo")).getText();
		String getComida = driver.findElement(By.id("descComida")).getText();
		String getEscolaridade = driver.findElement(By.id("descEscolaridade")).getText();
		String getEsportes = driver.findElement(By.id("descEsportes")).getText();
		
		Assert.assertTrue(driver.findElement(By.id("resultado")).getText().startsWith("Cadastrado!"));
		Assert.assertEquals("Nome: Jose Antonio", getNome);
		Assert.assertEquals("Sobrenome: da Silva Gomes Lima", getSobrenome);
		Assert.assertEquals("Sexo: Masculino", getSexo);
		Assert.assertEquals("Comida: Frango Pizza", getComida);
		Assert.assertEquals("Escolaridade: mestrado", getEscolaridade);
		Assert.assertEquals("Esportes: Natacao Corrida", getEsportes);
	}	
}