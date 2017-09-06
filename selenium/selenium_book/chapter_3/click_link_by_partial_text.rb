require 'selenium-webdriver'

#Start Browser
driver = Selenium::WebDriver.for(:chrome)
driver.manage().window().maximize
driver.navigate.to("file:///media/thiago/9414FF9714FF7B16/projetos-automacao/selenium-webdriver/site/index.html")

#Click a Link By Partial Text
driver.find_element(:partial_link_text, "Hyper").click

wait = Selenium::WebDriver::Wait.new(:timeout => 10)
wait.until { driver.title == "Links" }


driver.find_element(:partial_link_text, "Partial").click
driver.page_source.include? "This is Selenium Page"
#driver.find_element(:h2, "This is Selenium Page").text.include? "This is Selenium Page"
#expect(driver.text).to include("This is partial link page")
driver.find_element(:link_text, "Back").click

driver.find_element(:partial_link_text, "Another").click
driver.page_source.include? "This is another partial link page"
#expect(driver.text).to include("This is another partial link page")
driver.find_element(:link_text, "Back").click

driver.find_element(:partial_link_text, "Door").click
driver.page_source.include? "This is other door partial link page"
#expect(driver.text).to include("This is other door partial link page")
driver.find_element(:link_text, "Back").click

driver.find_element(:link_text, "Back").click

sleep 2

puts "All tests PASS!"

driver.quit