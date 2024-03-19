Feature: Online Product page validation
  Check if all varieties of shoes are displayed
  Scenario: Validation of online products page
    Given user is on Shoeportal page
    When user clicks hamburger menu
    And selects Online Products option
    Then check first formal shoe is "Classic Cheltenham"
    And First sports shoe is "Ultimate"
    And First Sneaker shoe is "Archivo"

