require 'rubygems'
require 'selenium-webdriver'

driver = Selenium::WebDriver.for(:chrome)
driver.manage().window().maximize
driver.navigate.to("file:///media/thiago/9414FF9714FF7B16/projetos-automacao/selenium-webdriver/site/index.html")

sleep 5

driver.find_element(:link_text, "Hyperlink").click

if driver.title == "Links"
	puts "Links Page PASS!"
else
	puts "FAIL!"
end

driver.find_element(:link_text, "Back").click

driver.find_element(:link_text, "Button").click

if driver.title == "Buttons"
	puts "Buttons Page PASS!"
else
	puts "FAIL!"
end

driver.find_element(:link_text, "Back").click

driver.find_element(:link_text, "Text Field").click

if driver.title == "Text Field"
	puts "Text Field PASS!"
else
	puts "FAIL!"
end

driver.find_element(:link_text, "Back").click

driver.find_element(:link_text, "Radio button").click

if driver.title == "Radio Button"
	puts "Radio Button PASS!"
else
	puts "FAIL!"
end

driver.find_element(:link_text, "Back").click

driver.find_element(:link_text, "Checkbox").click

if driver.title == "Checkbox"
	puts "Checkbox PASS!"
else
	puts "FAIL!"
end

driver.find_element(:link_text, "Back").click

sleep 3

driver.quit