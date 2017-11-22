require 'selenium-webdriver'

#Start Browser
driver = Selenium::WebDriver.for(:chrome)
driver.manage().window().maximize
driver.navigate.to("file:///media/thiago/9414FF9714FF7B16/projetos-automacao/selenium-webdriver/site/index.html")

#Find Element By Chains
driver.find_element(:link_text, "Checkbox").click

wait = Selenium::WebDriver::Wait.new(:timeout => 10)
wait.until { driver.title == "Checkbox" }

driver.find_element(:id, "checkbox_bike").click
driver.find_element(:id, "div2").find_element(:name, "same").click

driver.find_element(:id, "icheck-checkboxes").find_element(:xpath, '//*[@id="icheck-checkboxes"]/div[3]/ins').click
#driver.find_element(:xpath, '//*[@id="icheck-checkboxes"]/div[3]/ins').click

sleep 2

#Return to home page
driver.find_element(:link_text, "Back").click

puts "All tests PASS!"

driver.quit