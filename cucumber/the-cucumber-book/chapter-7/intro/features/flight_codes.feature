Feature: Flight codes

	Scenario: Flighting code
		Given the flight EZY4567 is leaving today
		When the flight is gone
		Then I should see displayed