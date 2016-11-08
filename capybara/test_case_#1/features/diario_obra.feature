Feature: Acess the system Intranet with SIGO module
         As a SIGO user
         I want to see all menus SIGO Module 
         So that I know all options that I can see
         

   Scenario: Menu Diario de Obra
      Given I am on the Intranet page
      When I fill in "login" and "senha" with SIGO user
      And I am on the Diario de Obra page
      Then I should see all registers about Diario de Obra
      
   Scenario: Menu Transporte de Materiais
      Given I am on the Intranet page
      When I fill in "login" and "senha" with SIGO user
      And I am on the Transporte de Materiais page
      Then I should see all registers about Transporte de Materiais
      
   Scenario: Menu Obras de Contrato
      Given I am on the Intranet page
      When I fill in "login" and "senha" with SIGO user
      And I am on the Obras de Contrato page
      Then I should see all registers about Obras de Contrato
      
   Scenario: Menu Materiais de Contrato
      Given I am on the Intranet page
      When I fill in "login" and "senha" with SIGO user
      And I am on the Materiais de Contrato page
      Then I should see all registers about Materiais de Contrato
