require 'selenium-webdriver'
require 'rspec'

describe "Selenium Recipes - Chapter 8 (Select List)" do

	before(:all) do
		@driver = Selenium::WebDriver.for(:chrome)
		@driver.manage().window().maximize
	end

	before(:each) do
		@site_url = "file:///media/thiago/9414FF9714FF7B16/Automacao/selenium/site/index.html"
		@driver.navigate.to(@site_url)
		@driver.find_element(:link_text, "Select List").click
	end

	after(:all) do
		@driver.quit
	end
=begin
	it "Select an option by text" do
		s_text = Selenium::WebDriver::Support::Select.new(@driver.find_element(:name, "car_make"))
		s_text.select_by(:text, "Volvo (Sweden)")
		s_text.select_by(:text, "Audi (Germany)")
		sleep 0.5
	end

	it "Select an option by value" do
		s_value = Selenium::WebDriver::Support::Select.new(@driver.find_element(:id, "car_make_select"))
		s_value.select_by(:value, "audi")
		s_value.select_by(:value, "volvo")
		sleep 0.5
	end

	it "Select an option by interating all options" do
		my_select = @driver.find_element(:id, "car_make_select")
		my_select.find_elements( :tag_name => "option" ).find do |option|
			option.text == "Volvo (Sweden)"
		end.click
		sleep 0.5
	end
	
	it "Select multiple options" do
		select_box = Selenium::WebDriver::Support::Select.new(@driver.find_element(:name, "test_framework"))
		select_box.select_by(:text, "Selenium")
		select_box.select_by(:text, "RWebSpec")
		sleep 0.5
	end

	it "Clear one selection" do
		select_box = Selenium::WebDriver::Support::Select.new(@driver.find_element(:name, "test_framework"))
		select_box.select_by(:text, "Selenium")
		select_box.select_by(:value, "rwebspec")
		select_box.deselect_by(:text, "RWebSpec") #by label
		select_box.deselect_by(:index, 3) # :index
		#now, no options are selected
		sleep 0.5
	end

	it "Clear selection" do
		select_box = Selenium::WebDriver::Support::Select.new(@driver.find_element(:name, "test_framework"))
		select_box.select_by(:value, "rwebspec")
		select_box.select_by(:value, "watir")
		select_box.select_by(:value, "selenium")
		sleep 0.5

		select_box.deselect_all #deselect all options
	end
=end
	it "Assert selected option" do
		my_select = Selenium::WebDriver::Support::Select.new(@driver.find_element(:id, "car_make_select"))
		my_select.select_by(:value, "audi")
		expect(my_select.first_selected_option.text).to eq("Audi (Germany)")
		#expect(my_select.first_selected_option.value).to eq("audi") #It cannot use value for assertion
		sleep 0.5
	end

	it "Assert the value of a select list" do
		my_select = Selenium::WebDriver::Support::Select.new(@driver.find_element(:name, "car_make"))
		my_select.select_by(:text, "Volvo (Sweden)")
		expect(my_select.first_selected_option["value"]).to eq("volvo")
	end

end
