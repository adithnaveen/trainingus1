@Sanity
Feature: transfer of fund


Scenario Outline: successfull transfer of fund
Given "<src_status>" source account number
And "<dest_status>" receipent account number 
And with "<balance_status>" balance 
Then "<transfer_status>"the amount

# if you are using Examples then Scenario to be changed 
# to Scenario Outline  
Examples:
|src_status    |dest_status   |balance_status |transfer_status |
|valid         |valid         |sufficient     |successful      |
|valid         |valid         |insufficient   |unsuccessful    | 
|valid         |invalid       |sufficient     |unsuccessful    |