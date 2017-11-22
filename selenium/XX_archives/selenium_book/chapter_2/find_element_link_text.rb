require 'selenium-webdriver'

#Start Browser
driver = Selenium::WebDriver.for(:chrome)
driver.manage().window().maximize
driver.navigate.to("file:///media/thiago/9414FF9714FF7B16/projetos-automacao/selenium-webdriver/site/index.html")

#Find Element By Link Text
driver.find_element(:link_text, "Hyperlink").click
driver.find_element(:link_text, "Back").click

driver.find_element(:link_text, "Button").click
driver.find_element(:link_text, "Back").click

driver.find_element(:link_text, "Text Field").click
driver.find_element(:link_text, "Back").click

driver.find_element(:link_text, "Radio button").click
driver.find_element(:link_text, "Back").click

driver.find_element(:link_text, "Checkbox").click
driver.find_element(:link_text, "Back").click

sleep 2

puts "All tests PASS!"

driver.quit