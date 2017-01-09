Feature: Mastering API Components

	Scenario: Search for Links
		Given I am on the Mastering API page
		When I click on a link using and ID
		And I click on a link using text
		And I click on a link using the title attribute
		Then I should have clicked all links using Capybara resources

	Scenario: Search for Buttons
		Given I am on the Mastering API page	
		When I click on a button using and ID
		Then I should have clicked all buttons using Capybara resources

	Scenario: Search for Forms
		Given I am on the Mastering API page
		When I complete and submit the form
		Then I should have clicked all fills the form using Capybara resources

	Scenario: Search for Forms (With Labels)
		Given I am on the Mastering API page
		When I complete and submit the form using label
		Then I should have clicked all fills the form with labels using Capybara resources