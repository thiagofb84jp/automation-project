require 'selenium-webdriver'

driver = Selenium::WebDriver.for(:firefox)
driver.navigate.to("http://testwisely.com/demo")

sleep 2

driver.quit