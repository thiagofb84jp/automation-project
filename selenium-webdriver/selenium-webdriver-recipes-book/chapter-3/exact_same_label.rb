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

	it "Exact Same Label" do
		@driver.find_elements(:link_text => "Show Answer")[1].click #Second Link
		expect(@driver.page_source).to include("You have clicked in second link. Congratulations!")
		@driver.find_element(:xpath, '/html/body/p/a').click
	end

	it "What is Your Opinion" do
		@driver.find_elements(:link_text => "Vote")[0].click #First Link
		expect(@driver.page_source).to include("You have voted in first option. Congratulations!")
		@driver.find_element(:xpath, '/html/body/p/a').click
	end
end