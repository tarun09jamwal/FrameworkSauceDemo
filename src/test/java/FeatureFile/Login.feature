Feature: feature to test website functionality
  Scenario: Check user is able to buy product
    Given user is on login page
    And user enters username and password
    And clicks on login button
    When user is navigated to the home page
    And verify the product page
    And click on any add to cart button
    And navigate to the carts button
    Then user is navigated to the cart
    And click on checkout fill the your information and click continue
    And Verify the item in overview page and click finish button
    And user is logged out and browser closes