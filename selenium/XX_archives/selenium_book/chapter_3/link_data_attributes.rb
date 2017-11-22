require 'selenium-webdriver'
require 'rspec'

describe "Selenium Recipes - Chapter 3 (Partial Link Text)" do

	before(:all) do
		@driver = Selenium::WebDriver.for(:chrome)
		@driver.manage().window().maximize
	end

	before(:each) do
		@site_url = "file:///media/thiago/9414FF9714FF7B16/projetos-automacao/selenium-webdriver/site/index.html"
		@driver.navigate.to(@site_url)
		@driver.find_element(:link_text, "Hyperlink").click
	end

	after(:all) do
		@driver.quit
	end

	it "Getting link data attributes" do
		#expect(@driver.find_element(:link_text, "Recommend Selenium")["href"]).to eq(@site_url.gsub("link.html", "index.html"))
		expect(@driver.find_element(:link_text, "Recommend Selenium")["id"]).to eq("selenium")
		expect(@driver.find_element(:id, "selenium").text).to eq("Recommend Selenium")
		expect(@driver.find_element(:id, "selenium").tag_name).to eq("a")
	end
end