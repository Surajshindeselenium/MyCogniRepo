@Search-Cars
Feature: Acceptance testing to validate search car page is working
  
  In order to validate that 
  search cars page is working 
  we will do acceptance testing

  @Search-Cars-Positive
  Scenario: Validate search car page
    Given I am on home page "https://www.carsguide.com.au/" of cars guild.com
    When I move to the menu
      | Menu          |
      | buy+sell      |
      | reviews       |
      | news          |
      | advice        |
      | pricing+specs |
      | labs          |
      | guids         |
    And click on "Search Cars" Search Cars link
    And select carbrand as "BMW" from the Any Make dropdown
    And select model as "3" from the Any Model dropdown
    And select location as "ACT - All" from the Any location dropdown
    And select Price as "$1,000" from the Price(max) dropdown
    And click on Find_My_Next_Car button
    Then I should see searched cars
    And page title should be "Bmw 1 Series M Under 1000 for Sale ACT | carsguide"
    
    @Search-Cars-Positive
  Scenario: Validate search only new cars page
    Given I am on home page "https://www.carsguide.com.au/" of cars guild.com
    When I move to the menu
      | Menu          |
      | buy+sell      |
      | reviews       |
      | news          |
      | advice        |
      | pricing+specs |
      | labs          |
      | guids         |
    And click on "Search Cars" Search Cars link
    And click on All New lable 
    And select carbrand as "Audi" from the Any Make dropdown
    And select model as "3" from the Any Model dropdown
    And select location as "ACT - All" from the Any location dropdown
    And select Price as "$90,000" from the Price(max) dropdown
    And click on Find_My_Next_Car button
    Then I should see searched cars
    And page title of new cars search should be "New Audi A4 Under 90000 for Sale ACT | carsguide"
