Feature: Invalid Return Dates
	As a MarsAir Sales Director (Mark)
	I want to prevent potential customers from searching for invalid trips
	So that they don't waste time, and book valid ones

Scenario: Display Menssage When Return Date is Less Than 1 Year
	Given I am on the book a ticket page
	When I search for dates when return is less than 1 year
	Then I should see a message informing this schedule is not possible

Scenario: Display Menssage When Return Date is More Than 1 Year
	Given I am on the book a ticket page
	When I search for dates when return is more than 1 year
	Then I should allow search returning a message informing seats avaliability