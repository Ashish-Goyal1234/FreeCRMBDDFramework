Feature: Free CRM Login Feature



			# Data Driven without Examples Keyword.
			# Scenario  is used in Data driven without examples Keyword.
			
			# Scenario: Free CRM Login Test Scenario
#Given user is already on login page
#When title of login page id free crm
#Then user enter username and password
#Then user enter "batchautomation" and "Test@12345"  #Data Driven without Examples Keyword.
#Then user clicks on login button
#Then user is on Home page
#Then close the browser

					#Data Driven with Examples Keyword.
					# Scenario Outline is used in Data driven with examples Keyword.
Scenario Outline: Free CRM Login Test Scenario
Given user is already on login page
When title of login page id free crm
Then user enter "<username>" and "<password>" 
Then user clicks on login button
Then user is on Home page
Then close the browser

Examples:
	| username | password |
	| batchautomation | Test@12345 |
	| Tom | test456 |
	
	
						#Able to add multiple scenario in feature file.
						
						
						
# Scenario: user is able to create a new contact
# Given user is already on Homepage
# When user mouse-hover on contacts links
# Then user clicks on new contact link
# Then user enters first name and Last name
# Then user clicks on save button.
# Then verify new contact created	  




