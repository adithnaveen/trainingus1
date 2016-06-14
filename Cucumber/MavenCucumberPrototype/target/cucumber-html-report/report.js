$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/mavencucumber/mavenCucumberPrototype/Login.feature");
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
  "duration": 143598771,
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
  "line": 8
});
formatter.step({
  "name": "click on login button",
  "keyword": "And ",
  "line": 9
});
formatter.step({
  "name": "I am logged into application",
  "keyword": "Then ",
  "line": 10
});
formatter.match({
  "location": "LoginStep.launch_the_application()"
});
formatter.result({
  "duration": 58561,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.enter_valid_username_and_password()"
});
formatter.result({
  "duration": 53127,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.click_on_login_button()"
});
formatter.result({
  "duration": 81502,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.I_am_logged_into_application()"
});
formatter.result({
  "duration": 79087,
  "status": "passed"
});
});