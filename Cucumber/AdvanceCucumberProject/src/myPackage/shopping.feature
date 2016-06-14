@sanity
Feature: Check my basket application


Scenario Outline: No item selected in basket
Given I start the application
Then I should see a selection of products
When I browse "<Buying_Products>" buying product
Then my basket "<Basket_Status>" be empty
And I "<Buy_Status>" buy any item

Examples:
|Buying_Products|Basket_Status|Buy_Status|
|without        |should       |cannot    |
|with           |shouldnot    |can       |
|maywith        |neednotalways|may       |