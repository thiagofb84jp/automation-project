Feature: This is the feature title
	This is the description of the feature, which can span multiple lines.
	You can ever include empty lines, like this one:

	In fact, everything until the next Gherkin keyword is included in the description.


	Scenario: Sucessful withdrawal from an account in credit
		Given I have $100 in my account #The context
		When I request $20				#The event(s)
		Then $20 should be dispensed	#The outcome(s)

	Scenario: Attempt withdrawal using stolen card
		Given I have $100 in my account
		But my card is invalid
		When I request $50
		Then my card should not be returned
		And I should be told to contact the bank

# 	Another example of the same scenario above using GIVEN otherwise BUT
#	Scenario: Attempt withdrawal using stolen card
#		Given I have $100 in my account
#		Given my card is invalid
#		But my card is invalid
#		When I request $50
#		Then my card should not be returned
#		And I should be told to contact the bank

# 	Another example of the same scenario using BULLETS (*)
#	Scenario: Attempt withdrawal using stolen card
#		* I have $100 in my account
#		* my card is invalid
#		* my card is invalid
#		* I request $50
#		* my card should not be returned
#		* I should be told to contact the bank