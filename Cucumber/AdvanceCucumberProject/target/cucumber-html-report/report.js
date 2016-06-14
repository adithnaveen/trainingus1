$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("shopping.feature");
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
formatter.scenarioOutline({
  "id": "check-my-basket-application;no-item-selected-in-basket",
  "description": "",
  "name": "No item selected in basket",
  "keyword": "Scenario Outline",
  "line": 5,
  "type": "scenario_outline"
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
  "name": "I browse \"\u003cBuying_Products\u003e\" buying product",
  "keyword": "When ",
  "line": 8
});
formatter.step({
  "name": "my basket \"\u003cBasket_Status\u003e\" be empty",
  "keyword": "Then ",
  "line": 9
});
formatter.step({
  "name": "I \"\u003cBuy_Status\u003e\" buy any item",
  "keyword": "And ",
  "line": 10
});
formatter.examples({
  "id": "check-my-basket-application;no-item-selected-in-basket;",
  "description": "",
  "name": "",
  "keyword": "Examples",
  "line": 12,
  "rows": [
    {
      "id": "check-my-basket-application;no-item-selected-in-basket;;1",
      "cells": [
        "Buying_Products",
        "Basket_Status",
        "Buy_Status"
      ],
      "line": 13
    },
    {
      "id": "check-my-basket-application;no-item-selected-in-basket;;2",
      "cells": [
        "without",
        "should",
        "cannot"
      ],
      "line": 14
    },
    {
      "id": "check-my-basket-application;no-item-selected-in-basket;;3",
      "cells": [
        "with",
        "shouldnot",
        "can"
      ],
      "line": 15
    },
    {
      "id": "check-my-basket-application;no-item-selected-in-basket;;4",
      "cells": [
        "maywith",
        "neednotalways",
        "may"
      ],
      "line": 16
    }
  ]
});
formatter.scenario({
  "id": "check-my-basket-application;no-item-selected-in-basket;;2",
  "tags": [
    {
      "name": "@sanity",
      "line": 1
    }
  ],
  "description": "",
  "name": "No item selected in basket",
  "keyword": "Scenario Outline",
  "line": 14,
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
  "line": 8,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "my basket \"should\" be empty",
  "keyword": "Then ",
  "line": 9,
  "matchedColumns": [
    1
  ]
});
formatter.step({
  "name": "I \"cannot\" buy any item",
  "keyword": "And ",
  "line": 10,
  "matchedColumns": [
    2
  ]
});
formatter.match({
  "location": "shoppingStep.I_start_the_application()"
});
formatter.result({
  "duration": 127156418,
  "status": "passed"
});
formatter.match({
  "location": "shoppingStep.I_should_see_a_selection_of_products()"
});
formatter.result({
  "duration": 71239,
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
  "duration": 1822031,
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
  "duration": 97199,
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
  "duration": 105047,
  "status": "passed"
});
formatter.scenario({
  "id": "check-my-basket-application;no-item-selected-in-basket;;3",
  "tags": [
    {
      "name": "@sanity",
      "line": 1
    }
  ],
  "description": "",
  "name": "No item selected in basket",
  "keyword": "Scenario Outline",
  "line": 15,
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
  "name": "I browse \"with\" buying product",
  "keyword": "When ",
  "line": 8,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "my basket \"shouldnot\" be empty",
  "keyword": "Then ",
  "line": 9,
  "matchedColumns": [
    1
  ]
});
formatter.step({
  "name": "I \"can\" buy any item",
  "keyword": "And ",
  "line": 10,
  "matchedColumns": [
    2
  ]
});
formatter.match({
  "location": "shoppingStep.I_start_the_application()"
});
formatter.result({
  "duration": 72446,
  "status": "passed"
});
formatter.match({
  "location": "shoppingStep.I_should_see_a_selection_of_products()"
});
formatter.result({
  "duration": 48298,
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
  "duration": 100821,
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
  "duration": 90558,
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
  "duration": 93577,
  "status": "passed"
});
formatter.scenario({
  "id": "check-my-basket-application;no-item-selected-in-basket;;4",
  "tags": [
    {
      "name": "@sanity",
      "line": 1
    }
  ],
  "description": "",
  "name": "No item selected in basket",
  "keyword": "Scenario Outline",
  "line": 16,
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
  "name": "I browse \"maywith\" buying product",
  "keyword": "When ",
  "line": 8,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "my basket \"neednotalways\" be empty",
  "keyword": "Then ",
  "line": 9,
  "matchedColumns": [
    1
  ]
});
formatter.step({
  "name": "I \"may\" buy any item",
  "keyword": "And ",
  "line": 10,
  "matchedColumns": [
    2
  ]
});
formatter.match({
  "location": "shoppingStep.I_start_the_application()"
});
formatter.result({
  "duration": 74258,
  "status": "passed"
});
formatter.match({
  "location": "shoppingStep.I_should_see_a_selection_of_products()"
});
formatter.result({
  "duration": 54939,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "maywith",
      "offset": 10
    }
  ],
  "location": "shoppingStep.I_browse_without_buying_product(String)"
});
formatter.result({
  "duration": 95992,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "neednotalways",
      "offset": 11
    }
  ],
  "location": "shoppingStep.my_basket_should_be_empty(String)"
});
formatter.result({
  "duration": 89955,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "may",
      "offset": 3
    }
  ],
  "location": "shoppingStep.I_cannot_buy_any_item(String)"
});
formatter.result({
  "duration": 86332,
  "status": "passed"
});
});