require 'selenium-webdriver'

#Start Browser
driver = Selenium::WebDriver.for(:chrome)
driver.manage().window().maximize
driver.navigate.to("file:///media/thiago/9414FF9714FF7B16/projetos-automacao/selenium-webdriver/site/index.html")

#Find Element By Xpath
driver.find_element(:xpath, '//*[@id="container"]/ul/li[4]/a[2]').click
driver.find_element(:xpath, '//*[@id="radio_male"]').click
driver.find_element(:xpath, '//*[@id="q1"]/div/div[1]/label').click
driver.find_element(:xpath, '//*[@id="icheck-radios"]/div[1]/ins').click

sleep 2

#Return to home page
driver.find_element(:xpath, '//*[@id="container"]/a').click

puts "All tests PASS!"

driver.quit