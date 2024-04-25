Feature: Add car

  @addCars
  Scenario: Let the car work
    Given User launches Chrome browser
    When User opens iLCarro HomePage
    And User clicks on Login link
    And User enters valid data
    And User clicks on Yalla button
    And User clicks on the Let the car work
    And User enters Location
    And User enter a make
    And User enter a model
    And User enter year
    And User selects fuel
    And User enter number if seats
    And User enter car class
    And User enter registration number
    And User enter price
    And User enters About
    And User enters Photos car
    And User clicks on Submit button
    Then User verifies Success message is displayed
    And User quites browser