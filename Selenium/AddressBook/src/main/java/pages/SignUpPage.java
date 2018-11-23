package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {

	WebDriver driver;

	By email = By.id("user_email");
	By password = By.id("user_password");
	By btnSignUp = By.name("commit");
	By linkSignIn = By.linkText("Sign in");
	By linkSignUp = By.linkText("Sign up");

	public SignUpPage(WebDriver driver) {
		this.driver = driver;
	}

	public void setEmail(String strEmail) {
		driver.findElement(email).click();
		driver.findElement(email).clear();
		driver.findElement(email).sendKeys(strEmail);
	}

	public void setPassword(String strPassword) {
		driver.findElement(password).click();
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys(strPassword);
	}

	public void clickBtnSignIn() {
		driver.findElement(btnSignUp).click();
	}

	public void clickLinkSignIn() {
		driver.findElement(linkSignIn).click();
	}

	public void clickLinkSignUp() {
		driver.findElement(linkSignUp).click();
	}

}
