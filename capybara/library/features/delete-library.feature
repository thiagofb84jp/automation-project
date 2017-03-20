Feature: Delete Books
         As a library admin user
         I can delete books

Scenario: Delete Books
      Given I am the books home page
      When I select a book titled "Book 1" and subtitle with "Subtitle 1" and click "Destroy"
      Then I should be the register deleted