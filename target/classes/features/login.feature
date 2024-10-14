
Feature: Login Functionality

Background: 
Given user open the browser and launch the application 

Scenario: user trying to login with valid credentials
 
And user has navigate to the login page
When user enters the email and password "prabasraj@gmail.com" "Prabas"
And user clicks on login button
Then user should see my account page


Scenario: user trying to login with valid email and invalid password 

And user has navigate to the login page
When user enters the valid email and invalid password "prabasraj@gmail.com" "prabas"
And user clicks on login button
Then user should able to see error message

Scenario: user trying to login with invalid email and valid password
And user has navigate to the login page
When user enters the invalid email and valid password "pra@gmail.com" "Prabas"
And user clicks on login button
Then user should able to see error message

Scenario: user trying to login with invalid email and invalid password
And user has navigate to the login page
When user enters the invalid email and invalid password "pra@gmail.com" "prabas"
And user clicks on login button
Then user should able to see error message

