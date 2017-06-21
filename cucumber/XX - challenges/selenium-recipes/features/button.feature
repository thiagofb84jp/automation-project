Feature: Buttons

	As a user
	I want to click in all that buttons in a home page

	Background:
		Given I acess a Test Site for Selenium Recipes home page
		When I click in Button home page
	
	Scenario Outline:
		When I choose the <Button>
		Then I see the following message: <Message>

	Examples:
		| 	Button           |   Message     							         |
		| Choose Firefox     |You choose a Firefox Browser! Congratulations!     |
		| Choose Chrome      |You choose a Chrome Browser! Congratulations!      |
		| Choose Internet Explorer|You choose a IE Browser! Congratulations! 	 |
		| Choose Opera       |You choose a Opera Browser! Congratulations! 	     |
		| Choose Safari      |You choose a Safari Browser! Congratulations! 	 |