Feature: Login to BQ Dashboard

  Scenario: User logs in to BQ Dashboard
    Given the user opens a Chrome browser
    When the user navigates to the BQ login URL
    And user will see With botti quote in bolt latters
    And enters the password "your_password"
    And clicks on the login button
    Then the user should be on the BQ dashboard page

