
  Feature: Login as different users
      #homework   // I will only have one stepdefs.and it will handle there different user types
      Scenario: login as a driver user
          Given the user logged in as "driver"
          Then the user should be able to login
          And the title contains "Dashboard"
      #driver ,storemanager, salesmanager
      #you will have one step definition and it will handle different usertypes


    Scenario: login as a driver user
        Given the user is on the login page
        When the user logs in using "user10" and "UserUser123"
        Then the user should be able to login
        And the title contains "Dashboard"

