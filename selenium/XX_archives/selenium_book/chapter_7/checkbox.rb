require 'selenium-webdriver'
require 'rspec'

describe "Selenium Recipes - Chapter 7 (Checkbox)" do

	before(:all) do
		@driver = Selenium::WebDriver.for(:chrome)
		@driver.manage().window().maximize
	end

	before(:each) do
		@site_url = "file:///media/thiago/9414FF9714FF7B16/Automacao/selenium/site/index.html"
		@driver.navigate.to(@site_url)
		@driver.find_element(:link_text, "Checkbox").click
	end

	after(:all) do
		@driver.quit
	end

	it "Select by name" do
		@driver.find_element(:name, "vehicle_bike").click
		@driver.find_element(:name, "vehicle_car").click
		sleep 0.5

		v_bike = @driver.find_element(:name => "vehicle_bike")
		v_bike.click if v_bike.selected?
		sleep 0.5

		v_car = @driver.find_element(:name => "vehicle_car")
		v_car.click if v_car.selected?
		sleep 0.5
		
		#click unless the element "vehicle_bike" is not selected
		@driver.find_element(:name, "vehicle_bike").click unless @driver.find_element(:name, "vehicle_bike").selected?
		sleep 0.5
	end

	it "Uncheck a checkbox" do
		@driver.find_element(:name, "vehicle_car").click
		sleep 0.5

		the_checkbox = @driver.find_element(:name => "vehicle_car")
		the_checkbox.click if the_checkbox.selected?
		sleep 0.5
	end

	it "Assert a checkbox is cheked (or not)" do
		the_checkbox = @driver.find_element(:name => "vehicle_bike")
		the_checkbox.click unless the_checkbox.selected?
		expect(the_checkbox.selected?).to be_truthy
		the_checkbox.click
		expect(the_checkbox.selected?).to be_falsey
	end

	it "Customized checkboxes - iCheck (Using TAG Class)" do
		@driver.find_elements(:class, "icheckbox_square-red").first.click
		sleep 0.5
		@driver.find_elements(:class, "icheckbox_square-red")[1].click
		sleep 0.5
		@driver.find_elements(:class, "icheckbox_square-red")[2].click
		sleep 0.5
	end

	it "Customized checkboxes - iCheck (Using TAG Xpath)" do
		@driver.find_element(:xpath, '//*[@id="icheck-checkboxes"]/div[2]/div/ins').click
		sleep 0.5
		@driver.find_element(:xpath, '//*[@id="icheck-checkboxes"]/div[1]/div/ins').click
		sleep 0.5
	end

end