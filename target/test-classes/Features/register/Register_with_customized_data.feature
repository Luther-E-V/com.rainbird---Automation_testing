Feature: Registration
  @customized_data
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
    And User fill out "<Contact Name>"Contact Name
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
    |user_key|
    |user_1  |
#    |Country|Timezone|Account Name|Address|City  |Postal Code|State |Contact Name|Phone Number|Email  |Confirm Email|User Name|Password|Confirm Password|
#    |user_1 |user_1  |user_1      |user_1 |user_1|user_1     |user_1|user_1      |user_1      |user_1 |user_1       |user_1  |user_1   |user_1          |

