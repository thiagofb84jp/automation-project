import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteGoogle {

	@Test
	public void teste() throws InterruptedException {
//		System.setProperty("webdriver.gecko.driver", "/home/thiago/bin"); //Indica o local onde o Geckodriver foi descompactado
//		WebDriver driver = new FirefoxDriver(); //Chamada ao browser 'Firefox'
//		WebDriver driver = new InternetExplorerDriver(); //Chamada ao browser 'Internet Explorer'
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		Assert.assertEquals("Google", driver.getTitle());;
		
		driver.quit();
		//driver.close();
	}
}