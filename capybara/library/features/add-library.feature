Feature: Add Items Library
         As a library admin user
         I want add books, genres, kinds and publishings
         So that I can organize all items of my library


Scenario: Add Books
      Given I am on the add book page
      And I click on new book button
      When I fill "O Mundo de Sofia" as Title
      And I fill "Romance da História da Filosofia" as Subtitle
      And I fill "Jostein Gaarder" as Author
      And I fill "550" as Pages
      And I click create book button
      Then I should see the book that I just added

Scenario: Add Genres
      Given I am on the add genre page
      And I click on new genre button
      When I fill "Romance" as Genre
      And I click create genre button
      Then I should see the genre that I just added

Scenario: Add Kinds
      Given I am on the add kind page
      And I click on new kind button
      When I fill "Paperback" as Kind
      And I click create kind button
      Then I should see the kind that I just added

Scenario: Add Publishings
      Given I am on the add publishing page
      And I click on new publishing button
      When I fill "Penguin Group" as Publishing
      And I click create publishing button
      Then I should see the publishing that I just added