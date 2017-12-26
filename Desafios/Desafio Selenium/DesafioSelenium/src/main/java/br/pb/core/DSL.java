package br.pb.core;
import static br.pb.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DSL {

	/********* TextField e TextArea ************/
	public void escrever(String id, String texto) {
		getDriver().findElement(By.id(id)).clear();
		getDriver().findElement(By.id(id)).sendKeys(texto);
	}

	public String obterValorCampo(String id) {
		return getDriver().findElement(By.id(id)).getAttribute("value");
	}

	/********* Textos ************/
	public String obterTexto(By by) {
		return getDriver().findElement(by).getText();
	}

	/********* Botão ************/
	public void clicarBotao(By by) {
		getDriver().findElement(by).click();
	}
	
	public void clicarBotao(String id) {
		getDriver().findElement(By.id(id)).click();
	}
	
	/********* Links ************/
	public void clicarLink(String link) {
		getDriver().findElement(By.linkText(link)).click();
	}

	/********* Radio and Check ************/
	public void clicarRadio(String xpath) {
		getDriver().findElement(By.xpath(xpath)).click();
	}

	public boolean isRadioMarcado(String xpath) {
		return getDriver().findElement(By.xpath(xpath)).isSelected();
	}

	public void clicarCheck(String xpath) {
		getDriver().findElement(By.xpath(xpath)).click();
	}

	public boolean isCheckMarcado(String xpath) {
		return getDriver().findElement(By.xpath(xpath)).isSelected();
	}

	/********* Combo ************/
	public void selecionarCombo(String id, String valor) {
		WebElement element = getDriver().findElement(By.id(id));
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
	}

	public String obterValorCombo(String id) {
		WebElement element = getDriver().findElement(By.id(id));
		Select combo = new Select(element);
		return combo.getFirstSelectedOption().getText();
	}
}
