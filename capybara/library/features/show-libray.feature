Feature: Show Library List
    	 As a library admin user
         I want to see all items of my library


Scenario: Show Books List
		Given I am the books home page
		Then I see the fields about books list and books added

Scenario: Show Genre List
		Given I am the genre home page
		Then I see the fields about genre list and genres added

Scenario: Show Kinds List
		Given I am the kinds home page
		Then I see the fields about kinds list and kinds added

Scenario: Show Publishings List
		Given I am the publishing home page
		Then I see the fields about publishing list and publishing added