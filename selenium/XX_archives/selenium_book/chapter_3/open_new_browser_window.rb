require 'selenium-webdriver'
require 'rspec'

describe "Selenium Recipes - Chapter 3 (Hyperlink)" do

	before(:all) do
		@driver = Selenium::WebDriver.for(:chrome)
		@driver.manage().window().maximize
	end

	before(:each) do
		@site_url = "file:///media/thiago/9414FF9714FF7B16/Automacao/selenium/site/index.html"
		@driver.navigate.to(@site_url)
		@driver.find_element(:link_text, "Hyperlink").click
	end

	after(:all) do
		@driver.quit
	end

	it "Test links open a new browser" do
		current_url = @driver.current_url
		new_window_url = @driver.find_element(:link_text, "Open new window")["href"]
		@driver.navigate.to(new_window_url)
		@driver.find_element(:name, "name").send_keys "sometext"
		@driver.navigate.to(current_url) #back
	end
end