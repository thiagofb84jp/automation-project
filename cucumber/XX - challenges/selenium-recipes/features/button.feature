Feature: Buttons

	As a user
	I want to click in all that buttons in a home page

	Background:
		Given I acess a Test Site for Selenium Recipes home page
		When I click in Button home page
	
	Scenario Outline: Choose Buttons
		When I choose the <Button>
		Then I see the following message: <Message>

	Examples:
		| 	Button           |   Message     							         |
		| Choose Firefox     |You choose a Firefox Browser! Congratulations!     |
		| Choose Chrome      |You choose a Chrome Browser! Congratulations!      |
		| Choose Internet Explorer|You choose a IE Browser! Congratulations! 	 |
		| Choose Opera       |You choose a Opera Browser! Congratulations! 	     |
		| Choose Safari      |You choose a Safari Browser! Congratulations! 	 |

	Scenario Outline: Validate Input
		When I insert a input <Value>
		Then I see the following message: <Message>

	Examples: 
		|	Value 		|	Message		|
		|     1 		|   Input OK    |