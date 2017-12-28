package br.pb.cursoselenium.tests;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.pb.cursoselenium.core.BaseTest;
import br.pb.cursoselenium.pages.MenuPage;
import br.pb.cursoselenium.pages.MovimentacaoPage;

public class MovimentacaoTest extends BaseTest {

	private MenuPage menuPage = new MenuPage();
	private MovimentacaoPage movPage = new MovimentacaoPage();

	@Test
	public void testInserirMovimentacao() {
		menuPage.acessarTelaInserirMovimentacao();

		movPage.setDataMovimentacao("28/12/2017");
		movPage.setDataPagamento("28/01/2018");
		movPage.setDescricao("Movimentação 001");
		movPage.setInteressado("Jośe da Silva Santos Lima");
		movPage.setValor("500");
		movPage.setConta("conta_teste_alterada");
		movPage.setStatusPago();
		movPage.salvar();

		Assert.assertEquals("Movimentação adicionada com sucesso!", movPage.obterMensagemSucesso());
	}
	
	@Test
	public void testCamposObrigatorios() {
		menuPage.acessarTelaInserirMovimentacao();
		
		movPage.salvar();
		
		List<String> erros = movPage.obterErros();
//		Assert.assertEquals("Data da Movimentação é obrigatório", erros.get(0)); // Uma das formas de obter os erros
//		Assert.assertTrue(erros.contains("Data da Movimentação é obrigatório")); // Outra forma de obter os erros
		Assert.assertTrue(erros.containsAll(Arrays.asList(
				"Data da Movimentação é obrigatório",
				"Data do pagamento é obrigatório",
				"Descrição é obrigatório",
				"Interessado é obrigatório",
				"Valor é obrigatório",
				"Valor deve ser um número"
		))); // Monta uma coleção de textos e verifica todos os erros de uma única vez
		Assert.assertEquals(6, erros.size()); // Verifica se os '6' erros estão presentes 
	}
}
