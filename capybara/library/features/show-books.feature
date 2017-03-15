Feature: Show Books List
    	 As a library admin user
         I want to see all my books added

Scenario: Show Books List
		Given I am the library home page
		When I am the books home page
		Then I see the following fields: "Title", "Subtitle", "Author", "Pages"