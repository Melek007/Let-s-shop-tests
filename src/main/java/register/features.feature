@tag
Feature: Let's shop tests

  @tag2
  Scenario Outline: Register
    Given I launch browser and i connect to <url>
    When I click to register
    And I fill first name <firstName>
    And I fill last name <lastName>
    And I fill user email <userEmail>
    And I fill user mobile <userMobile>
    And I select <occupation>
    And I check gender
    And I fill userPassword <userPassword>
    And I check age checkbox 
    Then I click login
    And I take screenshot 

    Examples: 
      | url  | firstName | lastName | userEmail | userMobile | occupation | userPassword |
      | https://rahulshettyacademy.com/client | User | Test | user0.test5@gmail.com | 1612345678 | Student | 1234@User5678 |
