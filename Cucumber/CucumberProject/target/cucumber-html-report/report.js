$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "id": "login-into-account",
  "tags": [
    {
      "name": "@smoke",
      "line": 1
    }
  ],
  "description": "",
  "name": "Login into account",
  "keyword": "Feature",
  "line": 3
});
formatter.scenario({
  "id": "login-into-account;valid-username-and-password",
  "description": "",
  "name": "valid username and password",
  "keyword": "Scenario",
  "line": 5,
  "type": "scenario"
});
formatter.step({
  "name": "launch the application",
  "keyword": "Given ",
  "line": 6
});
formatter.step({
  "name": "enter valid username and password",
  "keyword": "Then ",
  "line": 7,
  "rows": [
    {
      "cells": [
        "User_Name",
        "Password"
      ],
      "line": 8
    },
    {
      "cells": [
        "Naveen",
        "india"
      ],
      "line": 9
    },
    {
      "cells": [
        "Scott",
        "america"
      ],
      "line": 10
    },
    {
      "cells": [
        "Kanchan",
        "england"
      ],
      "line": 11
    }
  ]
});
formatter.step({
  "name": "click on login button",
  "keyword": "And ",
  "line": 12
});
formatter.step({
  "name": "I am logged into application",
  "keyword": "Then ",
  "line": 13
});
formatter.match({
  "location": "LoginStep.launch_the_application()"
});
formatter.result({
  "duration": 120442431,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.enter_valid_username_and_password(DataTable)"
});
formatter.result({
  "duration": 2711313,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.click_on_login_button()"
});
formatter.result({
  "duration": 55542,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.I_am_logged_into_application()"
});
formatter.result({
  "duration": 54335,
  "status": "passed"
});
formatter.uri("shopping.feature");
formatter.feature({
  "id": "check-my-basket-application",
  "tags": [
    {
      "name": "@sanity",
      "line": 1
    }
  ],
  "description": "",
  "name": "Check my basket application",
  "keyword": "Feature",
  "line": 2
});
formatter.scenario({
  "id": "check-my-basket-application;no-item-selected-in-basket",
  "description": "",
  "name": "No item selected in basket",
  "keyword": "Scenario",
  "line": 5,
  "type": "scenario"
});
formatter.step({
  "name": "I start the application",
  "keyword": "Given ",
  "line": 6
});
formatter.step({
  "name": "I should see a selection of products",
  "keyword": "Then ",
  "line": 7
});
formatter.step({
  "name": "I browse \"without\" buying product",
  "keyword": "When ",
  "line": 8
});
formatter.step({
  "name": "my basket \"should\" be empty",
  "keyword": "Then ",
  "line": 9
});
formatter.step({
  "name": "I \"cannot\" buy any item",
  "keyword": "And ",
  "line": 10
});
formatter.match({
  "location": "shoppingStep.I_start_the_application()"
});
formatter.result({
  "duration": 160590,
  "status": "passed"
});
formatter.match({
  "location": "shoppingStep.I_should_see_a_selection_of_products()"
});
formatter.result({
  "duration": 72447,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "without",
      "offset": 10
    }
  ],
  "location": "shoppingStep.I_browse_without_buying_product(String)"
});
formatter.result({
  "duration": 724466,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "should",
      "offset": 11
    }
  ],
  "location": "shoppingStep.my_basket_should_be_empty(String)"
});
formatter.result({
  "duration": 110481,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "cannot",
      "offset": 3
    }
  ],
  "location": "shoppingStep.I_cannot_buy_any_item(String)"
});
formatter.result({
  "duration": 108067,
  "status": "passed"
});
formatter.scenario({
  "id": "check-my-basket-application;some-item-selected-in-basket",
  "description": "",
  "name": "Some item selected in basket",
  "keyword": "Scenario",
  "line": 12,
  "type": "scenario"
});
formatter.step({
  "name": "I start the application",
  "keyword": "Given ",
  "line": 13
});
formatter.step({
  "name": "I should see a selection of products",
  "keyword": "Then ",
  "line": 14
});
formatter.step({
  "name": "I browse \"with\" buying product",
  "keyword": "When ",
  "line": 15
});
formatter.step({
  "name": "my basket \"shouldnot\" be empty",
  "keyword": "Then ",
  "line": 16
});
formatter.step({
  "name": "I \"can\" buy any item",
  "keyword": "And ",
  "line": 17
});
formatter.match({
  "location": "shoppingStep.I_start_the_application()"
});
formatter.result({
  "duration": 69428,
  "status": "passed"
});
formatter.match({
  "location": "shoppingStep.I_should_see_a_selection_of_products()"
});
formatter.result({
  "duration": 55542,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "with",
      "offset": 10
    }
  ],
  "location": "shoppingStep.I_browse_without_buying_product(String)"
});
formatter.result({
  "duration": 117725,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "shouldnot",
      "offset": 11
    }
  ],
  "location": "shoppingStep.my_basket_should_be_empty(String)"
});
formatter.result({
  "duration": 105048,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "can",
      "offset": 3
    }
  ],
  "location": "shoppingStep.I_cannot_buy_any_item(String)"
});
formatter.result({
  "duration": 147308,
  "status": "passed"
});
});