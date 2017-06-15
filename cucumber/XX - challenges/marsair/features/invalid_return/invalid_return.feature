Feature: Invalid Return Dates

	As a MarsAir Sales Director (Mark)
	I want to prevent potential customers from searching for invalid trips
	So that they don't waste time, and book valid ones

	Background:
		Given I am on the book a ticket page

	@lessoneyear
	Scenario: Display Message When Return Date is Less Than One Year
		When I search for dates when return is less than one year
		Then I should see a message informing this schedule is not possible

	@moreoneyear
	Scenario: Display Message When Return Date is More Than One Year
		When I search for dates when return is more than one year
		Then I should allow search returning a message informing seats avaliability