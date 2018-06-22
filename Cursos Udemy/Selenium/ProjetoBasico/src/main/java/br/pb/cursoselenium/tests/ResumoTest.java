package br.pb.cursoselenium.tests;

import java.util.List;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import br.pb.cursoselenium.core.BaseTest;
import br.pb.cursoselenium.core.DriverFactory;
import br.pb.cursoselenium.pages.MenuPage;
import br.pb.cursoselenium.pages.ResumoPage;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ResumoTest extends BaseTest {

	private MenuPage menuPage = new MenuPage();
	private ResumoPage resumoPage = new ResumoPage();

	@Test
	public void test1_ExcluirMovimentacao() {
		menuPage.acessarTelaResumo();

		resumoPage.excluirMovimentacao();

		Assert.assertEquals("Movimentação removida com sucesso!", resumoPage.obterMensagemSucesso());
	}

	// @Test(expected=NoSuchElementException.class) - Uma das formas de se gerar uma
	// 	// exceção para os testes
	@Test
	public void test2_ResumoMensal() {
		menuPage.acessarTelaResumo();

		Assert.assertEquals("Seu Barriga - Extrato", DriverFactory.getDriver().getTitle

				resumoPage.selecionarAno("2016");
		resumoPage.buscar(

		List<WebElement> elementosEncontrados = rFactory.getDriver()
				
				.findElements(By.xpath("//*[@id='tabelaExtrato']/tbody/tr"));
		Assert.assertEquals(0, elementosEncontrados.size());

		
	
		 *  try  iverFactory.getDriver().findElement(By.xpath(
	
		 * 	 * "//*[@id='tabelaExtrato']/tbody/tr  Assert.fail() catch (Exception e) {

		 *  // Caso caia nesta linha, não faça nada 

		 */
	}
}