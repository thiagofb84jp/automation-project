package br.pb.cursoselenium.pages;

import org.openqa.selenium.By;

import br.pb.cursoselenium.core.BasePage;

public class ContasPage extends BasePage {

	public void setNome(String nome) {
		escrever("nome", nome);
	}
	
	public void salvar() {
		clicarBotaoPorTexto("Salvar");
//		clicarBotao(By.xpath("//button[.='Salvar']"));
	}
	
	public String obterMensagemSucesso() {
		return obterTexto(By.xpath("//div[@class='alert alert-success']"));
	}
	
	public String obterMensagemErro() {
		return obterTexto(By.xpath("//div[@class='alert alert-danger']"));
	}

	public void clicarAlterarConta(String string) {
		obterCelula("Conta", string, "Ações", "tabelaContas")
			.findElement(By.xpath(".//span[@class='glyphicon glyphicon-edit']")).click();
	}
	
	public void clicarExcluirConta(String string) {
		obterCelula("Conta", string, "Ações", "tabelaContas")
			.findElement(By.xpath(".//span[@class='glyphicon glyphicon-remove-circle']")).click();
	}

}
