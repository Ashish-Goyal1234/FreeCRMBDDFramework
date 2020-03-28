Feature: Free CRM Create Contacts

Scenario Outline: FreeCRM create a new contact

Given user is already on login page
When title of login page id free crm
Then user enter "<username>" and "<password>" 
Then user clicks on login button
Then user is on Home page
Then user move to new contact page.
Then user enters contact details "<firstname>" and "<lastname>" and "<position>"
Then close the browser


Examples:
 		| username | password | firstname | lastname | position |
 		| batchautomation | Test@12345 | Tom | cruise | manager |
 		| batchautomation | Test@12345 | David | Dsouza | Director |
 		
 		