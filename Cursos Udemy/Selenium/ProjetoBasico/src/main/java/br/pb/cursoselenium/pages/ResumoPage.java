package br.pb.cursoselenium.pages;

import org.openqa.selenium.By;

import br.pb.cursoselenium.core.BasePage;

public class ResumoPage extends BasePage {

	public void excluirMovimentacao() {
		clicarBotao(By.xpath("//span[@class='glyphicon glyphicon-remove-circle']"));
	}

	ublic String obterMensagemSucesso() {
		return obterTexto(By.xpath("//div[@class='alert alert-success']"));
	}


	blic void selecionarAno(String ano) {
		selecionarCombo("ano", "2016");
	}



	lic void buscar() {
		clicarBotao(By.xpath("//input[@value='Buscar']"));
	}
}