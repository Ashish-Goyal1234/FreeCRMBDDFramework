Feature: Deal Data Creation

Scenario: FreeCRM create a new deal scenario

Given user is already on login page
When title of login page id free crm
Then user enters username and password
| batchautomation | Test@12345 |

Then user clicks on login button
Then user is on Home page
Then user move to new deal page
Then user enters deal details 
# Test data driven example below
| test deal | 1000 | 50 | 10|    

Then close the browser