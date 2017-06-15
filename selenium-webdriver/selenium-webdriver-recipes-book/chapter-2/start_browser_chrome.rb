require 'selenium-webdriver'

driver = Selenium::WebDriver.for(:chrome)
driver.navigate.to("file:///media/thiago/9414FF9714FF7B16/projetos-automacao/selenium-webdriver/site/index.html")

driver.quit