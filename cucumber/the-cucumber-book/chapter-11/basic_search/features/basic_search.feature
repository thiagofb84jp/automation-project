Feature: Basic Search Flow

	As a MarsAir Sales Director (Mark)
	I want potential customers to be able to search for flights to Mars
	So that they see what trips are avaliable

	Background:
		Given I am on the book a ticket page
		When I am looking for tickets

	@fields
	Scenario: Fields Departure and Returning
		Then I should see the fields have related on a search form

	@search
	Scenario: Make a Basic Search
		When I select the fields departure and return in a specific period
		Then I should see the results of my search informing if there are seats avaliable or not

	@seats
	Scenario: Seats Avaliable
		When I select the field departure
		And I select the field return in a period that there are seats
		And I click in the button to make a search
		Then I should see a message informing seats are avaliable