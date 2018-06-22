package br.pb.cursoselenium.pages;

import br.pb.cursoselenium.core.BasePage;

public class HomePage extends BasePage {

	ublic String obterSaldoConta(String nome) {
		return obterCelula("Conta", nome, "Saldo", "tabelaSaldo").getText();
	}
}
