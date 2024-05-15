package com.fleet.step_definitions;
import com.fleet.pages.Us003Page;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Verify_UsePinBar_Image_StepDefs {

    Us003Page us003Page = new Us003Page();
    @Then("users see an image on the page.")
    public void users_see_an_image_on_the_page() {

        String actualPinBarImage = us003Page.pinBarImage.getAttribute("src");
        String expectPinBarImage = "/bundles/oronavigation/images/pinbar-location.jpg";

        Assert.assertTrue(actualPinBarImage.contains(expectPinBarImage));

    }
}
