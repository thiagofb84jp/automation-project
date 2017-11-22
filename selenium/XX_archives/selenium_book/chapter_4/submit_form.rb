require 'selenium-webdriver'
require 'rspec'

describe "Selenium Recipes - Chapter 4 (Buttons)" do

	before(:all) do
		@driver = Selenium::WebDriver.for(:chrome)
		@driver.manage().window().maximize
	end

	before(:each) do
		@site_url = "file:///media/thiago/9414FF9714FF7B16/Automacao/selenium/site/index.html"
		@driver.navigate.to(@site_url)
		@driver.find_element(:link_text, "Button").click
	end

	after(:all) do
		@driver.quit
	end

	it "Submit a form" do
		@driver.find_element(:name, "login").send_keys("agileway")
		@driver.find_element(:name, "passwrd").send_keys("secret")
		@driver.find_element(:xpath, '//*[@id="form"]/button').click
		expect(@driver.page_source).to include("Your login")
		expect(@driver.page_source).to include("Your password")
		sleep 2
	end
end