package com.fleet.step_definitions;

import com.fleet.pages.VehicleCostsPage;
import com.fleet.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MyStepdefs  {


    VehicleCostsPage vehicleCostsPage = new VehicleCostsPage();
    @Given("users should hover over on fleet to be able to see vehicle costs")
    public void users_should_hover_over_on_fleet_to_be_able_to_see_vehicle_costs() {

        BrowserUtils.hover (vehicleCostsPage.FleetButton);
    }
    @Given("users should click on vehicle costs")
    public void users_should_click_on_vehicle_costs() {
        vehicleCostsPage.vehicleCosts.click ();

    }
    @Then("users should see {int} columns on the vehicle costs")
    public void users_should_see_columns_on_the_vehicle_costs(Integer int1) {

        BrowserUtils.verifyElementDisplayed (vehicleCostsPage.typeCheckBox);
        BrowserUtils.verifyElementDisplayed (vehicleCostsPage.totalPrice);
        BrowserUtils.verifyElementDisplayed (vehicleCostsPage.date);
    }

    @Then("user should click on first check box button")
    public void userShouldClickOnFirstCheckBoxButton() {
        vehicleCostsPage.firstButton.click ();
    }
}