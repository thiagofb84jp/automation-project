Feature: Delete Library
         As a library admin user
         I can delete items of my library


Scenario: Delete Books
      Given I am the books home page
      When I select a book titled "Book 1" and subtitle with "Subtitle 1"
      And I click destroy book button
      Then I should see a message informing that book has destroyed

Scenario: Delete Genres
      Given I am the genres home page
      When I select a genre titled "Genre 1"
      And I click destroy genre button
      Then I should see a message informing that genre has destroyed

Scenario: Delete Kinds
      Given I am the kind home page
      When I select a kind titled "Kind 1"
      And I click destroy kind button
      Then I should see a message informing that kind has destroyed

Scenario: Delete Publishings
      Given I am the publishing home page
      When I select a publishing titled "Publishing 1"
      And I click destroy publishing button
      Then I should see a message informing that publishing has destroyed