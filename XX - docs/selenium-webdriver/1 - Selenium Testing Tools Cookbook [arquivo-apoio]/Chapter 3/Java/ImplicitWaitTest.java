import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitTest {
 	@Test
 	public void testWithOutWait()
 	{
 		//Go to the Demo AjAX Application
 		WebDriver driver = new FirefoxDriver();
        driver.get("http://dl.dropbox.com/u/55228056/AjaxDemo.html");
        
        try {
        	
        	//Get link for Page 4 and click on it
        	WebElement page4button = driver.findElement(By.linkText("Page 4"));
        	page4button.click();
        	
        	//Get an element with id page4 and verify it's text
        	//Test will fail to locate the element without an Implicit Wait
        	WebElement message = driver.findElement(By.id("page4"));
           	assertTrue(message.getText().contains("Nunc nibh tortor"));
        	
        } catch (NoSuchElementException e) {
        	fail("Element not found!!");
        	e.printStackTrace();
        } finally {
        	driver.close();
        }
 	}
 	
 	@Test
 	public void testWithImplicitWait()
 	{
 		//Go to the Demo AjAX Application
 		WebDriver driver = new FirefoxDriver();
        driver.get("http://dl.dropbox.com/u/55228056/AjaxDemo.html");
        
        //Set the Implicit Wait time Out to 10 Seconds
 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 		
 		try {

 			//Get link for Page 4 and click on it
 			WebElement page4button = driver.findElement(By.linkText("Page 4"));
 			page4button.click();
 		
 			//Get an element with id page4 and verify it's text
 			WebElement message = driver.findElement(By.id("page4"));
 			assertTrue(message.getText().contains("Nunc nibh tortor"));
 			
 		} catch (NoSuchElementException e) {
 			fail("Element not found!!");
 			e.printStackTrace();
 		} finally {
 			driver.close();
 		}
 	}
}


