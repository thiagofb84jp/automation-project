package br.com.funcionarios.teste;

import org.junit.Before;
import org.junit.Test;

import br.com.funcionarios.page.FuncionarioPostPage;
import io.restassured.RestAssured;

public class FuncionarioPostTeste {

	private static final String URL_TESTES = "http://localhost:8080/";
	
	FuncionarioPostPage funcPostPage = new FuncionarioPostPage();

	@Before
	public void iniciarURLTestes() {
		RestAssured.baseURI = URL_TESTES;
	}
	
	@Test
	public void cadastrarFuncionarioComCamposVazios() {
		funcPostPage.informarValor("nome", "");
		funcPostPage.informarValor("matricula", "");
		funcPostPage.informarValor("ocupacao", "");
		funcPostPage.informarValor("setor", "");
		
		funcPostPage.validarStatus(400);
	}
	
	@Test
	public void cadastrarFuncionarioComURLInvalida() {
		funcPostPage.informarValor("nome", "Márcio Marcelo Isaac Viana");
		funcPostPage.informarValor("matricula", "10203040");
		funcPostPage.informarValor("ocupacao", "COORDENADOR");
		funcPostPage.informarValor("setor", "FINANCEIRO");
		
		funcPostPage.validarStatusURL(404);
	}
	
	@Test
	public void cadastrarFuncionarioSemInformarNome() {
		funcPostPage.informarValor("nome", "");
		funcPostPage.informarValor("matricula", "10203040");
		funcPostPage.informarValor("ocupacao", "GERENTE");
		funcPostPage.informarValor("setor", "FINANCEIRO");
		
		funcPostPage.validarStatus(400);
	}
	
	@Test
	public void cadastrarFuncionarioSemInformarMatricula() {
		funcPostPage.informarValor("nome", "Oliver Lorenzo das Neves");
		funcPostPage.informarValor("matricula", "");
		funcPostPage.informarValor("ocupacao", "GERENTE");
		funcPostPage.informarValor("setor", "ATENDIMENTO");
		
		funcPostPage.validarStatus(400);
	}
	
	@Test
	public void cadastrarFuncionarioSemInformarOcupacao() {
		funcPostPage.informarValor("nome", "Pedro Filipe Igor Bernardes");
		funcPostPage.informarValor("matricula", "10203040");
		funcPostPage.informarValor("ocupacao", "");
		funcPostPage.informarValor("setor", "RH");
		
		funcPostPage.validarStatus(400);
	}
	
	@Test
	public void cadastrarFuncionarioComValorOcupacaoDiferente() {
		funcPostPage.informarValor("nome", "Pedro Filipe Igor Bernardes");
		funcPostPage.informarValor("matricula", "10203040");
		funcPostPage.informarValor("ocupacao", "SUPERVISOR");
		funcPostPage.informarValor("setor", "RH");
		
		funcPostPage.validarStatus(400);
	}
	
	@Test
	public void cadastrarFuncionarioComValorSetorDiferente() {
		funcPostPage.informarValor("nome", "Maria Eduarda da Silva Santos");
		funcPostPage.informarValor("matricula", "10203040");
		funcPostPage.informarValor("ocupacao", "GERENTE");
		funcPostPage.informarValor("setor", "ALMOXARIFADO");
		
		funcPostPage.validarStatus(400);
	}
	
	@Test
	public void cadastrarFuncionarioSemInformarSetor() {
		funcPostPage.informarValor("nome", "Maria Eduarda da Silva Santos");
		funcPostPage.informarValor("matricula", "10203040");
		funcPostPage.informarValor("ocupacao", "GERENTE");
		funcPostPage.informarValor("setor", "");
		
		funcPostPage.validarStatus(400);
	}
	
	@Test
	public void cadastrarFuncionarioComSucesso() {
		funcPostPage.informarValor("nome", "Melissa Aline Juliana Assunção");
		funcPostPage.informarValor("matricula", "15253545");
		funcPostPage.informarValor("ocupacao", "GERENTE");
		funcPostPage.informarValor("setor", "ATENDIMENTO");
		
		funcPostPage.validarStatus(201);
	}
	
	@Test
	public void cadastrarFuncionarioExistente() {
		funcPostPage.informarValor("nome", "Melissa Aline Juliana Assunção");
		funcPostPage.informarValor("matricula", "15253545");
		funcPostPage.informarValor("ocupacao", "GERENTE");
		funcPostPage.informarValor("setor", "ATENDIMENTO");
		
		funcPostPage.validarStatus(400);
	}
	
	@Test
	public void validarInsercaoMatricula() {
		funcPostPage.informarValor("nome", "Melissa Aline Juliana Assunção");
		funcPostPage.informarValor("matricula", "90807060");
		funcPostPage.informarValor("ocupacao", "GERENTE");
		funcPostPage.informarValor("setor", "ATENDIMENTO");
		
		funcPostPage.validarStatusUsuario("\"matricula\":null", false);
	}
}
