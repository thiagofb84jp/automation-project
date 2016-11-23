Feature: Acess the system Intranet with Manutencao Menu
         As a Manutencao user
         I want to CRUD Operations with Marca menu
         So that I know all options that I can see
         
   Scenario Outline: CRUD Manutencao Operations
      Given I am on the Intranet page
      When I fill in "login" and "senha" with Manutencao user
      And I go on <equipamentos_menu> page and add a <new_equipamento>
      And add <desc_equipamento>
      Then I should see a sucess message with <desc_equipamento>
   
    Examples:
      | equipamentos_menu | new_equipamento | desc_equipamento |
      |    Marca          |   Novo_Marca    |     PHILLIPS     |
      |    Modelo         |   Novo_Modelo   |                  |
      |    Tipo           |   Novo_TIpo     |                  |
