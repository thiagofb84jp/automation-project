package br.pb.cursoselenium.core;

import static br.pb.cursoselenium.core.DriverFactory.getDriver;
import static br.pb.cursoselenium.core.DriverFactory.killDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import br.pb.cursoselenium.pages.LoginPage;

public class BaseTest {

	Rule
	public TestName testName = new TestName();


	ivate LoginPage page = new LoginPage();



	fore
	public void inicializa() {
		page.acessarTelaInicial();

	

		setEmail("thiagofb84jp@gmail.com");
		page.setSenha("abcd_123");
		page.entrar();
	}

	@A

	
	public void finaliza() throws IOException {

		TakesScreenshot ss = (TakesScreenshot) getDriver();
		File arquivo = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(arquivo, new File(
				"target" + File.separator + "screenshot" + File.separator + testName.getMethodName() + ".jpg"));

		if (Propriedades.FECHAR_BROWSER) {
			killDriver();
		}
	}
}
