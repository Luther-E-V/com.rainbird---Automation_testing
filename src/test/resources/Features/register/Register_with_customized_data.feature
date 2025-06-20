Feature: Registration
  @customized_data
  Scenario Outline: User access page and start to register an account
    Given User access to page
    When User click CREATE ACCOUNT
    Then User is navigated to Term of licence page
    When User read and click consent checkbox
    Then User is navigated to Registration page
    When User have done populating data
    And User click Required field checkbox
    And User click Register button
    Then User should be navigated to Email Verification page
  Examples:
    |user_key|
    |user_1  |
#    |Country|Timezone|Account Name|Address|City  |Postal Code|State |Contact Name|Phone Number|Email  |Confirm Email|User Name|Password|Confirm Password|
#    |user_1 |user_1  |user_1      |user_1 |user_1|user_1     |user_1|user_1      |user_1      |user_1 |user_1       |user_1  |user_1   |user_1          |

