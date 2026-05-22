# springboot-cucumber-api-demo

This repository contains a simple Spring Boot text application with a Thymeleaf UI, REST API endpoints, and Cucumber-based API automation tests. The project generates local HTML reports so test results can be reviewed by developers, testers, and business stakeholders.

## Features

- Spring Boot application
- Thymeleaf UI for basic text entry and viewing
- REST API for saving and retrieving text
- H2 in-memory database
- Cucumber API automation tests
- Local HTML report generation

## Tech stack

- Java 17
- Spring Boot
- Thymeleaf
- Spring Data JPA
- H2 Database
- Gradle
- Cucumber

## Run the application

On Windows:

```bash
gradlew bootRun
```

On macOS/Linux:

```bash
./gradlew bootRun
```

The application will start on:

`http://localhost:8080`

## Run tests

On Windows:

```bash
gradlew test
```

On macOS/Linux:

```bash
./gradlew test
```

## View the Cucumber report

After running the tests, open this file in your browser:

`build/reports/cucumber/cucumber.html`

## Example API endpoints

### Save text
`POST /api/text`

Example request body:

```json
{
  "content": "hello"
}
```

### Get all text
`GET /api/text`

## Purpose

This project is a simple proof of concept for API test automation in Spring Boot using Cucumber. It demonstrates how to create business-readable automated tests and generate reports that can be reviewed locally without requiring a browser-based UI test.
