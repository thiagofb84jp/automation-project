package br.pb.demoCSCart;

import org.junit.Test;

import br.pb.core.FuncionalTest;

public class ProcurarProdutosTeste extends FuncionalTest{

	private static final String URL_DEMO_STORE = "http://demo.cs-cart.com/";

	ProcurarProdutosPage procurarProdutosPage = new ProcurarProdutosPage(driver);
	
	public ProcurarProdutosTeste() {
		driver.get(URL_DEMO_STORE);
	}
	
	@Test
	public void adicionarProdutosCarrinho() throws InterruptedException {
		procurarProdutosPage.infomarProduto("Batman");
		procurarProdutosPage.pesquisar();
		procurarProdutosPage.selecionarProduto("Batman: Arkham City (X360)");
		procurarProdutosPage.adicionarCarrinho();
		procurarProdutosPage.fecharJanela();
		procurarProdutosPage.clicarLogoDemoStore();
		procurarProdutosPage.infomarProduto("PS3");
		procurarProdutosPage.pesquisar();
		procurarProdutosPage.selecionarProduto("F.E.A.R. 3 (PS3) MX");
		procurarProdutosPage.adicionarCarrinho();
		procurarProdutosPage.fecharJanela();
		
	}
}
