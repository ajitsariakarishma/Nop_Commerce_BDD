@regression
Feature:  User should be able to buy a product
  @checkout
  Scenario: As a registered user I want to buy a product successfully using master card
    Given Registered user is on htc_mobile page
    When clicks on Add to Cart button
    And clicks on Shopping Cart link
    And clicks on accept terms and conditions checkbox
    And clicks on Checkout button
    And fills billing address details
    And fills card details
    Then sees a order successfully processed message display

  @checkout
  Scenario: Guest user should  able to buy a product successfully using master card
    Given User is on htc_mobile page
    When clicks on Add to Cart button
    And clicks on Shopping Cart link
    And clicks on accept terms and conditions checkbox
    And clicks on Checkout button
    And clicks on checkout as guest button
    And fills billing address details
    And fills card details
    Then sees a order successfully processed message display

