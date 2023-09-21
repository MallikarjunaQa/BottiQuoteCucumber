Feature: Customer Quotation Dashboard page

  Scenario:  User navigates to Customer Quotation Dashboard page
    Given the User is logged in with "http://192.168.150.20:8080/bottie_quote/login.html" already on the Customer Quotation Dashboard page
    When the User navigates to the Customer Quotations Page By "mallikarjuna.ss" and "Malli@123karjuna"
    And verifies the existence and clickability of the side navigation bar
    And verifies the existence of the quotation table with table headers
    And verifies the existence and clickability of the Search button
    And verifies the existence and clickability of the Create RFQ button
    And verifies the existence of the Search Dropdown with a specific value
    And verifies the existence and clickability of the Clear button
    And verifies the exisistence of the search text box and confirms that the user can enter text
    And verifies the presence of the Unimicron logo
    And verifies the BQ title
    And verifies the application version
    And verifies the existence of the language icon and confirms its clickability
    And verifies the existence of the logout icon
    Then click on the login icon, and the user is taken to the login page
    Then quit the browser
