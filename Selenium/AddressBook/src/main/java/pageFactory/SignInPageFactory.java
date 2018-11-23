package pageFactory;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPageFactory {

	/**
	 * All WebElements are identified by @FindBy annotation
	 * 
	 */

	WebDriver driver;

	@FindBy(id = "session_email")
	WebElement email;

	@FindBy(id = "session_password")
	WebElement password;

	@FindBy(xpath = "//input[@value='Sign in']")
	WebElement btnSignIn;

	@FindBy(xpath = "//div[@class='alert alert-notice']")
	WebElement badMessage;

	@FindBy(linkText = "Sign in")
	WebElement linkSignIn;

	@FindBy(xpath = "//span[@class='navbar-text']")
	WebElement userLogged;

	@FindBy(xpath = "//div[@class='container']//h4")
	WebElement goodMessage;

	@FindBy(linkText = "Sign out")
	WebElement linkSignOut;

	public SignInPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); // This initElements method will create all WebElements
	}

	public void setEmail(String strEmail) {
		email.click();
		email.clear();
		email.sendKeys(strEmail);
	}

	public void setPassword(String strPassword) {
		password.click();
		password.clear();
		password.sendKeys(strPassword);
	}

	public void clickBtnSignIn() {
		btnSignIn.click();
	}

	public void clickLinkSignIn() {
		linkSignIn.click();
	}

	public void clickLinkSignOut() {
		linkSignOut.click();
	}
	
	public void validateBadMessage(String strBadMessage) {
		String getResult = badMessage.getText();
		Assert.assertEquals(getResult, strBadMessage);
	}
	
	public void validateUserLoggedIn(String strUserLogged, String strGoodMessage) {
		String getResultUser = userLogged.getText();
		Assert.assertEquals(getResultUser, strUserLogged);
		
		String getGoodMessage = goodMessage.getText();
		Assert.assertEquals(getGoodMessage, strGoodMessage);
	}
}
