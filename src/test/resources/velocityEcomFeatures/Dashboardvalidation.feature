Feature: Validate Velocity Ecom Application
  Scenario: Validate Dashboard
    Given user clicks on admin button of velocity Ecom Application
    When user enters username as "9923478751" on velocity Ecom Application 
    And user enters password as "Velocity@123" on velocity Ecom Application
    And user clicks on AccessDashboard button
    Then user navigates to dashboard page and validate details


  Scenario: Validate Inventory Update details
    Given user clicks on admin button of velocity Ecom Application
    When user enters username as "9923478751" on velocity Ecom Application
    And user enters password as "Velocity@123" on velocity Ecom Application
    And user clicks on AccessDashboard button
    And user clicks on Inventory Update
    Then user validates total entries, open_partial,fully recieved

    Scenario: Add new product
      Given user clicks on admin button of velocity Ecom Application
      When user enters username as "9923478751" on velocity Ecom Application
      And user enters password as "Velocity@123" on velocity Ecom Application
      And user clicks on AccessDashboard button
      And user clicks on products
      And user clicks on Add product button
      Then new product should be added when user clicks on create product button

