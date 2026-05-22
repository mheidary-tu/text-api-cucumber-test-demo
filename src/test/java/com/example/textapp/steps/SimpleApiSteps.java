package com.example.textapp.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.*;

import static org.assertj.core.api.Assertions.assertThat;

public class SimpleApiSteps {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    private ResponseEntity<String> response;

    @When("I send a GET request to {string}")
    public void iSendAGETRequestTo(String path) {
        response = restTemplate.getForEntity("http://localhost:" + port + path, String.class);
    }

    @When("I send a POST request to {string} with body {string}")
    public void iSendAPOSTRequestToWithBody(String path, String body) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        String jsonBody = "{\"content\":\"" + body + "\"}";
        HttpEntity<String> request = new HttpEntity<>(jsonBody, headers);

        response = restTemplate.postForEntity("http://localhost:" + port + path, request, String.class);
    }

    @Then("the response status should be {int}")
    public void theResponseStatusShouldBe(int statusCode) {
        assertThat(response.getStatusCode().value()).isEqualTo(statusCode);
    }

    @Then("the response body should contain {string}")
    public void theResponseBodyShouldContain(String expectedText) {
        assertThat(response.getBody()).contains(expectedText);
    }
}