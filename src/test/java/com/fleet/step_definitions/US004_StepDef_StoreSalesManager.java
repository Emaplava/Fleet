package com.fleet.step_definitions;

import com.fleet.pages.LoginPage;
import com.fleet.pages.US004_Page;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US004_StepDef_StoreSalesManager {
    US004_Page us004Page = new US004_Page();
    LoginPage loginPage = new LoginPage();
    @When("the user goes to the log in page")
    public void theUserGoesToTheLogInPage()
    {
        Driver.getDriver().get("https://qa.xfleetsolutions.com/user/login");
    }



    @When("the user navigates to {string} to {string}")
    public void the_user_navigates_to_to(String string, String string2) throws InterruptedException {

        BrowserUtils.hover(us004Page.Fleet);
        Thread.sleep(3000);
        us004Page.VehicleContracts.click();


    }
    @Then("the user should be able to see url as {string}")
    public void the_user_should_be_able_to_see_url_as(String expectedURL) {

      BrowserUtils.verifyURLContains("https://qa.xfleetsolutions.com/entity/Extend_Entity_VehicleContract");


    }
    @Then("the user should be able to see expected title as {string}")
    public void the_user_should_be_able_to_see_expected_title_as(String string) {
    BrowserUtils.sleep(2);
        BrowserUtils.verifyTitleContains("All - Vehicle Contract - Entities - System - Car - Entities - System");
    }


    }






