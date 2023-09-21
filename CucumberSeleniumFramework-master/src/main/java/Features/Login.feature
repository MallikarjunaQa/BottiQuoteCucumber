Feature: Login to BQ Dashboard

  Scenario Outline: User logs in to BQ Dashboard
    Given the user opens a Chrome browser
    When the user enter to the BQ login "<baseurl>"
    And varify title
    And varify LoginPage LargeBluebox
    And user will see With botti quote in bold latters
    And placeholder as User Name
    And placeholder as Password
    And by defult in English
    And enters the Username "<username>"
    And enters the password "<Password>"
    And clicks on the login button
    And succeful authentication mesg
    And Unimicorn logo present
    Then the user should be on the BQ dashboard page
    Then quite the browser
  
    
 
   Examples:
 
    |baseurl                                           ||username                     |Password        |
    |http://192.168.150.20:8080/bottie_quote/login.html||mallikarjuna.ss              |Malli@123karjuna|
   #|mallikarjuna.ss@ncs-india.com|Malli@123karjuna|
   
   
   