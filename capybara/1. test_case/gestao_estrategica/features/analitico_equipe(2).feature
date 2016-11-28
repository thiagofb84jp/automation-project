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
      Then I should see  the following registers about <time_equipe>: <vlr_normal>, <vlr_extra>, <vlr_adc_noturno>, <produtividade>, <prev_real>, <dif_monet>

Examples:
|vlr_normal|vlr_extra|vlr_adc_noturno|produtividade|prev_real|dif_monet|
|42.294,38 |1.536,28 |0              |43.830,66    |3653     |42.630,66|