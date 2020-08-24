Feature: Validating place API's

  Scenario: Verify place is being succesfully added
    Given add place payload
    When user calls "Add place API" with Post http request
    Then the API call is success and status code 200
    And "status" in responce body is "OK"
    And "scope" in responce body is "APP" 
