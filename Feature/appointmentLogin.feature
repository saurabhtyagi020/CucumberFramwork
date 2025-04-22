Feature: To test katalon

@login
  Scenario: Test the katalon login with valid Username and password
    Given I am the login page of katalon
    When I enter the correct username and password
    And I click on Login button
    Then User should be land on Make Appointment page