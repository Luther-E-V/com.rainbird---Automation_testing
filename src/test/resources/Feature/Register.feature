Feature: Registration
  Scenario Outline: User access page and start to register an account
    Given User access to page
    When User click CREATE ACCOUNT
    Then User is navigated to Term of licence page
    When User read and click consent checkbox
    Then User is navigated to Registration page
    When User fill out "<Country>" as Country and "<Timezone>" as Timezone and "<State>" as State
    And User fill out "<Account Name>" as Account Name and "<Address>" as Address
    And User fill out "<City>" as City and "<Postal Code>" as Postal Code
    And User fill out "<Contact Name>" as Contact Name and "<Phone Number>" as Phone Number
    And User fill out "<Email>" as Email and "<Confirm Email>" as Confirm Email
    And User fill out "<User Name>" as User Name
    And User fill out "<Password>" as Password and "<Confirm Password>" as Confirm Password
    When User click Required field checkbox
    And User click Register button
    Then User should be navigated to Email Verification page
    Given User access to Email page
    When User follow steps and confirm Email address
    Then User is redirected to page

    Examples:
      |Country|Timezone| State|Account Name|Address|City|Postal Code|Contact Name|Phone Number|Email|Confirm Email|User Name|Password|Confirm Password|
      |Vietnam|SE Asia Standard Time||demotesting|123 ABC DEF|ghi|55000|demotesting user|0123456789|duczo181818@gmail.com|duczo181818@gmail.com|demotesting|123321123@Qq|123321123@Qq|



