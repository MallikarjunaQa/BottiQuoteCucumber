$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CreateRFq.feature");
formatter.feature({
  "line": 1,
  "name": "RFQ Creation on Customer Dashboard",
  "description": "",
  "id": "rfq-creation-on-customer-dashboard",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Create RFQ with Valid Information and Verify Additional Conditions",
  "description": "",
  "id": "rfq-creation-on-customer-dashboard;create-rfq-with-valid-information-and-verify-additional-conditions",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User navigates to the Customer Dashboard",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User clicks on the Create RFQ button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "navigated to the Create RFQ page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Inquiry date is the same as the created date",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "If priority is normal, Due date UMG to NCS is four days ahead and is disabled",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "If priority is QTA, Due date NCS to UMG is the next date of the created date",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Status UMG to Cust is open by default and is disabled",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Status NCS to UMG is open and is disabled",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User enters the account number",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Customer number is not null and is disabled",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Customer city is not null and is disabled",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Account manager is not null and selected from dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Salesperson is not null and selected from dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User adds remarks from the sales area",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User adds comments from the NCS engineer area",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User attaches files (drag \u0026 drop, upload, remove)",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User verifies top bar features",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User verifies side nav bar features",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "RFQ is successfully created",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateRfqStepdefination.user_navigates_to_the_Customer_Dashboard()"
});
formatter.result({
  "duration": 5685530700,
  "status": "passed"
});
formatter.match({
  "location": "CreateRfqStepdefination.user_clicks_on_the_Create_RFQ_button()"
});
formatter.result({
  "duration": 4905086400,
  "status": "passed"
});
formatter.match({
  "location": "CreateRfqStepdefination.navigated_to_the_Create_RFQ_page()"
});
formatter.result({
  "duration": 3872700,
  "status": "passed"
});
formatter.match({
  "location": "CreateRfqStepdefination.inquiry_date_is_the_same_as_the_created_date()"
});
formatter.result({
  "duration": 183723600,
  "status": "passed"
});
formatter.match({
  "location": "CreateRfqStepdefination.if_priority_is_normal_Due_date_UMG_to_NCS_is_4_days_ahead_and_is_disabled()"
});
formatter.result({
  "duration": 167436700,
  "status": "passed"
});
formatter.match({
  "location": "CreateRfqStepdefination.if_priority_is_QTA_Due_date_NCS_to_UMG_is_the_next_date_of_the_created_date()"
});
formatter.result({
  "duration": 11900,
  "status": "passed"
});
formatter.match({
  "location": "CreateRfqStepdefination.status_UMG_to_Cust_is_open_by_default_and_is_disabled()"
});
formatter.result({
  "duration": 7500,
  "status": "passed"
});
formatter.match({
  "location": "CreateRfqStepdefination.status_NCS_to_UMG_is_open_and_is_disabled()"
});
formatter.result({
  "duration": 7500,
  "status": "passed"
});
formatter.match({
  "location": "CreateRfqStepdefination.user_enters_the_account_number()"
});
formatter.result({
  "duration": 7600,
  "status": "passed"
});
formatter.match({
  "location": "CreateRfqStepdefination.customer_number_is_not_null_and_is_disabled()"
});
formatter.result({
  "duration": 7700,
  "status": "passed"
});
formatter.match({
  "location": "CreateRfqStepdefination.customer_city_is_not_null_and_is_disabled()"
});
formatter.result({
  "duration": 22100,
  "status": "passed"
});
formatter.match({
  "location": "CreateRfqStepdefination.account_manager_is_not_null_and_selected_from_dropdown()"
});
formatter.result({
  "duration": 6800,
  "status": "passed"
});
formatter.match({
  "location": "CreateRfqStepdefination.salesperson_is_not_null_and_selected_from_dropdown()"
});
formatter.result({
  "duration": 6900,
  "status": "passed"
});
formatter.match({
  "location": "CreateRfqStepdefination.user_adds_remarks_from_the_sales_area()"
});
formatter.result({
  "duration": 6700,
  "status": "passed"
});
formatter.match({
  "location": "CreateRfqStepdefination.user_adds_comments_from_the_NCS_engineer_area()"
});
formatter.result({
  "duration": 6800,
  "status": "passed"
});
formatter.match({
  "location": "CreateRfqStepdefination.user_attaches_files_drag_drop_upload_remove()"
});
formatter.result({
  "duration": 6800,
  "status": "passed"
});
formatter.match({
  "location": "CreateRfqStepdefination.user_verifies_top_bar_features()"
});
formatter.result({
  "duration": 6900,
  "status": "passed"
});
formatter.match({
  "location": "CreateRfqStepdefination.user_verifies_side_nav_bar_features()"
});
formatter.result({
  "duration": 6700,
  "status": "passed"
});
formatter.match({
  "location": "CreateRfqStepdefination.rfq_is_successfully_created()"
});
formatter.result({
  "duration": 12100,
  "status": "passed"
});
formatter.uri("Custdash.feature");
formatter.feature({
  "line": 1,
  "name": "Customer Quotation Dashboard page",
  "description": "",
  "id": "customer-quotation-dashboard-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User navigates to Customer Quotation Dashboard page",
  "description": "",
  "id": "customer-quotation-dashboard-page;user-navigates-to-customer-quotation-dashboard-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "the User is logged in with \"http://192.168.150.20:8080/bottie_quote/login.html\" already on the Customer Quotation Dashboard page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the User navigates to the Customer Quotations Page By \"mallikarjuna.ss\" and \"Malli@123karjuna\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "verifies the existence and clickability of the side navigation bar",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "verifies the existence of the quotation table with table headers",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "verifies the existence and clickability of the Search button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "verifies the existence and clickability of the Create RFQ button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "verifies the existence of the Search Dropdown with a specific value",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "verifies the existence and clickability of the Clear button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "verifies the exisistence of the search text box and confirms that the user can enter text",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "verifies the presence of the Unimicron logo",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "verifies the BQ title",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "verifies the application version",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "verifies the existence of the language icon and confirms its clickability",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "verifies the existence of the logout icon",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "click on the logout icon, and the user is taken to the login page",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "quit the browser",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://192.168.150.20:8080/bottie_quote/login.html",
      "offset": 28
    }
  ],
  "location": "CustDashStepdefination.the_User_is_logged_in_with_already_on_the_Customer_Quotation_Dashboard_page(String)"
});
formatter.result({
  "duration": 5509979100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mallikarjuna.ss",
      "offset": 55
    },
    {
      "val": "Malli@123karjuna",
      "offset": 77
    }
  ],
  "location": "CustDashStepdefination.the_User_navigates_to_Customer_Quotations_Page(String,String)"
});
formatter.result({
  "duration": 70000,
  "status": "passed"
});
formatter.match({
  "location": "CustDashStepdefination.verifies_the_existence_and_clickability_of_the_side_navigation_bar()"
});
formatter.result({
  "duration": 2885506200,
  "status": "passed"
});
formatter.match({
  "location": "CustDashStepdefination.verifies_the_existence_of_the_quotation_table_with_table_headers()"
});
formatter.result({
  "duration": 1407819700,
  "status": "passed"
});
formatter.match({
  "location": "CustDashStepdefination.verifies_the_existence_and_clickability_of_the_Search_button()"
});
formatter.result({
  "duration": 29474400,
  "status": "passed"
});
formatter.match({
  "location": "CustDashStepdefination.verifies_the_existence_and_clickability_of_the_Create_RFQ_button()"
});
formatter.result({
  "duration": 31774900,
  "status": "passed"
});
formatter.match({
  "location": "CustDashStepdefination.verifies_the_existence_of_the_Search_Dropdown_with_a_specific_value()"
});
formatter.result({
  "duration": 60711400,
  "status": "passed"
});
formatter.match({
  "location": "CustDashStepdefination.verifies_the_existence_and_clickability_of_the_Clear_button()"
});
formatter.result({
  "duration": 63603900,
  "status": "passed"
});
formatter.match({
  "location": "CustDashStepdefination.verifies_the_exisistence_of_the_search_text_box_and_confirms_that_the_user_can_enter_text()"
});
formatter.result({
  "duration": 30813500,
  "status": "passed"
});
formatter.match({
  "location": "CustDashStepdefination.verifies_the_presence_of_the_Unimicron_logo()"
});
formatter.result({
  "duration": 49348900,
  "status": "passed"
});
formatter.match({
  "location": "CustDashStepdefination.verifies_the_BQ_title()"
});
formatter.result({
  "duration": 3913000,
  "status": "passed"
});
formatter.match({
  "location": "CustDashStepdefination.verifies_the_application_version()"
});
formatter.result({
  "duration": 91713600,
  "status": "passed"
});
formatter.match({
  "location": "CustDashStepdefination.verifies_the_existence_of_the_language_icon_and_confirms_its_clickability()"
});
formatter.result({
  "duration": 39537800,
  "status": "passed"
});
formatter.match({
  "location": "CustDashStepdefination.verifies_the_existence_of_the_logout_icon()"
});
formatter.result({
  "duration": 30231000,
  "status": "passed"
});
formatter.match({
  "location": "CustDashStepdefination.click_on_the_logout_icon_and_the_user_is_taken_to_the_login_page()"
});
formatter.result({
  "duration": 14600,
  "status": "passed"
});
formatter.match({
  "location": "CustDashStepdefination.quit_the_browser()"
});
formatter.result({
  "duration": 998047000,
  "status": "passed"
});
formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login to BQ Dashboard",
  "description": "",
  "id": "login-to-bq-dashboard",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "User logs in to BQ Dashboard",
  "description": "",
  "id": "login-to-bq-dashboard;user-logs-in-to-bq-dashboard",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "the user opens a Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the user enter to the BQ login \"\u003cbaseurl\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "varify title",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "varify LoginPage LargeBluebox",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user will see With botti quote in bold latters",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "placeholder as User Name",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "placeholder as Password",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "by defult in English",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "enters the Username \"\u003cusername\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "enters the password \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "succeful authentication mesg",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Unimicorn logo present",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "the user should be on the BQ dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "quite the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 22,
  "name": "",
  "description": "",
  "id": "login-to-bq-dashboard;user-logs-in-to-bq-dashboard;",
  "rows": [
    {
      "cells": [
        "baseurl",
        "",
        "username",
        "Password"
      ],
      "line": 24,
      "id": "login-to-bq-dashboard;user-logs-in-to-bq-dashboard;;1"
    },
    {
      "cells": [
        "http://192.168.150.20:8080/bottie_quote/login.html",
        "",
        "mallikarjuna.ss",
        "Malli@123karjuna"
      ],
      "line": 25,
      "id": "login-to-bq-dashboard;user-logs-in-to-bq-dashboard;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 25,
  "name": "User logs in to BQ Dashboard",
  "description": "",
  "id": "login-to-bq-dashboard;user-logs-in-to-bq-dashboard;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "the user opens a Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the user enter to the BQ login \"http://192.168.150.20:8080/bottie_quote/login.html\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "varify title",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "varify LoginPage LargeBluebox",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user will see With botti quote in bold latters",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "placeholder as User Name",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "placeholder as Password",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "by defult in English",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "enters the Username \"mallikarjuna.ss\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "enters the password \"Malli@123karjuna\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "succeful authentication mesg",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Unimicorn logo present",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "the user should be on the BQ dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "quite the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepdefination.the_user_opens_a_Chrome_browser()"
});
formatter.result({
  "duration": 2191225400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://192.168.150.20:8080/bottie_quote/login.html",
      "offset": 32
    }
  ],
  "location": "LoginStepdefination.the_user_enter_to_the_BQ_login_URL(String)"
});
formatter.result({
  "duration": 3400074200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefination.varify_title()"
});
formatter.result({
  "duration": 3096900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefination.varify_LoginPage_LargeBluebox()"
});
formatter.result({
  "duration": 34091700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefination.user_will_see_Withbotti_quote_in_bolt_latters()"
});
formatter.result({
  "duration": 24372000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefination.placeholder_as_User_Name()"
});
formatter.result({
  "duration": 52998600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefination.placeholder_as_Password()"
});
formatter.result({
  "duration": 26885600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefination.by_defult_in_English()"
});
formatter.result({
  "duration": 64473700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mallikarjuna.ss",
      "offset": 21
    }
  ],
  "location": "LoginStepdefination.enters_the_username(String)"
});
formatter.result({
  "duration": 117229800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Malli@123karjuna",
      "offset": 21
    }
  ],
  "location": "LoginStepdefination.enters_the_password(String)"
});
formatter.result({
  "duration": 68746600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefination.clicks_on_the_login_button()"
});
formatter.result({
  "duration": 55000200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefination.succeful_authentication_mesg()"
});
formatter.result({
  "duration": 30399537700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefination.unimicorn_logo_present()"
});
formatter.result({
  "duration": 37229700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefination.the_user_should_be_on_the_BQ_dashboard_page()"
});
formatter.result({
  "duration": 34719400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefination.close_the_browser()"
});
formatter.result({
  "duration": 1106245600,
  "status": "passed"
});
});