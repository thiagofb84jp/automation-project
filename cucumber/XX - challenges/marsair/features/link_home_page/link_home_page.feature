Feature: Link To The Home Page

	As a MarshAir Sales Director (Mark)
	I want potential customers to be able to go back to the flight search from anywhere on the site
	So what they are guided towards booking trips

	Background: 
		Given I am on the book a ticket page
		When I am looking for tickets

	@desc1
	Scenario: The Description "Book a ticket to the red planet now!" should appear on the page
		Then I should see a description 'Book a ticket to the red planet now!' somewhere on the page

	@desc2
	Scenario: The Description "Book a ticket to the red planet now!" should redirect user to home page
		Then I should see a user home page

	@logo
	Scenario: Show MarsAir Logo Home Page
		When I click on the logo home page
		Then I should see a user home page