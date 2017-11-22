require 'selenium-webdriver'

#Start Browser
driver = Selenium::WebDriver.for(:chrome)
driver.manage().window().maximize
driver.navigate.to("file:///media/thiago/9414FF9714FF7B16/projetos-automacao/selenium-webdriver/site/index.html")

#Find Element By CSS
driver.find_element(:link_text, "Button").click

wait = Selenium::WebDriver::Wait.new(:timeout => 10)
wait.until { driver.title == "Buttons" }

driver.find_element(:class, "firefox").click
driver.find_element(:class, "chrome").click
driver.find_element(:class, "ie").click
driver.find_element(:class, "opera").click
driver.find_element(:class, "safari").click

driver.find_element(:class, "user").send_keys("Jose da Silva Lacerda")
driver.find_element(:class, "password").send_keys("abdce")

sleep 2

driver.find_element(:class, "submit_action").click

puts "All tests PASS!"

driver.quit