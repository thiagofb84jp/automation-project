Feature: Search for Videos on Youtube

	Scenario: Search for Videos of Large Rodents
		Given I am on the Youtube home page
		When I search for "capybara"
		Then videos of large rodents are returned
