﻿using System;
using System.Collections;
using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;
using OpenQA.Selenium.Support;
using OpenQA.Selenium.Support.UI;
using NUnit.Framework;

namespace SeleniumApiExamples
{
    [TestFixture]
    public class CheckboxTest
    {
        private IWebDriver driver;

        [TestFixtureSetUp]
        public void Setup() 
        {
            driver = new ChromeDriver(@"C:\ChromeDriver\");
            driver.Navigate().GoToUrl("https://dl.dropbox.com/u/55228056/Config.html");
        }

        [TestCase]
        public void TestCheckBox()
        {
 		    //Get the Checkbox as WebElement using it's value attribute
 		    IWebElement airbags = driver.FindElement(By.XPath("//input[@value='Airbags']"));
 		
 		    //Check if its already selected? otherwise select the Checkbox
 		    //by calling click() method
 		    if (!airbags.Selected)
 			    airbags.Click();
 		
 		    //Verify Checkbox is Selected
 		    Assert.IsTrue(airbags.Selected);

 		    //Check Checkbox if selected? If yes, deselect it
 		    //by calling click() method
 		    if (airbags.Selected)
 			    airbags.Click();
 		
 		    //Verify Checkbox is Deselected
 		    Assert.IsFalse(airbags.Selected);
        }
        [TestFixtureTearDown]
        public void TearDown() 
        {
            driver.Close();
        }
    }
}
