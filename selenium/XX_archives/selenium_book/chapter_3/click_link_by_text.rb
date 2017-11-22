require 'selenium-webdriver'

#Start Browser
driver = Selenium::WebDriver.for(:chrome)
driver.manage().window().maximize
driver.navigate.to("file:///media/thiago/9414FF9714FF7B16/projetos-automacao/selenium-webdriver/site/index.html")

#Click a Link By Text
driver.find_element(:link_text, "Hyperlink").click

wait = Selenium::WebDriver::Wait.new(:timeout => 10)
wait.until { driver.title == "Links" }

driver.find_element(:link_text, "Recommend Selenium").click
driver.find_element(:link_text, "Back").click

driver.find_element(:link_text, "Full link").click
driver.find_element(:link_text, "Back").click

driver.find_element(:link_text, "Back").click

sleep 2

puts "All tests PASS!"

driver.quit