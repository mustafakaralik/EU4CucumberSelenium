@login
Feature: Users should be able to
  @driver @VYT-123
  Scenario: Login as a driver          //instead oF Test Case we use Scenarıo
    Given the user is on the login page
    When the user enters the driver information
    Then the user should be able to login
  @store_manager @VYT-123
  Scenario: Login as a sales manager
    Given the user is on the login page
    When the user enters the sales manager information
    Then the user should be able to login

  @store_manager @smoke @wip
  Scenario: Login as a store manager
    Given the user is on the login page
    When the user enters the store manager information
    Then the user should be able to login


