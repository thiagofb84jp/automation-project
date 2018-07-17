package br.pb.cursoselenium.runners;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/", //Localiza as features
		glue = "br.pb.cursoselenium.steps", //Localiza os arquivos de steps
		tags = {"@funcionais"},
		plugin = {"pretty", "html:target/report.html", "json:target/report.json"},
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		dryRun = true, // Valida se o cenário está correto. Por padrão, o valor é 'false'
		strict = false // 'Força' um erro quando inserido um step sem mapeá-lo 
		)
public class RunnerFuncionalTest {
	
	@BeforeClass
	public static void reset() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://srbarriga.herokuapp.com/");
		driver.findElement(By.id("email")).sendKeys("thiagofb84jp@gmail.com");
		driver.findElement(By.name("senha")).sendKeys("abcd_123");
		driver.findElement(By.tagName("button")).click();
		driver.findElement(By.linkText("reset")).click();
		driver.quit();
	}
}