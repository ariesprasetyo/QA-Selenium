@Regression
Feature: Regression
  As a user, I want to login on CURA Healthcare demo. Then I want to buy things from it.

  Scenario Outline: Regression CURA Healthcare demo
    Given User already on Login Page
    When User input "<username>" as userName and input "<password>" as password
    Then User already on Main Page
    When User input Form to Make Appointment "<visitdate>" "<comment>"
    Then User already on Appointment Confirmation
    Examples:
      | username |  password          | visitdate  | comment            |
      | John Doe | ThisIsNotAPassword | 08/08/2024 | Aries Eko Prasetyo |