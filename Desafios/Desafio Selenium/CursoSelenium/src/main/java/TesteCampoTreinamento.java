import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteCampoTreinamento {
	
	@Test
	public void teste() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///media/thiago/9414FF9714FF7B16/Automacao/Cursos%20Udemy/Selenium/campo-treinamento/componentes.html");
		
		driver.quit();
	}
}
