@regression
Feature: As a user I want to register so that I can enjoy all the shopping facilities
  @register
  Scenario: user should be able to register successfully with valid credentials
    Given user is on registration page
    When when user enters all compulsory fields
    And clicks register button
    Then sees confirmation message display

