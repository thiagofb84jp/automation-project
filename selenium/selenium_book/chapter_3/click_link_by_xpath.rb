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

	it "Click in Recommend Selenium" do
		@driver.find_element(:xpath, '//*[@id="selenium"]').click
		expect(@driver.page_source).to include("This is Selenium Page")
		@driver.find_element(:xpath, '/html/body/p/a').click
	end

	it "Click in First Div" do
		@driver.find_element(:xpath, '//*[@id="container"]/div[3]/div[1]/a').click
		expect(@driver.page_source).to include("This is url link page")
		@driver.find_element(:xpath, '/html/body/p/a').click
	end

	it "Click in Second Div" do
		@driver.find_element(:xpath, '//*[@id="second_div"]/a').click
		expect(@driver.page_source).to include("This is partial link page")
		@driver.find_element(:xpath, '/html/body/p/a').click
	end
end