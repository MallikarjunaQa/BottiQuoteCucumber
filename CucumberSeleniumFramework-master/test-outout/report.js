$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
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
  "name": "the user enter to the BQ login \"http://192.168.150.20:8080/bottie_quote/login.html\"",
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
        "username",
        "Password"
      ],
      "line": 23,
      "id": "login-to-bq-dashboard;user-logs-in-to-bq-dashboard;;1"
    },
    {
      "cells": [
        "mallikarjuna.ss",
        "Malli@123karjuna"
      ],
      "line": 24,
      "id": "login-to-bq-dashboard;user-logs-in-to-bq-dashboard;;2"
    },
    {
      "cells": [
        "mallikarjuna.ss@ncs-india.com",
        "Malli@123karjuna"
      ],
      "line": 25,
      "id": "login-to-bq-dashboard;user-logs-in-to-bq-dashboard;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 24,
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
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "enters the password \"Malli@123karjuna\"",
  "matchedColumns": [
    1
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
  "duration": 4385740400,
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
  "duration": 1016438500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefination.varify_title()"
});
formatter.result({
  "duration": 7152800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefination.varify_LoginPage_LargeBluebox()"
});
formatter.result({
  "duration": 26956500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefination.user_will_see_Withbotti_quote_in_bolt_latters()"
});
formatter.result({
  "duration": 25424500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefination.placeholder_as_User_Name()"
});
formatter.result({
  "duration": 51332500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefination.placeholder_as_Password()"
});
formatter.result({
  "duration": 46341700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefination.by_defult_in_English()"
});
formatter.result({
  "duration": 81141900,
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
  "duration": 63406500,
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
  "duration": 50500100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefination.clicks_on_the_login_button()"
});
formatter.result({
  "duration": 53169200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefination.succeful_authentication_mesg()"
});
formatter.result({
  "duration": 1159664300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefination.unimicorn_logo_present()"
});
formatter.result({
  "duration": 54693500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefination.the_user_should_be_on_the_BQ_dashboard_page()"
});
formatter.result({
  "duration": 1671797300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefination.close_the_browser()"
});
formatter.result({
  "duration": 976089400,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "User logs in to BQ Dashboard",
  "description": "",
  "id": "login-to-bq-dashboard;user-logs-in-to-bq-dashboard;;3",
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
  "name": "enters the Username \"mallikarjuna.ss@ncs-india.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "enters the password \"Malli@123karjuna\"",
  "matchedColumns": [
    1
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
  "duration": 2147330200,
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
  "duration": 1464497600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefination.varify_title()"
});
formatter.result({
  "duration": 11084200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefination.varify_LoginPage_LargeBluebox()"
});
formatter.result({
  "duration": 30635100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefination.user_will_see_Withbotti_quote_in_bolt_latters()"
});
formatter.result({
  "duration": 24799600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefination.placeholder_as_User_Name()"
});
formatter.result({
  "duration": 51962000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefination.placeholder_as_Password()"
});
formatter.result({
  "duration": 59140800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefination.by_defult_in_English()"
});
formatter.result({
  "duration": 70166500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mallikarjuna.ss@ncs-india.com",
      "offset": 21
    }
  ],
  "location": "LoginStepdefination.enters_the_username(String)"
});
formatter.result({
  "duration": 70011800,
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
  "duration": 57183400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefination.clicks_on_the_login_button()"
});
formatter.result({
  "duration": 56235000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefination.succeful_authentication_mesg()"
});
formatter.result({
  "duration": 597901200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefination.unimicorn_logo_present()"
});
formatter.result({
  "duration": 53967100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefination.the_user_should_be_on_the_BQ_dashboard_page()"
});
formatter.result({
  "duration": 1747533000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefination.close_the_browser()"
});
formatter.result({
  "duration": 975935100,
  "status": "passed"
});
});