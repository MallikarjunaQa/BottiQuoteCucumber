Feature: RFQ Creation on Customer Dashboard

  Scenario: Create RFQ with Valid Information and Verify Additional Conditions
    Given User navigates to the Customer Dashboard
    When User clicks on the Create RFQ button
    And navigated to the Create RFQ page
    And Inquiry date is the same as the created date
    And If priority is normalandQta, Due date UMG to Cust is four days ahead and is disabled
    And Status UMG to Cust is open by default and is disabled
    And Status NCS to UMG is open and is disabled
    And User enters the account number
    And Customer number is not null and is disabled
    And Customer city is not null and is disabled
    And Account manager is not null and selected from dropdown
    And Salesperson is not null and selected from dropdown
    And User adds remarks from the sales area
    And User adds comments from the NCS engineer area
    And User attaches files (drag & drop, upload, remove)
    And User verifies top bar features
    And User verifies side nav bar features
    Then RFQ is successfully created
