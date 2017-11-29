import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteDesafioCadastro {

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
	public void deveRealizarCadastroComSucesso() {
		page.setNome("Jose Antonio");
		page.setSobrenome("da Silva Gomes Lima");
		page.setSexoMasculino();
		page.setComidaFrango();
		page.setComidaPizza();
		page.setEscolaridade("Mestrado");
		page.setEsporte("Natacao", "Corrida");
		page.cadastrar();

		String getCadastrado = "Cadastrado!";
		String getNome = "Nome: Jose Antonio";
		String getSobrenome = "Sobrenome: da Silva Gomes Lima";
		String getSexo = "Sexo: Masculino";
		String getComida = "Comida: Frango Pizza";
		String getEscolaridade = "Escolaridade: mestrado";
		String getEsportes = "Esportes: Natacao Corrida";

		Assert.assertTrue(page.obterResultadoCadastro().startsWith(getCadastrado));
		Assert.assertEquals(getNome, page.obterNomeCadastro());
		Assert.assertEquals(getSobrenome, page.obterSobrenomeCadastro());
		Assert.assertEquals(getSexo, page.obterSexo());
		Assert.assertEquals(getComida, page.obterComidaCadastro());
		Assert.assertEquals(getEscolaridade, page.obterEscolaridadeCadastro());
		Assert.assertEquals(getEsportes, page.obterEsportesCadastro());
	}
}