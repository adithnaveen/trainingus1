Feature: Login into account

Background: 
Given Lanuch chrome browser 
Given Do One More Job


  Scenario: valid username and password
    Given launch the application
    Then enter valid username and password
    |User_Name        |Password    |
    |Naveen           |india       |
    |Scott            |america    |
    |Kanchan          |england    |            
    And click on login button
    Then I am logged into application
