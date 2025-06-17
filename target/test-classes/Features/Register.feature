Feature: Registration
  @customized
  Scenario Outline: User access page and start to register an account
    Given User access to page
    When User click CREATE ACCOUNT
    Then User is navigated to Term of licence page
    When User read and click consent checkbox
    Then User is navigated to Registration page
    When User fill out "<Country>" as Country
    And User fill out "<Timezone>" as Timezone
    And User fill out "<Account Name>" as Account Name
    And User fill out "<Address>" as Address
    And User fill out "<City>" as City
    And User fill out "<Postal Code>" as Postal Code
    And User fill out "<State>" as State
    And User fill out "<Contact Name>" as Contact Name
    And User fill out "<Phone Number>" as Phone Number
    And User fill out "<Email>" as Email
    And User fill out "<Confirm Email>" as Confirm Email
    And User fill out "<User Name>" as User Name
    And User fill out "<Password>" as Password
    And User fill out "<Confirm Password>" as Confirm Password
    When User click Required field checkbox
    And User click Register button
    Then User should be navigated to Email Verification page
  Examples:
    |Country|Timezone| State|Account Name|Address|City|Postal Code|Contact Name|Phone Number|Email|Confirm Email|User Name|Password|Confirm Password|
    |Vietnam|SE Asia Standard Time||demot2esting|123 ABC DEF|ghi|55000|demo2testing user|0123456789|duczo181818@gmail.com|duczo181818@gmail.com|demotest2ing|123321123@Qq|123321123@Qq|

# @Register_with_valid_random_data
# Scenario: User access page and start to register an account
#   Given User access to page
#   When User click CREATE ACCOUNT
#   Then User is navigated to Term of licence page
#   When User read and click consent checkbox
#   Then User is navigated to Registration page
#   When User fill out Country
#   And User fill out Timezone
#   And User fill out State
#   And User fill out Account Name
#   And User fill out Address
#   And User fill out City
#   And User fill out Postal Code
#   And User fill out Contact Name
#   And User fill out Phone Number
#   And User fill out Email
#   And User fill out Confirm Email
#   And User fill out User Name
#   And User fill out Password
#   And User fill out Confirm Password
#   When User click Required field checkbox
#   And User click Register button
#   Then User should be navigated to Email Verification page


