package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleCostsPage {
    public VehicleCostsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText ="Fleet")
    public WebElement FleetButton;

    @FindBy(xpath = "//span[.='Vehicle Costs']")
    public WebElement vehicleCosts;


    @FindBy(xpath = "//span[.='Type'][1]")
    public WebElement typeCheckBox;

    @FindBy(xpath = "//span[.='Total Price'][1]")
    public WebElement totalPrice;

    @FindBy(xpath = "//span[.='Date'][1]")
    public WebElement date;

    @FindBy(xpath = "//div[@class='btn-group dropdown']/button/input")
    public WebElement firstButton;




}
