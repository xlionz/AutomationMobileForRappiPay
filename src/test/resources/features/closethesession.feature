#authot: Andres Roldan
#lenguage: EN

Feature: Close the session in the kyte app
  Me as a user
  I want to log out
  To be able to use the app

  Background:
    Given "pepe" clicks on the login button
    When  enters valid credentials
    Then should see the landingpage

  @LogOutKyteApp
  Scenario: Try to log out
    When accesses the management account
    And closes the session
    Then should see the main page