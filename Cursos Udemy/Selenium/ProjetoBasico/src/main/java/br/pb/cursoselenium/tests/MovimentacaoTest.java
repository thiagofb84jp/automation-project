package br.pb.cursoselenium.tests;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.pb.cursoselenium.core.BaseTest;
import br.pb.cursoselenium.core.Propriedades;
import br.pb.cursoselenium.pages.MenuPage;
import br.pb.cursoselenium.pages.MovimentacaoPage;
import br.pb.cursoselenium.utils.DataUtils;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MovimentacaoTest extends BaseTest {

	private MenuPage menuPage = new MenuPage();
	private MovimentacaoPage movPage = new MovimentacaoPage();

	@Test
	public void test1_InserirMovimentacao() {
		menuPage.acessarTelaInserirMovimentacao();

		movPage.setDataMovimentacao(DataUtils.obterDataFormatada(new Date()));
		movPage.setDataPagamento(DataUtils.obterDataFormatada(new Date()));
		movPage.setDescricao("Movimentação 002");
		movPage.setInteressado("Jośe da Silva Santos Lima");
		movPage.setValor("500");
		movPage.setConta(Propriedades.NOME_CONTA_ALTERADA);
		movPage.setStatusPago();
		movPage.salvar();

		Assert.assertEquals("Movimentação adicionada com sucesso!", movPage.obterMensagemSucesso());
	}
	
	@Test
	public void test2_CamposObrigatorios() {
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
	
	@Test
	public void test3_InserirMovimentacaoFutura() {
		menuPage.acessarTelaInserirMovimentacao();
		
		Date dataFutura = DataUtils.obterDataComDiferencaDias(5);
		
		movPage.setDataMovimentacao(DataUtils.obterDataFormatada(dataFutura));
		movPage.setDataPagamento(DataUtils.obterDataFormatada(dataFutura));
		movPage.setDescricao("Movimentação 002");
		movPage.setInteressado("Jośe da Silva Santos Lima");
		movPage.setValor("700");
		movPage.setConta(Propriedades.NOME_CONTA_ALTERADA);
		movPage.setStatusPago();
		movPage.salvar();
		
		List<String> erros = movPage.obterErros();
		Assert.assertTrue(erros.contains("Data da Movimentação deve ser menor ou igual à data atual"));
		Assert.assertEquals(1, erros.size());
	}
}
