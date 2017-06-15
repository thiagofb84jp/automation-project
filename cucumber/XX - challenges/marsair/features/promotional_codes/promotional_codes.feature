Feature: Promotional Codes

	As a MarshAir Sales Director (Mark)
	I want to distribute promotional code to customers
	So that they get discounts and are more tempted to purchase tickets

	Background:
		Given I am on the book a ticket page
		When I am looking for tickets

	@valid	
	Scenario: Valid Promotional Code
		When I have a valid promotional code
		Then I should see a discount in final value of my plane tickets

	@invalid
	Scenario: Invalid Promotional Code
		When I have a invalid promotional code
		Then I should see a message informing that promotional code is invalid and will not be made a discount