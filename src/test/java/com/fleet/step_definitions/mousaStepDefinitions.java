
package com.fleet.step_definitions;
import com.fleet.pages.US06;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousaStepDefinitions {
US06 us06 = new US06();
    Actions action = new Actions(Driver.getDriver());

    public WebDriver driver;
    @When("I navigate to the Vehicles page")
    public void i_navigate_to_the_vehicles_page() {
BrowserUtils.sleep(3);
BrowserUtils.hover(us06.FleetDropdown);
us06.Vehicle.click();
BrowserUtils.sleep(3);
    }


    @When("I hover my mouse over the three-dot icon of a car")
    public void i_hover_my_mouse_over_the_three_dot_icon_of_a_car() {

      //  Actions action = new Actions(Driver.getDriver());
        BrowserUtils.hover(us06.threeDotIcon);
        action.moveToElement(us06.threeDotIcon).perform();
        BrowserUtils.sleep(3);


    }

    @Then("I should see the options {string}, {string}, and {string} appear")
    public void i_should_see_the_options_and_appear(String string, String string2, String string3)
    {
        BrowserUtils.sleep(3);
        BrowserUtils.hover(us06.Delete);
        BrowserUtils.hover(us06.Edit);
        BrowserUtils.hover(us06.View);
         action.moveToElement(us06.Delete).perform();
        BrowserUtils.sleep(3);

        action.moveToElement(us06.Edit).perform();
        BrowserUtils.sleep(3);

        action.moveToElement(us06.View).perform();
        BrowserUtils.sleep(3);


        Assert.assertTrue(us06.Delete.isDisplayed());
        Assert.assertTrue(us06.Edit.isDisplayed());
        Assert.assertTrue(us06.View.isDisplayed());


    }


}

