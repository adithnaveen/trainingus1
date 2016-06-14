Feature: Login into account

Background: 
Given Lanuch chrome browser 

  Scenario: valid username and password
    Given launch the application
    Then enter valid username and password
    And click on login button
    Then I am logged into application
