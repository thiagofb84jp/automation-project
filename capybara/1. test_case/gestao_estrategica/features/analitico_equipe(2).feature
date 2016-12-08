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
      Then I should see the following registers about <tipo_equipe>: <vlr_normal>, <vlr_extra>, <vlr_adc_noturno>, <produtividade>, <prev_real>, <dif_monet>
   
Examples:
|contrato               |mes    |tipo_equipe      |vlr_normal|vlr_extra|vlr_adc_noturno|produtividade|prev_real|dif_monet |
|67796-MANUTENCAO-MANAUS|4-2016 |QUATRO POR DOIS  |73.230,46 |15.269,17|1.748,56       |90.248,19    |   69    |-40.751,81|
|67796-MANUTENCAO-MANAUS|4-2016 |QUATRO POR QUATRO|34.384,04 |9.259,75 |292,84|43.936,63|0|43.936,63        |
|67796-MANUTENCAO-MANAUS|4-2016 |TECNICOS DA QUALIDADE|653.248,26|0,00 |0,00|R$ 653.248,26|0|653.248,26     |
|67796-MANUTENCAO-MANAUS|4-2016 |MANUTENCAO PESADA|59.839,83 |14.601,06|2.411,70|76.852,59|0|76.852,59      |
|67796-MANUTENCAO-MANAUS|4-2016 |FLUVIAL          |31.690,41 |15.059,45|1.528,76|48.278,62|0|48.278,62      |