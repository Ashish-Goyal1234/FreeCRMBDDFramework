Feature: Deal Data Creation

Scenario: FreeCRM create a new deal scenario

Given user is already on the login page
When title of the login page id free crm
Then user enters the username and password
| username | password |
| batchautomation | Test@12345 |

Then user clicks on the login button
Then user is on the Home page
Then user move to the new deal page
Then user enters the deal details
| title | amount |probability|commission|
| test deal1 | 1000 | 50 | 10|
| test deal2 | 2000 | 60 | 20|    
| test deal3 | 3000 | 70 | 30|    

Then closes the browser