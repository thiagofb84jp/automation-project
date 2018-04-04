package br.pb.devin.pages;

import org.openqa.selenium.By;

import br.pb.core.BasePage;

public class CalculadoraSimplesPage extends BasePage {

	public void setValor1(String valor) {
		dsl.escrever("valor1", valor);
	}

	public void setValor2(String valor) {
		dsl.escrever("valor2", valor);
	}

	public void setOperacao(String valor) {
		dsl.selecionarCombo("oper", valor);
	}

	public void setCalcular() {
		dsl.clicarBotao(By.className("botao"));
	}
	
	public String obterResultado() {
		return dsl.obterValorCampo("res");
	}
}
