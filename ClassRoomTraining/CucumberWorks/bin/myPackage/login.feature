@Smoke 
Feature: Login to account

Background: 
Given launch the application 

Scenario: valid username and password 
When user enters valid username and password
# this is called as data table, where we supply the values 
# for the given method 
|userName   |password   |level    |
|scott      |tiger      |Developer|
|rakesh     |hello222   |manager  |
And clicks on login button 
Then User logged into the application 


Scenario: invalid username and password 
When user enters invalid username and password
|userName   |password   |
|hi         |bye        |
And clicks on login button 
Then User notlogged into the application 
