require 'selenium-webdriver'

#Start Browser
driver = Selenium::WebDriver.for(:chrome)
driver.manage().window().maximize
driver.navigate.to("file:///media/thiago/9414FF9714FF7B16/projetos-automacao/selenium-webdriver/site/index.html")

#Find Multiple Elements
driver.find_element(:link_text, "Checkbox").click

wait = Selenium::WebDriver::Wait.new(:timeout => 10)
wait.until { driver.title == "Checkbox" }

checkbox_elems = driver.find_elements(:xpath, '//*[@id="container"]/form')
checkbox_elems.count
#sleep 2
checkbox_elems[1].click

sleep 2

#Return to home page
driver.find_element(:link_text, "Back").click

puts "#{checkbox_elems.count}"
puts "All tests PASS!"

driver.quit