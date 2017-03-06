Feature: Acess Diario de Obra with assistent user


   Scenario: Acess the system Intranet with assistent user and add new Desvio de Obra without Concessionaria
      Given I am on the Intranet page
      When I fill in "login" and "senha" with assistent user
      And I am on the Desvio de Obra and add new Desvio without Concessionaria
      And I fill in "Descricao" and "Tomador"
      Then I should see sucess page with register Desvio without Concessionaria
