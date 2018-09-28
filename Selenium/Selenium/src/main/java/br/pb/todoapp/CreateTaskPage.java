package br.pb.todoapp;

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
	
	public void salvarRegistro() {
		driver.findElement(By.xpath("//span[@class='input-group-addon glyphicon glyphicon-plus']")).click();
	}
}