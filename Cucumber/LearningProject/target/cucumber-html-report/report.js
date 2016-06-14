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
formatter.step({
  "name": "Do One More Job",
  "keyword": "Given ",
  "line": 5
});
formatter.match({
  "location": "LoginStep.Lanuch_chrome_browser()"
});
formatter.result({
  "duration": 639516540,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.Do_One_More_Job()"
});
formatter.result({
  "duration": 85125,
  "status": "passed"
});
formatter.scenario({
  "id": "login-into-account;valid-username-and-password",
  "description": "",
  "name": "valid username and password",
  "keyword": "Scenario",
  "line": 8,
  "type": "scenario"
});
formatter.step({
  "name": "launch the application",
  "keyword": "Given ",
  "line": 9
});
formatter.step({
  "name": "enter valid username and password",
  "keyword": "Then ",
  "line": 10,
  "rows": [
    {
      "cells": [
        "User_Name",
        "Password"
      ],
      "line": 11
    },
    {
      "cells": [
        "Naveen",
        "india"
      ],
      "line": 12
    },
    {
      "cells": [
        "Scott",
        "america"
      ],
      "line": 13
    },
    {
      "cells": [
        "Kanchan",
        "england"
      ],
      "line": 14
    }
  ]
});
formatter.step({
  "name": "click on login button",
  "keyword": "And ",
  "line": 15
});
formatter.step({
  "name": "I am logged into application",
  "keyword": "Then ",
  "line": 16
});
formatter.match({
  "location": "LoginStep.launch_the_application()"
});
formatter.result({
  "duration": 70636,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.enter_valid_username_and_password(DataTable)"
});
formatter.result({
  "duration": 3366347,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.click_on_login_button()"
});
formatter.result({
  "duration": 112896,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.I_am_logged_into_application()"
});
formatter.result({
  "duration": 105651,
  "status": "passed"
});
});