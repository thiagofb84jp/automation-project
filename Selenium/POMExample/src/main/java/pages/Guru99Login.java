package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Guru99Login {
	
	WebDriver driver;
	
	By user99GuruName = By.name("uid");
	By password99Guru = By.name("password");
	By titleText = By.className("barone");
	By login = By.name("btnLogin");
	
	public Guru99Login(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setUserName(String strUserName) {
		driver.findElement(user99GuruName).sendKeys(strUserName);
	}
	
	//Inserir o método de password aqui

}
