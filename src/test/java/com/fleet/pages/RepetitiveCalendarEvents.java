package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RepetitiveCalendarEvents {

    public RepetitiveCalendarEvents() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //Launched Page
//    @FindBy(xpath = "(//span[@class='title title-level-1'])[3]")
    @FindBy(xpath = "(//span[contains(text(), 'Activities')])[1]")
    public WebElement activitiesDropdown;


  //  @FindBy(xpath = "(//span[@class='title title-level-2'])[9]")
    @FindBy(xpath = "//span[contains(text(), 'Calendar Events')]")
    public WebElement calendarEvents;


    @FindBy(xpath = "//a[@title='Create Calendar event']")
    public WebElement createCalendarEventBtn;


    @FindBy(xpath = "(//input[@type='checkbox'])[2]")
    public WebElement repeatCheckbox;


    @FindBy(xpath = "(//input[@class='recurrence-subview-control__number'])[1]")
    public WebElement repeatEveryBox;


    @FindBy(xpath = "//span[text()='This value should not be blank.']")
    public WebElement repeatEveryErrorMessage;


}
