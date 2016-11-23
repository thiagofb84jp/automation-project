Feature: Acess the system Intranet with SIGEC module
         As a SIGEC user
         I want to see all menus SIGEC Module
         So that I know all options that I can see
         
   Scenario Outline: SIGEC Module
      Given I am on the Intranet page
      When I fill in "login" and "senha" with SIGO user
      And I go on <sigec_menu> page
      Then I should see all registers about <sigec_list>
   
    Examples:
      |     sigec_menu               |      sigec_list              |
      | Ordem de Serviço             | Ordem de Serviço             |
      | Desvios de Equipe            | Desvios de Equipe            |
      | Glosa e Crédito              | Glosa e Crédito              |
      | Contratos                    | Contratos		    |
      | Regional                     | Regional		    	    |
      | Polo                         | Polo  		    	    |
      | Cidade                       | Cidade  		            |
      | Horário                      | Horário  		    |
      | Sobreaviso/Emerg./H          | Sobreaviso/Emerg./HH         |
      | Tipo de Serviço de Equipe    | Tipo de Serviço de Equipe    |
      | Tipo de Equipe               | Tipo de Equipe               |
      | Equipes de Trabalho          | Equipes de Trabalho          |
      | Serviços de Contrato         | Serviços de Contrato         |
      | Grupo Faturamento            | Grupo Faturamento            |
      | Tipo de OS                   | Tipo de OS                   |
      | Serviços Faturamento         | Serviços Faturamento         |
      | Motivos de Desvio            | Motivos de Desvio            |
      | Grupos de Mercadoria         | Grupos de Mercadoria         |
      | Grupos de EPI/EPC            | Grupos de EPI/EPC            |
      | Grupo de Faturamento Opcional| Grupo de Faturamento Opcional|
      | Relatório                    | Relatório  		    |
      | Ordem Serviço Despacho       | Ordem Serviço Despacho       |
      | Programar OS                 | Programar OS                 |
      | Priorizar OS                 | Priorizar OS                 |
      | Dispositivos                 | Dispositivos                 |
      | Localização                  | Localização                  |
      | Upload de Serviços           | Upload de Serviços           |
      | Programação em Lote          | Programação em Lote          |
      | Importar OS's Concluídas     | Importar OS's Concluídas     |
