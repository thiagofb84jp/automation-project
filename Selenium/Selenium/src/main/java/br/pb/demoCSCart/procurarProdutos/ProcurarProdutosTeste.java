package br.pb.demoCSCart.procurarProdutos;

import org.junit.Test;

import br.pb.core.FuncionalTest;

public class ProcurarProdutosTeste extends FuncionalTest{

	private static final String URL_DEMO_STORE = "http://demo.cs-cart.com/";

	protected String produto1 = "Birds of Prey: The Complete Series (DVD)";
	protected String produto2 = "Green Lantern: Rise of the Manhunters (PS3)";
	
	ProcurarProdutosPage procurarProdutosPage = new ProcurarProdutosPage(driver);
	
	public ProcurarProdutosTeste() {
		driver.get(URL_DEMO_STORE);
	}
	
	@Test
	public void adicionarProdutosCarrinho() throws InterruptedException {
		procurarProdutosPage.infomarProduto("Batman");
		procurarProdutosPage.pesquisar();
		procurarProdutosPage.selecionarProduto(produto1);
		procurarProdutosPage.adicionarCarrinho();
		procurarProdutosPage.fecharJanela();
		
		procurarProdutosPage.clicarLogoDemoStore();
		
		procurarProdutosPage.infomarProduto("PS3");
		procurarProdutosPage.pesquisar();
		procurarProdutosPage.selecionarProduto(produto2);
		procurarProdutosPage.adicionarCarrinho();
		procurarProdutosPage.fecharJanela();
		
		procurarProdutosPage.clicarCarrinhoCompras();
		procurarProdutosPage.verificarCarro();
		
		procurarProdutosPage.validarResultado(produto1);
		procurarProdutosPage.validarResultado(produto2);
	}
}