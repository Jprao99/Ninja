Feature: wishlist functionality

Background: 
Given user open the browser and launch the application

Scenario: user trying to add items to whislist

And user has navigate to the login page
When user enters the email and password "prabasraj@gmail.com" "Prabas"
And user clicks on login button
And user navigates to home page
And user add items to wishlist
Then user should see success message


