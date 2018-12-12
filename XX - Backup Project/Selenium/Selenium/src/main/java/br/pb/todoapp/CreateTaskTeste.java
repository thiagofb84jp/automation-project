package br.pb.todoapp;

import org.junit.Test;

import br.pb.core.FuncionalTest;

public class CreateTaskTeste extends FuncionalTest{
	
	private static final String URL_TODO_APP = "https://qa-test.avenuecode.com/";

	SignInPage signInPage = new SignInPage(driver);
	CreateTaskPage createTaskPage = new CreateTaskPage(driver);

	public CreateTaskTeste() {
		driver.get(URL_TODO_APP);
		signInPage.obterLink("Sign In");
		signInPage.obterEmail("hhenriquejorgetomasdamata@netpont.com.br");
		signInPage.obterSenha("abcd_123");
		signInPage.logar();
		
		createTaskPage.obterLink("My Tasks");
	}
	
	@Test
	public void adicionarTarefa() {
		createTaskPage.informarDescricaoTarefa("Fazer Compras no Supermercados");
		createTaskPage.adicionarTarefa();
	}
	
	@Test
	public void adicionarSubtarefas() {
		
	}
	
	@Test
	public void removerTarefas() {
		
	}
	
	@Test
	public void removerSubtarefas() {
		
	}	
}