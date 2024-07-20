# Cat Facts API Test Automation

This project is an API test automation framework using Java, RestAssured, Maven, and TestNG. It tests the Cat Facts API to ensure that the random cat fact retrieved is not empty & get one random cat fact.

## Project Structure

- src/test/java
  - CatFactsTest.java: test cases for the Cat Facts API.
  - ApiPage.java: class for making API requests.
  - Configuration.java: class for setting up the base URI.

## Prerequisites

- Java 21.0.2
- Maven
- An IDE (IntelliJ IDEA)

## Dependencies

The project uses the following dependencies:

- RestAssured
- TestNG

These dependencies are specified in the pom.xml file.

## Setup
Open the project in your IDE.
Running the Tests
You can run the tests using your IDE.

Using IDE
Right-click on the CATAPI.java file.
Select Run 'CATAPI'.
Test Details
CATAPI.java
This class contains the test case to verify that the random cat fact retrieved from the API is not empty.
