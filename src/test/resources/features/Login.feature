@Regression
  Feature: Login functionality
    As a user, I want to be able to login on the CURA Healthcare Service website with valid credentials,
    and see appropriate error messages with invalid credentials.
  Background:
    Given User already on Login Page

    Scenario: Successful login with valid credentials
      When User input "John Doe" as userName and input "ThisIsNotAPassword" as password
      Then User already on Main Page

    Scenario: Login with Empty Username and Password
      When User input "" as userName and input "" as password
      Then User already on Login Page

    Scenario: Login with Empty Username
      When User input "" as userName and input "ThisIsNotAPassword" as password
      Then User already on Login Page

    Scenario: Login with Empty Password
      When User input "Jhon Doe" as userName and input "" as password
      Then User already on Login Page