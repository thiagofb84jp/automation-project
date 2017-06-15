Feature: Promotional Codes
	As a MarshAir Sales Director (Mark)
	I want to distribute promotional code to customers
	So that they get discounts and are more tempted to purchase tickets

Scenario: Valid Promotional Code
	Given I am on the book a ticket page
	When I search for tickets and I have a valid promotional code
	Then I should see the message informing that promotional code is valid and make discount

Scenario: Invalid Promotional Code
	Given I am on the book a ticket page
	When I search for tickets and I have a invalid promotional code
	Then I should see the message informing that promotional code is invalid and do not make a discount