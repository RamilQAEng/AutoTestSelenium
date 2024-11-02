Feature: Autho in site

  Scenario: Login user with valid
    Then Input login
    Then Input Password
    Then Click button

  Scenario: Login user with invalid
    Then Input invlaid login
    Then Input invalid Password
    And Click button now
