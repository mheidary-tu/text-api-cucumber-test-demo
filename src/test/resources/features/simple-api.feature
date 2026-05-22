Feature: Simple API endpoint

  Scenario: Call simple test endpoint
    When I send a GET request to "/api/simple/test"
    Then the response status should be 200
    And the response body should contain "ok"