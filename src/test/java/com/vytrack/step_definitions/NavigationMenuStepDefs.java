package com.vytrack.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationMenuStepDefs {

    @When("the user navigates to fleet, vehicles")
    public void the_user_navigate_to_fleet_vehicles() {
        // Write code here that turns the phrase above into concrete actions
        //selenium code
        System.out.println("the user navigate to fleet, vehicles ");
    }

    @Then("the title should be Vehicles")
    public void title_should_be_Vehicle() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Expected and Actual title are matching");
    }

    @Then("title should be Campaigns")
    public void title_should_be_Campaigns() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the user navigates to marketing, Campaign");
    }

    @Then("title should be Calendars")
    public void title_should_be_Calendars() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Expected and Actual title are matching");
    }

    @When("the user navigates to Marketing, Campaigns")
    public void the_user_navigate_to_Marketing_Campaigns() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the user navigates to marketing, Campaign");
    }

    @When("the user navigates to Activities, Calendar Events")
    public void the_user_navigate_to_Activities_Calendar_Events() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the user navigates to Activities, Calendar Events");
    }


}
