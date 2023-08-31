Feature: Feature is to Check LogIn Functionality

Scenario: LogIn validation with correct credentials

Given User is on login page
When user enters valid emailId or phone number
And user clicks on continue button
And user enters valid password
And user clicks on signIn button
Then user should redirected to the homePage



