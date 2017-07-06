require 'selenium-webdriver'
require 'rspec'

describe "Selenium Recipes - Chapter 3 (Partial Link Text)" do

	before(:all) do
		@driver = Selenium::WebDriver.for(:chrome)
		@driver.manage().window().maximize
	end

	before(:each) do
		@driver.navigate.to("file:///media/thiago/9414FF9714FF7B16/projetos-automacao/selenium-webdriver/site/index.html")
		@driver.find_element(:link_text, "Hyperlink").click
	end

	after(:all) do
		@driver.quit
	end

	it "Expect" do
		expect(@driver.find_element(:id, "selenium").displayed?).to be_truthy
		expect(@driver.find_element(:id, "selenium").displayed?).not_to be_falsey
	end

	it "Should" do
		@driver.find_element(:link_text, "Recommend Selenium").displayed?.should be_truthy
		@driver.find_element(:id, "selenium").displayed?.should_not be_falsey
	end
end