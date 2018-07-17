import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteCampoTreinamento {

	@Test
	public void deveInteragirComTextField() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");

		driver.findElement(By.id("elementosForm:nome")).sendKeys("José");
		driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("da Silva");

		Assert.assertEquals("José", driver.findElement(By.id("elementosForm:nome")).getAttribute("value"));
		Assert.assertEquals("da Silva", driver.findElement(By.id("elementosForm:sobrenome")).getAttribute("value"));

		driver.quit();
	}
	
	@Test
	public void deveInteragirComTextArea() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");

		driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("Lorem ipsum\nLorem Ipsum\nLorem Ipsum");
		Assert.assertEquals("Lorem ipsum\nLorem Ipsum\nLorem Ipsum", driver.findElement(By.id("elementosForm:sugestoes")).getAttribute("value"));
		
		driver.quit();		
	}
}