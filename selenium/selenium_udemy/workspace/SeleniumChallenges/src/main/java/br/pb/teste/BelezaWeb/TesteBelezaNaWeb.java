package br.pb.teste.BelezaWeb;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteBelezaNaWeb {

	private WebDriver driver;

	@Before
	public void inicializa() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.belezanaweb.com.br/");
	}
	
	@After
	public void finaliza() {
		driver.quit();
	}	

}
