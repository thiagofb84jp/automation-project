Feature: Acess the system Intranet with GESTAO ESTRATEGICA Module
         As a SIGO User
         I want to see productivity by teams and team types
         So that I know all results them
         
   Scenario Outline: Gestao Estrategica Module
      Given I am on the Intranet page
      When I fill in "login" and "senha" with GESTAO ESTRATEGICA user
      And I go on Gestao Estrategica page
      And I go on Analitico Produtividade Equipe
      And I fill in <contrato>, <mes> and <tipo_equipe>
      Then I should see all registers about team productivity
   
    Examples:
      |              contrato            |      mes         |      tipo_equipe        |
      |     67796-MANUTENCAO-MANAUS      |     4-2016       |   MANUTENCAO PESADA     |