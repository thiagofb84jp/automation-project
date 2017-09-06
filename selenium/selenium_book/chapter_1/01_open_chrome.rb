require 'selenium-webdriver'

driver = Selenium::WebDriver.for(:chrome)
driver.manage().window().maximize
driver.navigate.to("http://testwisely.com/demo")

sleep 2

driver.quit