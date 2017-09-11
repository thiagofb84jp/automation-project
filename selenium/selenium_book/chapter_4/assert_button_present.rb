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

	it "Assert a button present" do
		expect(@driver.find_element(:id, "choose_firefox_btn").displayed?).to be_truthy
		@driver.find_element(:link_text, "Hide").click
		sleep 0.5
		expect(@driver.find_element(:id, "choose_firefox_btn").displayed?).to be_falsey
	end
end