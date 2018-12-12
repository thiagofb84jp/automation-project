package br.pb.todoapp;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.pb.core.PageObject;

public class CreateTaskPage extends PageObject{
	
	public CreateTaskPage(WebDriver driver) {
		super(driver);
	}
	
	public void informarDescricaoTarefa(String descricao) {
		driver.findElement(By.id("new_task")).sendKeys(descricao);
	}
	
	public void adicionarTarefa() {
		driver.findElement(By.xpath("//span[@class='input-group-addon glyphicon glyphicon-plus']")).click();
	}

	public void obterLink(String link) {
		driver.findElement(By.linkText(link)).click();	
	}
	
	public void gerenciarSubtarefas() {
		driver.findElement(By.xpath("//table/tbody/tr[1]/td[4]/button")).click();
	}
	
	public void validarDescricaoTarefa(String valorResultado) {
		String getResultado = driver.findElement(By.xpath("//div[@class='alert alert-info']")).getText();
		Assert.assertEquals(valorResultado, getResultado);
	}
	
	/*
	 * Semana que vem (08/10):
	 * - Executar o primeiro caso de teste;
	 * - Procurar um método genérico para clicar nas subtarefas;
	 */
}