package com.fleet.step_definitions;
import com.fleet.pages.Us001;
import com.fleet.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import java.util.List;

public class Verify_Store_SalesManagers_Login_StepDefs {


    Us001 us001 = new Us001();


    @Then("User sees eightmoduleNames")
    public void user_sees_eightmodule_names(List<String> expectedTitle) {

        BrowserUtils.sleep(1);
        List<String> actualTitle = BrowserUtils.getElementsText(us001.menuOptions);

        BrowserUtils.sleep(1);
        Assert.assertEquals(expectedTitle, actualTitle);

    }

}

