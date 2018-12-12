require 'selenium-webdriver'
require 'rspec'

describe "Selenium Recipes - Chapter 3 (Partial Link Text)" do

	before(:all) do
		@driver = Selenium::WebDriver.for(:chrome)
		@driver.manage().window().maximize
	end

	before(:each) do
		@driver.navigate.to("file:///media/thiago/9414FF9714FF7B16/projetos-automacao/selenium-webdriver/site/index.html")
		@driver.find_element(:partial_link_text, "Hyper").click

	end

	after(:all) do
		@driver.quit
	end

	it "Click in partial link" do
		@driver.find_element(:partial_link_text, "Partial").click
		expect(@driver.page_source).to include("This is partial link page")
		@driver.find_element(:link_text, "Back").click
	end

	it "Click in another partial link" do
		@driver.find_element(:partial_link_text, "Another").click
		expect(@driver.page_source).to include("This is another partial link page")
		@driver.find_element(:link_text, "Back").click
	end

	it "Click in door partial link" do
		@driver.find_element(:partial_link_text, "Door").click
		expect(@driver.page_source).to include("This is other door partial link page")
		@driver.find_element(:link_text, "Back").click
	end	
end