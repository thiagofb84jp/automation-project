require 'rubygems'
require 'selenium-webdriver'

driver = Selenium::WebDriver.for(:chrome)
driver.manage().window().maximize
driver.navigate.to("https://dev.control.eng.br/acessos")

sleep 1

driver.quit
