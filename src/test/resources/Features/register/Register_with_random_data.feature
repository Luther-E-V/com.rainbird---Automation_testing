Feature: Registration
  @random_data
  Scenario: User access page and start to register an account
  Given User access to page
  When User click CREATE ACCOUNT
  Then User is navigated to Term of licence page
  When User read and click consent checkbox
  Then User is navigated to Registration page
  When User fill out Country
  And User fill out Timezone
  And User fill out State
  And User fill out Account Name
  And User fill out Address
  And User fill out City
  And User fill out Postal Code
  And User fill out Contact Name
  And User fill out Phone Number
  And User fill out Email
  And User fill out Confirm Email
  And User fill out User Name
  And User fill out Password
  And User fill out Confirm Password
  When User click Required field checkbox
  And User click Register button
  Then User should be navigated to Email Verification page
