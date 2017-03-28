#This feature covers the account transaction and hardware-driver modules
Feature: Withdraw Cash
	In oder to buy beer
	As an account holder
	I want to withdraw cash from the ATM

	#Can't figure out how to integrate with magic wand interface
	Scenario: Withdraw too much from an account in credit
		Given I have $50 in my account
	   #When I wave my magic card
	    And I withdraw $100
	    Then I should receive $100