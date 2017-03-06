Feature: Acess the system Intranet with Manutencao Module
         As a Manutencao user
         I want to make CRUD operations (Create, Read, Update and Delete)
         So that I will make all operations
         
   Scenario Outline: Create and Read new Marca
      Given I am on the Intranet page
      When I fill in "login" and "senha" with Manutencao user
      And I go on <manutencao_menu> page
      And I choise add new register in <manutencao_adicionar>
      And I fill in new <descricao_manutencao> and confirm operation
      Then I should see a confirm message and show register in list of manutencao

    Examples:
      | manutencao_menu | manutencao_adicionar | descricao_manutencao |
      |     marca       |       marca		   |         DELL         |
      |     modelo      |       modelo		   |     INSPIRON 1400    |
      |     tipo        |       tipo		   |        LAPTOP        |