require 'selenium-webdriver'
require 'rspec'

describe "Selenium Recipes - Chapter 5 (TextField and TextArea)" do

	before(:all) do
		@driver = Selenium::WebDriver.for(:chrome)
		@driver.manage().window().maximize
	end

	before(:each) do
		@site_url = "file:///media/thiago/9414FF9714FF7B16/Automacao/selenium/site/index.html"
		@driver.navigate.to(@site_url)
		@driver.find_element(:link_text, "Button").click
	end

	after(:all) do
		@driver.quit
	end

	it "Enter text into a text field by name" do
		@driver.find_element(:name, "login").send_keys("agileway")
		@driver.find_element(:name, "passwrd").send_keys("agileway")
		@driver.find_element(:xpath, '//*[@id="form"]/button').click
		sleep 2
	end

	it "Enter text into a text field by ID" do
		@driver.find_element(:id, "login").send_keys("agileway")
		@driver.find_element(:id, "passwrd").send_keys("agileway")
		@driver.find_element(:xpath, '//*[@id="form"]/button').click
		sleep 2
	end

	it "Clear a text field" do
		@driver.find_element(:id, "login").send_keys("test")
		sleep 2
		@driver.find_element(:id, "login").send_keys(" wisely") # 'test wisely'
		sleep 2
		@driver.find_element(:id, "login").clear
		sleep 2
		@driver.find_element(:id, "login").send_keys("agileway")
		sleep 2

		@driver.find_element(:xpath, '//*[@id="form"]/button').click
		sleep 2
	end

	it "Enter text into a multi-line text area" do
		@driver.find_element(:id, "comments").send_keys("Selenium is\r\nFun!")
		sleep 2
		@driver.find_element(:id, "comments").send_keys("\r\nI love implementing software testing!")
		sleep 2
	end

	it "Assert value" do
		@driver.find_element(:id, "login").send_keys("testwisely")
		expect(@driver.find_element(:id, "login")["value"]).to eq("testwisely")
		sleep 2		
	end

	it "Focus on a control" do
		@driver.find_element(:id, "login").send_keys("")
		@driver.find_element(:id, "passwrd").send_keys("")
		@driver.find_element(:xpath, '//*[@id="form"]/button').click
		sleep 2
	end

	it "Set and assert the value of a hidden field" do
		the_hidden_elem = @driver.find_element(:name, "currency")
		expect(the_hidden_elem["value"]).to eq("USD")
		sleep 2
		@driver.execute_script("arguments[0].value = 'AUD';", the_hidden_elem)
		expect(@driver.find_element(:name, "currency")["value"]).to eq("AUD")
		sleep 2
	end

	#it "Read only and disable text" do
	#	@driver.execute_script("$('#readonly_text').val('bypass');")
	#	sleep 2
	#	expect(driver.find_element(:id, "readonly_text")["value"]).to eq("bypass")
	#	@driver.execute_script("$('#disabled_text').val('anyuse');")
	#	sleep 2
	#end
end