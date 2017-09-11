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

	it "Click a button via Javascript" do
		the_btn = @driver.find_element(:id, "searchBtn")
		@driver.execute_script("arguments[0].click();", the_btn);
	end
end