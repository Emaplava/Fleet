package com.fleet.step_definitions;
import com.fleet.pages.Us003Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Verify_PinBar_PinIcon_StepDefs {

    Us003Page us003Page = new Us003Page();

    @When("the user clicks to {string}")
    public void the_user_clicks_to(String string) {
       us003Page.howToUseThisSpace.click();
    }
    @Then("the user should see {string} and {string}")
    public void the_user_should_see_and(String expectedPinBar, String expectedIcon) {
        String actualPinBar = us003Page.howToUsePinBar.getText();
        Assert.assertEquals(expectedPinBar,actualPinBar);

        String actualPinIcon = us003Page.howToUsePinIcon.getText();
        Assert.assertEquals(expectedIcon,actualPinIcon);


    }
}
