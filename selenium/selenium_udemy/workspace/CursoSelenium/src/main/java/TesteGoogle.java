import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteGoogle {

	@Test
	public void verificarTituloPagina() {		
		//System.setProperty("webdriver.geckodriver", "inserir_local_onde_o_path_foi_descompactado/geckodriver.exe");	
//		WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		Assert.assertEquals("Google", driver.getTitle());
		
		driver.quit();
	}	
}