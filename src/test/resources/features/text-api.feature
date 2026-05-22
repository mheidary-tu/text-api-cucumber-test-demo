Feature: Text API

  Scenario: Save and retrieve text
    When I send a POST request to "/api/simple/text" with body "hello"
    Then the response status should be 200
    When I send a GET request to "/api/simple/text"
    Then the response status should be 200
    And the response body should contain "hello"