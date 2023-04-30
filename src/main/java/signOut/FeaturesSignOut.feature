@tag
Feature: Let's shop TNR
  @tag1
  Scenario Outline: Sign out
    Given I go to <url>
    When I fill <userEmail> and <userPassword>
    Then I sign out

    Examples: 
      | url  | userEmail | userPassword  |
      | https://rahulshettyacademy.com/client/ | user0.test5@gmail.com | 1234@User5678 |
