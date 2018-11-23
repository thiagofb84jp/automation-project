package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Guru99Login {

	/**
	 * All WebElements are identified by @FindBy annotation
	 */

	WebDriver driver;
	
	@FindBy(name = "uid")
	WebElement user99GuruName;

	@FindBy(name = "password")
	WebElement password99Guru;

	@FindBy(className = "barone")
	WebElement titleText;

	@FindBy(name = "btnLogin")
	WebElement login;

	public Guru99Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); // This initElements method will create all WebElements
	}

	public void setUserName(String strUserName) {
		user99GuruName.sendKeys(strUserName);
	}

	public void setPassword(String strPassword) {
		password99Guru.sendKeys(strPassword);
	}

	public void clickLogin() {
		login.click();
	}

	public String getLoginTitle() {
		return titleText.getText();
	}

	/**
	 * This POM method will be exposed in test case to login in the application
	 * 
	 * @param strUserName
	 * @param strPassword
	 * @return
	 */

	public void loginToGuru99(String strUserName, String strPassword) {
		this.setUserName(strUserName); // Fill user name
		this.setPassword(strPassword); // Fill password
		this.clickLogin(); // Click login button
	}

	public void waitElements() {
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 100);
		PageFactory.initElements(factory, this);
	}
}
