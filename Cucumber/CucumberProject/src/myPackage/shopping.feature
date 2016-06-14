@sanity
Feature: Check my basket application


  Scenario: No item selected in basket
    Given I start the application
    Then I should see a selection of products
    When I browse "without" buying product
    Then my basket "should" be empty
    And I "cannot" buy any item

  Scenario: Some item selected in basket
    Given I start the application
    Then I should see a selection of products
    When I browse "with" buying product
    Then my basket "shouldnot" be empty
    And I "can" buy any item
    