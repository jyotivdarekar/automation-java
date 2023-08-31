Feature: Feature is to test login functionality

  Scenario Outline: LogIn validation with credentials
    Given User should be on login page
    When User enters Username as "<UserName>"
    And User enters password as "<Password>"
    And User clicks on login button <ButtonNo>
    Then User should be redirected to the Home page

  Examples:
    | UserName | Password | ButtonNo |
    |  Jyoti   |  abc@12  |     1    |
    |  Vikas   |  pqr@21  |      2  |
    