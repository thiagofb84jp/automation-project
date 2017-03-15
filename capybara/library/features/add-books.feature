Feature: Add Books
         As a library admin user
         I want add books
         So that I can add my books to organize my library

Scenario: Add Books
      Given I am on the add book page
      And I click on new book button
      When I fill "O Mundo de Sofia" as Title
      And I fill "Romance da História da Filosofia" as Subtitle
      And I fill "Jostein Gaarder" as Author
      And I fill "550" as Pages
      And I click "Create Book" button
      Then I should see the book that I just added