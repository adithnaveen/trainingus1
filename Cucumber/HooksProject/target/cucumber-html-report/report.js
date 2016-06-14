$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "id": "login-into-account",
  "description": "",
  "name": "Login into account",
  "keyword": "Feature",
  "line": 1
});
formatter.background({
  "description": "",
  "name": "",
  "keyword": "Background",
  "line": 3,
  "type": "background"
});
formatter.step({
  "name": "Lanuch chrome browser",
  "keyword": "Given ",
  "line": 4
});
formatter.match({
  "location": "LoginStep.Lanuch_chrome_browser()"
});
formatter.result({
  "duration": 161040888,
  "status": "passed"
});
formatter.scenario({
  "id": "login-into-account;valid-username-and-password",
  "description": "",
  "name": "valid username and password",
  "keyword": "Scenario",
  "line": 6,
  "type": "scenario"
});
formatter.step({
  "name": "launch the application",
  "keyword": "Given ",
  "line": 7
});
formatter.step({
  "name": "enter valid username and password",
  "keyword": "Then ",
  "line": 8,
  "rows": [
    {
      "cells": [
        "User_Name",
        "Password"
      ],
      "line": 9
    },
    {
      "cells": [
        "Naveen",
        "india"
      ],
      "line": 10
    },
    {
      "cells": [
        "Scott",
        "america"
      ],
      "line": 11
    },
    {
      "cells": [
        "Kanchan",
        "england"
      ],
      "line": 12
    }
  ]
});
formatter.step({
  "name": "click on login button",
  "keyword": "And ",
  "line": 13
});
formatter.step({
  "name": "I am logged into application",
  "keyword": "Then ",
  "line": 14
});
formatter.match({
  "location": "LoginStep.launch_the_application()"
});
formatter.result({
  "duration": 320576,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.enter_valid_username_and_password(DataTable)"
});
formatter.result({
  "duration": 6238858,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.click_on_login_button()"
});
formatter.result({
  "duration": 275297,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.I_am_logged_into_application()"
});
formatter.result({
  "duration": 108066,
  "status": "passed"
});
formatter.uri("Signup.feature");
formatter.feature({
  "id": "signup-for-account",
  "description": "",
  "name": "Signup for account",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "signup-for-account;signup",
  "description": "",
  "name": "Signup",
  "keyword": "Scenario",
  "line": 3,
  "type": "scenario"
});
formatter.step({
  "name": "signup for account",
  "keyword": "Given ",
  "line": 4
});
formatter.match({
  "location": "SignupStep.signup_for_account()"
});
formatter.result({
  "duration": 140667,
  "status": "passed"
});
});