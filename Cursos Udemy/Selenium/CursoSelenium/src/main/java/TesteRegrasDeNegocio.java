import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TesteRegrasDeNegocio {

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
	public void deveValidarNomeObrigatorio() {
		driver.findElement(By.id("elementosForm:cadastrar")).click();
		Alert alert = driver.switchTo().alert();
		String msg = alert.getText();

		Assert.assertEquals("Nome eh obrigatorio", msg);
		alert.accept();
	}

	@Test
	public void deveValidarSobrenomeObrigatorio() {
		driver.findElement(By.id("elementosForm:nome")).sendKeys("Joao Antonio");
		driver.findElement(By.id("elementosForm:cadastrar")).click();

		Alert alert = driver.switchTo().alert();
		String msg = alert.getText();

		Assert.assertEquals("Sobrenome eh obrigatorio", msg);
		alert.accept();
	}

	@Test
	public void deveValidarSexoObrigatorio() {
		driver.findElement(By.id("elementosForm:nome")).sendKeys("Joao Antonio");
		driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("da Silva Lima Paiva");
		driver.findElement(By.id("elementosForm:cadastrar")).click();

		Alert alert = driver.switchTo().alert();
		String msg = alert.getText();

		Assert.assertEquals("Sexo eh obrigatorio", msg);
		alert.accept();
	}

	@Test
	public void deveValidarComidaObrigatorio() {
		driver.findElement(By.id("elementosForm:nome")).sendKeys("Joao Antonio");
		driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("da Silva Lima Paiva");
		driver.findElement(By.id("elementosForm:sexo:0")).click();
		driver.findElement(By.id("elementosForm:comidaFavorita:0")).click();
		driver.findElement(By.id("elementosForm:comidaFavorita:3")).click();

		driver.findElement(By.id("elementosForm:cadastrar")).click();

		Alert alert = driver.switchTo().alert();
		String msg = alert.getText();

		Assert.assertEquals("Tem certeza que voce eh vegetariano?", msg);
		alert.accept();
	}

	@Test
	public void deveValidarEsportistaIndeciso() {
		driver.findElement(By.id("elementosForm:nome")).sendKeys("Joao Antonio");
		driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("da Silva Lima Paiva");
		driver.findElement(By.id("elementosForm:sexo:0")).click();
		driver.findElement(By.id("elementosForm:comidaFavorita:0")).click();

		WebElement esportes = driver.findElement(By.id("elementosForm:esportes"));
		Select combo = new Select(esportes);
		combo.selectByVisibleText("Corrida");
		combo.selectByVisibleText("O que eh esporte?");

		driver.findElement(By.id("elementosForm:cadastrar")).click();

		Alert alert = driver.switchTo().alert();
		String msg = alert.getText();

		Assert.assertEquals("Voce faz esporte ou nao?", msg);
		alert.accept();
	}
}