Feature: Registration
  Scenario: User access page and start to register an account
    Given User access to page
    When User click Create an account
    Then User is navigated to Term of licence page
    When User read and click consent checkbox
    Then User is navigated to Registration page
    Given User fills out registration form
    When User click Required field checkbox
    And User click Register button