package com.fleet.step_definitions;

import com.fleet.pages.US004_Page;
import com.fleet.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

public class US_004_Driver {
    US004_Page us004Page = new US004_Page();
    @And("the driver user navigates to {string} to {string}")
    public void theDriverUserNavigatesToTo(String arg0, String arg1) throws InterruptedException {
    BrowserUtils.sleep(3);
        BrowserUtils.hover(us004Page.FleetDriver);
   BrowserUtils.sleep(3);
    us004Page.driverVehicleContract.click();
    }

    @Then("the user should be able to see message as {string}")
    public void the_user_should_be_able_to_see_message_as(String expected ) {

        String actualMessage = us004Page.messageDisplayed.getText();
        Assert.assertEquals(expected, actualMessage);
    }


}
