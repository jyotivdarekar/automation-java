Feature: Feature to check logIn functionality

Scenario: check login functionality with credentials
Given user is on amazons website
And user clicks on signIn button
When user enters userId and clicks on continue button
And user enters password and clicks on login button
Then user should redirected to home page
And should display account holders name on homepage
And user clicks on signout

