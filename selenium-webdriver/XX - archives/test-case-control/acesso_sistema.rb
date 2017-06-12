require 'rubygems'
require 'selenium-webdriver'

driver = Selenium::WebDriver.for(:chrome)
driver.manage().window().maximize
driver.navigate.to("https://dev.control.eng.br/acessos")

sleep 5

#Caso de teste 1: Acesso ao sistema com usuario valido

driver.find_element(:id, "usuario_login").send_keys("thiago.barbosa")
driver.find_element(:id, "usuario_senha").send_keys("")
driver.find_element(:id, "submit_login").click

sleep 5

puts "Page title is: " + driver.title

if driver.title == "Intranet"
   puts "PASS!"
else
   puts "FAIL!"
end

sleep 5

driver.find_element(:link_text, "Logout").click

sleep 5

#Caso de teste 2: Acesso ao sistema com usuario invalido

driver.find_element(:id, "usuario_login").send_keys("carla.andrade")
driver.find_element(:id, "usuario_senha").send_keys("")
driver.find_element(:id, "submit_login").click

sleep 5

driver.quit
