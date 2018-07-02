package br.pb.devin.pages;

import org.openqa.selenium.By;

import br.pb.core.BasePage;

public class CalculadoraComplexaPage extends BasePage{
	
	public void setValor(String valor) {
		dsl.clicarBotao(By.xpath("//input[@value='"+valor+"']"));
	}
	
	public void setOperacao(String valor) {
		dsl.clicarBotao(By.xpath("//input[@value='"+valor+"']"));
	}
	
	public void setCalcular() {
		dsl.clicarBotao(By.xpath("//input[@value='=']"));
	}

	public String obterResultado() {
		return dsl.obterValorCampo("visor");
	}

}