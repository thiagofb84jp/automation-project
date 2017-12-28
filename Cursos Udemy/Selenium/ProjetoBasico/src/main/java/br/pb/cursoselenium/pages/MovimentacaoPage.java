package br.pb.cursoselenium.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import br.pb.cursoselenium.core.BasePage;
import br.pb.cursoselenium.core.DriverFactory;

public class MovimentacaoPage extends BasePage {

	public void setDataMovimentacao(String data) {
		escrever("data_transacao", "28/12/2017");
	}

	public void setDataPagamento(String data) {
		escrever("data_pagamento", "28/01/2018");
	}

	public void setDescricao(String descricao) {
		escrever("descricao", descricao);
	}

	public void setInteressado(String interessado) {
		escrever("interessado", interessado);
	}

	public void setValor(String valor) {
		escrever("valor", valor);
	}

	public void setConta(String conta) {
		selecionarCombo("conta", conta);
	}

	public void setStatusPago() {
		clicarRadio("status_pago");
	}

	public void salvar() {
		clicarBotaoPorTexto("Salvar");
	}

	public String obterMensagemSucesso() {
		return obterTexto(By.xpath("//div[@class='alert alert-success']"));
	}

	public List<String> obterErros() {
		List<WebElement> erros = DriverFactory.getDriver()
				.findElements(By.xpath("//div[@class='alert alert-danger']//li"));
		List<String> retorno = new ArrayList<String>();
		for (WebElement erro : erros) {
			retorno.add(erro.getText());
		}
		return retorno;
	}
}
