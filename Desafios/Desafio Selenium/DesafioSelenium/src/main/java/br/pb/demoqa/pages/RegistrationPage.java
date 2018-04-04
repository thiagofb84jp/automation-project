package br.pb.demoqa.pages;

import org.openqa.selenium.By;

import br.pb.core.BasePage;

public class RegistrationPage extends BasePage{
	
	String msgErroNome = ".//*[@id='pie_register']/li[1]/div[1]/div[2]/span";
	
	public void submit() {
		dsl.clicarBotao(By.xpath(".//*[@id='pie_register']/li[14]/div/input"));
	}
	
	public void obterResultadoCadastro() {
		dsl.obterTexto(By.xpath(msgErroNome));
	}

}
