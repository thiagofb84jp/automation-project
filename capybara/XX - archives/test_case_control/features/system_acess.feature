Feature: Acess the system Intranet

   Scenario: Acess the system Intranet with valid user
      Given I am on the Intranet page
      When I fill in "login" and "senha" with valid user
      Then I should see initial page the user


   Scenario: Acess the system Intranet with invalid user
      Given I am on the Intranet page
      When I fill in "login" and "senha" with invalid user
      Then I should see fail message


   Scenario: Acess the system Intranet with empty fields
      Given I am on the Intranet page
      When I fill in "login" and "senha" with empty fields
      Then I should see fail message about the fill with empty fields


   Scenario: Acess the system Intranet with login empty
      Given I am on the Intranet page
      When I fill "senha" without login user
      Then I should see fail message the fill senha without login
