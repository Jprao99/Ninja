Feature: Logout Functionality

Background:
Given user open the browser and launch the application
And user has navigate to the login page
When user enters the email and password "prabasraj@gmail.com" "Prabas"
And user clicks on login button

Scenario: Validate Logging out by selecting Logout option from My Account dropmenu

When user clicks on My accounts menu link and clicks on logout option
Then user should see login option in my accounts menu
When user clicks on Continue option 
Then user should navigate to home page


Scenario: Validate Logging out by selecting Logout option from Right Column options
When user clicks on logout link in the myAccounts Page
When user clicks on Continue option 
Then user should navigate to home page
