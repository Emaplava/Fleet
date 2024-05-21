package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US004_Page extends BasePage {
    public US004_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "(//span[contains(text(), '  Fleet')])[1]")

    public WebElement Fleet;

    @FindBy(xpath = "(//span[contains(text(), 'Vehicle')])[4]")

    public WebElement VehicleContracts;
    @FindBy(xpath ="//title[.='All - Vehicle Contract - Entities - System - Car - Entities - System']")

    public WebElement titleVerification;
    @FindBy(xpath= "//div[.='You do not have permission to perform this action.']" )
    public WebElement messageDisplayed;
    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[1]/a/span")
    public WebElement FleetDriver;
@FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[1]/div/div/ul/li[6]/a/span")
    public WebElement driverVehicleContract;
}