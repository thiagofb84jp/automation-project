Feature: Acess the system Intranet
         As a Intranet user
         I can login when insert valid user and password
         
         
        Scenario: Login with valid user
           Given user acess initial page
           When insert valid "login" and "password"
           Then the user home page is displayed
        
        Scenario: Login with invalid user
           Given user acess initial page
           When insert wrong "login" and "password"
           Then the page show warning message

        Scenario: Login with valid user but wrong password
           Given user acess initial page
           When insert valid "login" and wrong "password"
           Then the page show warning message
           
        Scenario: Login without filling the fields user and password
           Given user acess initial page
           When the fields "login" and "senha" are empty
           Then the page show warning message
           
        Scenario: Login without to fill user and password
           Given user acess initial page
           When not to insert "login"
           And not to insert "password"
           Then the page show warning page
