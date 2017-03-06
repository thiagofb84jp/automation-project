Feature: Acess the system Intranet with SIGO module
         As a SIGO user
         I want to see all menus SIGO Module
         So that I know all options that I can see
         
   Scenario Outline: SIGO Module
      Given I am on the Intranet page
      When I fill in "login" and "senha" with SIGO user
      And I go on <sigo_menu> page
      Then I should see all registers about <sigo_list>
   
    Examples:
      |      sigo_menu               |      sigo_list         	    |
      | Diario de Obra               | Diario de Obra         	    |
      | Transporte de Materiais      | Transporte de Materiais	    |
      | Obras de Contrato            | Obras de Contrato      	    |
      | Materiais de Contrato        | Materiais de Contrato  	    |
      | Tipos de Estruturas          | Tipos de Estruturas    	    |
      | Estruturas de Obras          | Estruturas de Obras    	    |
      | Incidentes de Obras          | Incidentes de Obras    	    |
      |Grupos de Faturamento/Serviços|Grupos de Faturamento/Serviços|
      | Servicos de Faturamento      | Servicos de Faturamento 	    |
      | Grupo de Mercadoria          | Grupo de Mercadoria     	    |
      | Tipo de Servico 	     | Tipo de Servico        	    |
      | Tipo de Equipe    	     | Tipo de Equipe         	    |
      | Equipe de Trabalho    	     | Equipe de Trabalho     	    |
      | Horario                      | Horario                	    |
      | Relatorio                    | Relatorio              	    |
