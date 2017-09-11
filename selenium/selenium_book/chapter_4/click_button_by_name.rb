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

	it "Click button by name" do
		@driver.find_element(:name, "choose_firefox_btn").click
		@driver.find_element(:name, "choose_chrome_btn").click
		@driver.find_element(:name, "choose_ie_btn").click
		@driver.find_element(:name, "choose_opera_btn").click
		@driver.find_element(:name, "choose_safari_btn").click
		sleep 2
	end
end