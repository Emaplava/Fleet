package com.fleet.step_definitions;

import com.fleet.pages.LoginPage;
import com.fleet.pages.RepetitiveCalendarEvents;
import com.fleet.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;


public class US008_RepetitiveCalendarEvents_StepDefs {

    LoginPage loginPage = new LoginPage();
    RepetitiveCalendarEvents repetitiveCalendarEvents = new RepetitiveCalendarEvents();

    @Then("user hover over the Activities dropdown")
    public void user_hover_over_the_activities_dropdown() {

        BrowserUtils.sleep(3);
        BrowserUtils.hover(repetitiveCalendarEvents.activitiesDropdown);
        BrowserUtils.sleep(3);

    }
    @Then("user clicks on Calendar Events")
    public void user_clicks_on_calendar_events() {
       repetitiveCalendarEvents.calendarEvents.click();
        BrowserUtils.sleep(3);
       
    }
    @Then("user clicks on Create Calendar Event")
    public void user_clicks_on_create_calendar_event() {
        repetitiveCalendarEvents.createCalendarEventBtn.click();
        BrowserUtils.sleep(3);

    }

    @Then("user select repeat checkbox")
    public void user_select_repeat_checkbox() {
        repetitiveCalendarEvents.repeatCheckbox.click();
        BrowserUtils.sleep(2);
       
    }
    @Then("user verifies that they see the number {int} in the box by default in the repeat in every input")
    public void user_verifies_that_they_see_the_number_in_the_box_by_default_in_the_repeat_in_every_input(Integer int1) {
        WebElement inputBox = repetitiveCalendarEvents.repeatEveryBox;

        BrowserUtils.verifyElementDisplayed(inputBox);
        String expectedDefaultValue = "1";
        String actualDefaultValue = inputBox.getAttribute("value");
        if (actualDefaultValue.equals(expectedDefaultValue)){
            System.out.println("Default value equals to 1! " + actualDefaultValue);
        }

        Assert.assertEquals(expectedDefaultValue,actualDefaultValue);
    }

    @Then("user clear the box by deleting the number")
    public void user_clear_the_box_by_deleting_the_number() {
        repetitiveCalendarEvents.repeatEveryBox.clear();
        BrowserUtils.sleep(3);
    }

    @Then("user verifies the error message \"This value should not be blank.”.")
    public void user_verifies_the_error_message_this_value_should_not_be_blank() {

        String expectedErrorMessage = "This value should not be blank.";
        String actualErrorMessage =  repetitiveCalendarEvents.repeatEveryErrorMessage.getText();
        BrowserUtils.sleep(3);

        Assert.assertEquals(actualErrorMessage,expectedErrorMessage);

        System.out.println("expectedErrorMessage = " + expectedErrorMessage);
        System.out.println("actualErrorMessage = " + actualErrorMessage);

    }


}

