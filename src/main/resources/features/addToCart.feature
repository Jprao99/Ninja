Feature: Add to Cart Feature Functionality

Background:
Given user open the browser and launch the application

Scenario Outline: Validate adding the product to cart from product display page

When user enter product <name> into the search text box
And user click on the button having search icon
And user click on the product displayed in the search result
And user click on the Add to cart button
Then user should see a success message
And user click on the shopping cart link in the message
Then user should see product <name> in the shopping cart page

Examples:
| name |
|iMac  |
|iPhone|

@new
Scenario Outline: Validate adding the products from wishList Page

When user has navigate to the login page
When user enters the email and password "prabasraj@gmail.com" "Prabas"
And user clicks on login button
And user navigates to home page
And user add items to wishlist
When user navigates to wishlist page by clicking wishlist menu link
When user clicks on add to cart button
When user navigates to shopping cart page by clicking shopping cart menu link
Then user should able to see the product in the page







