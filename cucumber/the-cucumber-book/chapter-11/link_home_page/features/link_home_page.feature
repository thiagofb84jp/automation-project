Feature: Link To The Home Page
	As a MarshAir Sales Director (Mark)
	I want potential customers to be able to go back to the flight search from anywhere on the site
	So what they are guided towards booking trips

Scenario: The Description "Book a ticket to the red planet now!" should appear somewhere prominent on the page
	Given I am on the book a ticket page
	When performing a search for tickets
	Then I should see "Book a ticket to the red planet now!" somewhere on the page

Scenario: The Description "Book a ticket to the red planet now!" should redirect user to home page
	Given I am on the book a ticket page
	When performing a search for tickets and click on a specific description
	Then I should see a user home page

Scenario: MarsAir Logo Home Page
	Given I am on the book a ticket page
	When I click on the logo of home page
	Then I should see a user home page