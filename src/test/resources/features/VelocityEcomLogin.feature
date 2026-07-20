Feature: Velocity Ecom login

  @functional
  Scenario: user login as an Admin
    Given User is on ecom login page
    When user clicks on admin button
    And User enters username as "9923478751"
    And user enters password as "Velocity@123"
    And User clicks on Access Dashboard button
    Then user navigates to dashboard page

@regression
    Scenario:user login as customer
      Given User is on ecom login page
      When user clicks on customer button
      And User enters username as "8877766778"
      And user enters password as "Velocity@123"
      And User clicks on Access Dashboard button
      Then user navigates to homepage


#  Scenario Outline: login with multiple Admin users
#    Given User is on ecom login page
#    When user clicks on admin button
#    And User enters username as "<username>"
#    And user enters password as "<password>"
#    And User clicks on Access Dashboard button
#    Then user navigates to dashboard page
#    Examples:
#    |username|password|
#    |333444444|Test@123|
#    |56747465 |Test@1234|
#    |6747657586|Test@321|

