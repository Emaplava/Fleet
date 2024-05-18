package com.fleet.step_definitions;

import com.fleet.pages.US002;
import com.fleet.utilities.BrowserUtils;
import io.cucumber.java.en.Then;

public class OroincDocumentationPage {
    US002 us002 = new US002();

    @Then("user clicks on the question mark icon.")
    public void user_clicks_on_the_question_mark_icon() {
        us002.questionMarkIcon.click();

    }
    @Then("user switch to the new window")
    public void user_switch_to_the_new_window() {
        BrowserUtils.sleep(3);
        BrowserUtils.switchToWindow("Welcome to Oro Documentation");
        BrowserUtils.sleep(2);

    }
    @Then("user verifies the URL")
    public void user_verifies_the_url() {
        BrowserUtils.verifyURLContains("https://doc.oroinc.com/");


    }

}
