@regression
Feature:  User should be able to refer a product to a friend via email
@email
  Scenario: As a registered user I want to refer a product to a friend via email
    Given Registered user is on product page
    When clicks on Email a Friend button
    And fills email details
    And clicks on Send Email Button
    Then sees a sent email confirmation message display

@email
    Scenario: Unregistered user should not be able to refer a product to a friend via email
      Given User is on product page
      When clicks on Email a Friend button
      And fills email details
      And clicks on Send Email Button
      Then sees an error message display

