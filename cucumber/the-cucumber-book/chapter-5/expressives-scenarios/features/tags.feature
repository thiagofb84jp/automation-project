Feature: Tags

	@widgets
	Scenario: Generate report
		Given I am logged in
		And there is a report "Best selling widgets"

	@slow @widgets @nightly	
	Scenario: Generate overnight report
		Given I am logged in
		And there is a report "Total widget sales history"

	@nightly @slow	
	Scenario: Generate all scenarios
		Given I have one more scenarios
		When I execute cucumber command
		The all the scenarios has been executed