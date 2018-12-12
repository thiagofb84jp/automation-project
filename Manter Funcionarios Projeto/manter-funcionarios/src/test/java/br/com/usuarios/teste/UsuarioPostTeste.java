package br.com.usuarios.teste;

import org.junit.Before;
import org.junit.Test;

import br.com.usuarios.page.UsuarioPostPage;
import io.restassured.RestAssured;

public class UsuarioPostTeste {
	
	private static final String URL_TESTES = "http://localhost:8080/";
	
	UsuarioPostPage usrPostPage = new UsuarioPostPage();
	
	@Before
	public void iniciarURLTestes() {
		RestAssured.baseURI = URL_TESTES;
	}
	
	@Test
	public void cadastrarUsuarioComCamposVazios() {
		usrPostPage.informarValor("nome", "");
		usrPostPage.informarValor("login", "");
		usrPostPage.informarValor("senha", "");
		
		usrPostPage.validarStatus(500);
	}
	
	@Test
	public void cadastrarUsuarioComURLInvalida() {
		usrPostPage.informarValor("nome", "Raimundo Lucas Juan Figueiredo");
		usrPostPage.informarValor("login", "raimundo.figueiredo");
		usrPostPage.informarValor("senha", "ddd_009");
		
		usrPostPage.validarStatusURL(404);
	}
	
	@Test
	public void cadastrarUsuarioSemInformarNome() {
		usrPostPage.informarValor("nome", "");
		usrPostPage.informarValor("login", "laura.assuncao");
		usrPostPage.informarValor("senha", "abc9_221");
		
		usrPostPage.validarStatus(500);
	}

	@Test
	public void cadastrarUsuarioSemInformarLogin() {
		usrPostPage.informarValor("nome", "Laura Flávia Alves");
		usrPostPage.informarValor("login", "");
		usrPostPage.informarValor("senha", "abc9_552");
		
		usrPostPage.validarStatus(500);
	}
	
	@Test
	public void cadastrarUsuarioSemInformarSenha() {
		usrPostPage.informarValor("nome", "Laura Flávia Alves");
		usrPostPage.informarValor("login", "laura.alves");
		usrPostPage.informarValor("senha", "");
		
		usrPostPage.validarStatus(500);
	}
	
	@Test
	public void cadastrarUsuarioComSucesso() {
		usrPostPage.informarValor("nome", "Augusto Anderson Fernandes");
		usrPostPage.informarValor("login", "augusto.fernandes");
		usrPostPage.informarValor("senha", "abcd_998");
		
		usrPostPage.validarStatus(201);
	}
	
	@Test
	public void cadastrarUsuarioExistente() {
		usrPostPage.informarValor("nome", "Augusto Anderson Fernandes");
		usrPostPage.informarValor("login", "augusto.fernandes");
		usrPostPage.informarValor("senha", "abcd_998");
		
		usrPostPage.validarStatus(500);
	}
	
	@Test
	public void validarUsuarioAtivo() {
		usrPostPage.informarValor("nome", "Augusto Anderson Fernandes");
		usrPostPage.informarValor("login", "augusto.fernandes");
		usrPostPage.informarValor("senha", "abcd_998");
		
		usrPostPage.validarStatusUsuario("true", true);
	}
}