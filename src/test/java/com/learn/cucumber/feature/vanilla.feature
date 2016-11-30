Feature: This is a vanilla feature file that would be use to test data tables.


  Scenario: Successful Login with Valid Credentials
    Given User is on Login Page
    When User enters Credentials to LogIn
      | testuser_1 | Test@153 |
    Then Message displayed Login Successfully


