require 'selenium-webdriver'
require 'rspec'

describe "Selenium Recipes - Start Differents Browsers" do

	it "Start Chrome" do
		driver = Selenium::WebDriver.for(:chrome)
		driver.manage().window().maximize
		driver.navigate.to("http://travel.agileway.net")
		expect(driver.page_source).to include("User Name")
		sleep 2
		driver.quit
	end

	it "Start Firefox" do
		driver = Selenium::WebDriver.for(:firefox)
		driver.navigate.to("http://travel.agileway.net")
		expect(driver.title).to eq("Agile Travel")
		sleep 2
		driver.quit
	end
end