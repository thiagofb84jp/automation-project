Feature: Acess the system Intranet with Supervisor SIGEC unidade
         As a Supervisor SIGEC Unidade
         I can login when insert my data
         I can add new Tipo de Estrutura
                  
        Scenario: Login with Supervisor SIGEC Unidade
           Given user acess with Supervisor SIGEC Unidade
           When insert valid "login" and "password"
           Then the user home page is displayed
