require 'selenium-webdriver'

#Start Browser
driver = Selenium::WebDriver.for(:chrome)
driver.manage().window().maximize
driver.navigate.to("file:///media/thiago/9414FF9714FF7B16/projetos-automacao/selenium-webdriver/site/index.html")

#Find Element By ID
driver.find_element(:link_text, "Button").click

wait = Selenium::WebDriver::Wait.new(:timeout => 10)
wait.until { driver.title == "Buttons" }

driver.find_element(:id, "choose_firefox_btn").click
driver.find_element(:id, "choose_chrome_btn").click
driver.find_element(:id, "choose_ie_btn").click
driver.find_element(:id, "choose_opera_btn").click
driver.find_element(:id, "choose_safari_btn").click

driver.find_element(:id, "user").send_keys("Jose da Silva Lacerda")
driver.find_element(:id, "password").send_keys("abdce")
sleep 2
driver.find_element(:id, "submit_action").click

puts "All tests PASS!"

driver.quit