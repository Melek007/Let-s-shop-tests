@tag
Feature: Let's shop test

  @tag1
  Scenario Outline: Login test case
    Given I launch browser
    And I go to <url>
    When I fill email <userEmail>
    And I fill password <userPassword>
    And I click login button
    Then I take screenshot

    Examples: 
      | url | userEmail | userPassword |
      | https://rahulshettyacademy.com/client/ | user0.test5@gmail.com | 1234@User5678 |
