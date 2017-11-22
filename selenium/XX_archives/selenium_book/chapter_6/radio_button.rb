require 'selenium-webdriver'
require 'rspec'

describe "Selenium Recipes - Chapter 6 (Radio Button)" do

	before(:all) do
		@driver = Selenium::WebDriver.for(:chrome)
		@driver.manage().window().maximize
	end

	before(:each) do
		@site_url = "file:///media/thiago/9414FF9714FF7B16/Automacao/selenium/site/index.html"
		@driver.navigate.to(@site_url)
		@driver.find_element(:link_text, "Radio button").click
	end

	after(:all) do
		@driver.quit
	end


	it "Select a radio button (using Xpath)" do
		@driver.find_element(:xpath, '//*[@id="radio_female"]').click
		sleep 0.5
		@driver.find_element(:xpath, '//*[@id="radio_male"]').click
	end

	it "Select a radio button (using ID)" do
		@driver.find_element(:id, "radio_female").click
		sleep 0.5
		@driver.find_element(:id, "radio_male").click
	end

	it "Assert a radio option is selected" do
		@driver.find_element(:xpath, '//*[@id="radio_female"]').click
		expect(@driver.find_element(:xpath, '//*[@id="radio_female"]').selected?).to be_truthy
		sleep 0.5
	end	

	it "Iterate radio buttons in a radio group (gender)" do
		expect(@driver.find_elements(:name => "gender").size).to eq(2)
		@driver.find_elements(:name => "gender").each do |rb|
			rb.click if rb["value"] == "female"
			sleep 0.5
		end
	end

	it "Iterate radio buttons in a radio group (genre books)" do
		expect(@driver.find_elements(:name => "genre_books").size).to eq(5)
		@driver.find_elements(:name => "genre_books").each do |gb|
			gb.click if gb["value"] == "classical"
			sleep 0.5
		end
	end

	it "Click Nth radio button in a group" do
		@driver.find_elements(:name => "gender")[1].click
		expect(@driver.find_element(:xpath, '//*[@id="radio_female"]').selected?).to be_truthy
		@driver.find_elements(:name => "gender")[0].click
		expect(@driver.find_element(:xpath, '//*[@id="radio_male"]').selected?).to be_truthy
	end	

	it "Click radio button by the following label" do
		elem = @driver.find_element(:xpath, '//*[@id="q1"]/div/div[1]/label')
		elem.click
		sleep 0.5
	end

	it "Customize radio buttons - iCheck" do
		@driver.find_element(:xpath, '//*[@id="icheck-radios"]/div[1]/ins').click
		sleep 0.5
		@driver.find_element(:xpath, '//*[@id="icheck-radios"]/div[2]/ins').click
		sleep 0.5
	end

end