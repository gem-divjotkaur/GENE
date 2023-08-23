@SmokeTest
Feature: General Store Automation

  Background: User sets the desired capabilities
    Given User enters the desired capabilities

  Scenario: User enters the invalid credentials
    Given User selects the country as "India" from the dropdown
    When User selects the radio-button gender as "Female"
    And User clicks on "Let's  Shop" button
    Then User handles the toast message

  Scenario Outline: User enters the valid credentials
    Given User selects the country as "India"
    When User enters the name as "<name>"
    And User selects the gender as "Female"
    And User clicks on the "Let's  Shop" button
    And User enters shoe "Air Jordan 1 Mid SE" to the cart
    And User enters another shoe "Jordan 6 Rings" to the cart
    And User go to the cart
    Then User checks if shoe "Air Jordan 1 Mid SE" and shoe "Jordan 6 Rings" are added in the cart or not
    Examples:
      | name |
      | xyz  |
