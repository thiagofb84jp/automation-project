require 'rubygems'
require 'selenium-webdriver'

driver = Selenium::WebDriver.for(:chrome)
driver.manage().window().maximize
driver.navigate.to("http://www.google.com")

element = driver.find_element :name => "q"
element.send_keys "Cheese!"
element.submit

puts "Page title is #{driver.title}"

wait = Selenium::WebDriver::Wait.new(:timeout => 15)
wait.until { driver.title.downcase.start_with? "cheese!" }

puts "Page title is #{driver.title}"
driver.quit
