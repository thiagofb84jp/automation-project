Feature: Acess the system Intranet with GESTAO ESTRATEGICA Module
         As a SIGEC User
         I want to see productivity by teams and team types
         So that I know all results them
         
   Scenario Outline: Gestao Estrategica Module
      Given I am on the Intranet page
      When I fill in "login" and "senha" with GESTAO ESTRATEGICA user
      And I go on Gestao Estrategica page
      And I go on Analitico Produtividade Equipe
      And I fill in <contrato>, <mes> and <tipo_equipe>
      Then I should see  the following registers about <time_equipe>: <equipe>, <supervisor>, <localidade>, <fat_previsto>
   
Examples:
| contrato              |mes   |tipo_equipe          |equipe    | supervisor   |localidade    | fat_previsto |
|67796-MANUTENCAO-MANAUS|6-2016|QUATRO POR DOIS      | 012      | monica-santos| ALVARAES     |    1.200     |
|67796-MANUTENCAO-MANAUS|6-2016|QUATRO POR QUATRO    | 116      | -            |VILA AMAZONIA |      0       |
|67796-MANUTENCAO-MANAUS|6-2016|TECNICOS DA QUALIDADE|TECNICOS  | -            |MANAUS        |      0       |
|67796-MANUTENCAO-MANAUS|6-2016|MANUTENCAO PESADA    | 007      |emerson.paiva |BOCA DO ACRE  |      0       |
|67796-MANUTENCAO-MANAUS|6-2016|FLUVIAL              | 015      |-             |ANAMA         |      0       |