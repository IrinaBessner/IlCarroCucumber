Feature: Login

  @validData
  Scenario: Login with valid data
    Given User launches Chrome browser
    When User opens iLCarro HomePage
    And User clicks on Login link
    And User enters valid data
    And User clicks on Yalla button
    Then User verifies Success Message is displayed
    Then User clicks on OK button
    And User quites browser

  @invalidPassword
  Scenario Outline: Login with valid email and invalid password
    Given User launches Chrome browser
    When User opens iLCarro HomePage
    And User clicks on Login link
    And User enters valid email and invalid password
      | email   | password   |
      | <email> | <password> |
    And User clicks on Yalla button
    Then User verifies Error is displayed
    Examples:
      | email            | password    |
      | akuna@matata.com | Africa20244 |
      | akuna@matata.com | A202422024! |
      | akuna@matata.com | africa2024! |
      | akuna@matata.com | africa!!!!! |



