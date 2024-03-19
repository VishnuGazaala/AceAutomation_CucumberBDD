Feature:Signin features
  Validate signin with valid credentials

  Background:
    Given user is on Shoeportal page
    When user clicks hamburger menu
    And selects signin portal option

  Scenario: Signin feature validation
    Then User should be able to enter username and pasword
    And click on Login button

  Scenario: Register new customer validation
    When user clicks on register new button
    Then enters required information
    And click submit button
    Then user should see "User Registered Successfully !!!" message


