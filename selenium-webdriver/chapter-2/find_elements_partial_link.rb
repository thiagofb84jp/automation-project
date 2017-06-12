require 'selenium-webdriver'

#Start Browser
driver = Selenium::WebDriver.for(:chrome)
driver.manage().window().maximize
driver.navigate.to("file:///media/thiago/9414FF9714FF7B16/projetos-automacao/selenium-webdriver/site/index.html")

#Find Element By Partial Link Text
driver.find_element(:link_text, "Hyperlink").click
driver.find_element(:partial_link_text, "Full").click
driver.find_element(:link_text, "Back").click

driver.find_element(:partial_link_text, "Partial").click
driver.find_element(:link_text, "Back").click
sleep 2

#Return to home page
driver.find_element(:link_text, "Back").click

puts "All tests PASS!"

driver.quit