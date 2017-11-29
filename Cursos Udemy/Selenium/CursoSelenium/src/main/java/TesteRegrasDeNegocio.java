import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteRegrasDeNegocio {

	private WebDriver driver;
	private DSL dsl;
	private CampoTreinamentoPage page;

	@Before
	public void inicializa() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		dsl = new DSL(driver);
		page = new CampoTreinamentoPage(driver);
	}

	@After
	public void finaliza() {
		driver.quit();
	}

	@Test
	public void deveValidarNomeObrigatorio() {
		page.cadastrar();
		Assert.assertEquals("Nome eh obrigatorio", dsl.alertaObterTextoEAceita());
	}

	@Test
	public void deveValidarSobrenomeObrigatorio() {
		page.setNome("Joao Antonio");
		page.cadastrar();

		Assert.assertEquals("Sobrenome eh obrigatorio", dsl.alertaObterTextoEAceita());
	}

	@Test
	public void deveValidarSexoObrigatorio() {
		page.setNome("Joao Antonio");
		page.setSobrenome("da Silva Lima Paiva");
		page.cadastrar();

		Assert.assertEquals("Sexo eh obrigatorio", dsl.alertaObterTextoEAceita());
	}

	@Test
	public void deveValidarComidaVegetariano() {
		page.setNome("Joao Antonio");
		page.setSobrenome("da Silva Lima Paiva");
		page.setSexoMasculino();
		page.setComidaCarne();
		page.setComidaVegetariano();
		page.cadastrar();

		Assert.assertEquals("Tem certeza que voce eh vegetariano?", dsl.alertaObterTextoEAceita());
	}

	@Test
	public void deveValidarEsportistaIndeciso() {
		page.setNome("Joao Antonio");
		page.setSobrenome("da Silva Lima Paiva");
		page.setSexoMasculino();
		page.setComidaCarne();
		page.setEsporte("Corrida", "O que eh esporte?");
		page.cadastrar();

		Assert.assertEquals("Voce faz esporte ou nao?", dsl.alertaObterTextoEAceita());
	}
}