require 'selenium-webdriver'

#Start Browser
driver = Selenium::WebDriver.for(:chrome)
driver.manage().window().maximize
driver.navigate.to("file:///media/thiago/9414FF9714FF7B16/projetos-automacao/selenium-webdriver/site/index.html")

#Find Element By CSS Selector
driver.find_element(:link_text, "Button").click

wait = Selenium::WebDriver::Wait.new(:timeout => 10)
wait.until { driver.title == "Buttons" }