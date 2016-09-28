require 'rubygems'
require 'selenium-webdriver'

Selenium::WebDriver::Firefox::Binary.path = "/path/to/firefox"

driver = Selenium::WebDriver.for :firefox, marionette: true
driver.navigate.to "http://www.google.com"

element = driver.find_element(:name, 'q')
element.send_keys "Hello Selenium Webdriver!"
element.submit

puts driver.title
