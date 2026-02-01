#authot: Andres Roldan
#lenguage: EN

Feature: Make a login in kyteapp
  Me as a user
  I want to login in kyteapp
  To be able to use the app

  @SigInKyteApp
  Scenario: Make a login with valid credentials
    Given "pepe" clicks on the login button
    When  enters valid credentials
    Then  should see the landingpage
