package com.fleet.step_definitions;
import com.fleet.pages.LoginPage;
import com.fleet.pages.Us001;
import com.fleet.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import java.util.List;

public class Verify_Store_SalesManagers_Login__StepDefs {


    Us001 us001 = new Us001();


    @Then("User sees eightmoduleNames")
    public void user_sees_eightmodule_names(List<String> expectedTitle) {
        /* System.out.println("expectedTitle = " + expectedTitle);
        */
        BrowserUtils.sleep(1);
        List<String> actualTitle = BrowserUtils.getElementsText(us001.menuOptions);
        /*System.out.println("actualTitle = " + actualTitle);
         */
        Assert.assertEquals(expectedTitle, actualTitle);

    }

}

