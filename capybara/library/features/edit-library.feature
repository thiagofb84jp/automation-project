Feature: Edit Library
         As a library admin user
         I can edit items of my library


Scenario: Edit books
	Given I am the books home page
	When I selected a book titled "Book 1" and subtitle with "Subtitle 1"
	And click edit book button
	And I fill "Title 1 Edited" as Title
	And I fill "Subtitled 1 Edited" as Subtitle
	And I fill "Author 1 Edited" as Author
	And I fill "880" as Pages
	And I click update book button
	Then I should see the book and a message informing that it has updated

Scenario: Edit Genre
	Given I am the genre home page
	When I selected a genre named "Genre 1"
	And click edit genre button
	And I fill "Genre 1 Edited" as genre name
	And I click update genre button
	Then I should see the genre and a message informing that it has updated

Scenario: Edit Kinds
	Given I am the kind home page
	When I selected a kind named "Kind 1"
	And click edit kind button
	And I fill "Kind 1 Edited" as kind name
	And I click update kind button
	Then I should see the kind and a message informing that it has updated

Scenario: Edit Publishing
	Given I am the publishing home page
	When I selected a publishing named "Kind 1"
	And click edit publishing button
	And I fill "Publishing 1 Edited" as kind name
	And I click update publishing button
	Then I should see the publishing and a message informing that it has updated