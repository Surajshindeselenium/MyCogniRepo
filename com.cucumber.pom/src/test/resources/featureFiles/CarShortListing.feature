@Search-Cars
Feature: Validate complete Car shortlisting functionality

  @Search-Cars-Positive
  Scenario: Validate user able to short car from the home page
    Given I am on home page "https://www.carsguide.com.au/" of cars guild.com
    When user clicks on make dropdown and user selects moke as "Abarth"
    Then model dropdown opens and User selects model as "595C"
    And Verify title as "Abarth 595C Review, For Sale, Price & Specs | CarsGuide@@"
    #Abarth 595C Review, For Sale, Price & Specs | CarsGuide
    Then user selects car as "2018 Abarth 595C"
    And user clicks on Add to shortlist button
    
