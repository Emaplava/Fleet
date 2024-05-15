package com.fleet.step_definitions;

import com.fleet.pages.LoginPage;
import com.fleet.pages.Us001;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.ConfigurationReader;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class Verify_Driver_Login_StepDefs {

    Us001 us001 = new Us001();

    @Given("User is on Xfleet Login Page")
    public void user_is_on_xfleet_login_page() {
        Driver.getDriver().get("https://app.xfleetsolutions.com/user/login");

    }

    @Then("User sees moduleNames")
    public void user_sees_module_names(List<String> expectedTitle) {

        BrowserUtils.sleep(1);

        List <String> actualTitle = BrowserUtils.getElementsText(us001.menuOptions);
        Assert.assertEquals(expectedTitle,actualTitle);

    }

}
