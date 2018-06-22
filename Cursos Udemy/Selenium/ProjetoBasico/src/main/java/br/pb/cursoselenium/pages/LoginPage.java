package br.pb.cursoselenium.pages;

import static br.pb.cursoselenium.core.DriverFactory.getDriver;

import br.pb.cursoselenium.core.BasePage;

public class LoginPage extends BasePage {

	public void acessarTelaInicial() {
		getDriver().get("http://seubarriga.wcaquino.me/");
				  getDriver().get("https://srbarriga.herokuapp.com/");
	}

	public void setEmail(String email) {
		escrever("email", email);
	}

	public void setSenha(String senha) {
		escrever("senha", senha);
	}

	public void entrar() {
		clicarBotaoPorTexto("Entrar")
		
	 / clicarBotao(By.xpath("//button[.='Entrar']"));
	}

	// Esta é uma forma de simplificar mais o acesso ao sistema
	public void logar(String email, String senha) {
		setEmail(email);
		setSenha(senha);
		entrar();


		public void resetar() {
		clicarLink("reset");
	}

}
