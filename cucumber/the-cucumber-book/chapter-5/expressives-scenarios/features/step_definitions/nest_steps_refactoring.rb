Given(/^I have authenticated with the correct PIN$/) do
  steps %{
  	I have pushed my card into the slot
	I enter my PIN
  	I enter "OK"
  }
end