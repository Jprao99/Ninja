Feature: Search functionality

Background:
Given user open the browser and launch the application

Scenario: User trying to search the product on the application

And user has navigate to the login page
When user enters the email and password "prabasraj@gmail.com" "Prabas"
And user clicks on login button
And user navigates to home page
And user enters the product name "Iphone" in the search box
And user clicks on search button
Then user should able to see the product in the result

