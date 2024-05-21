package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class US06 {
    public US06() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath ="(//span[contains(text(), '  Fleet')])[1]" )
    public WebElement FleetDropdown;


    @FindBy (xpath ="(//span[contains(text(), 'Vehicles')])[1]")
    public WebElement Vehicle;

    @FindBy (xpath = "(//a[@class='dropdown-toggle'])[4]")
    public WebElement threeDotIcon;

@FindBy (xpath ="(//i[@class='fa-trash-o hide-text'])[1]")
public WebElement Delete;

@FindBy (xpath ="(//i[@class='fa-pencil-square-o hide-text'])[1]")
public WebElement Edit;

@FindBy (xpath ="(//i[@class='fa-eye hide-text'])[1]")
public WebElement View;
}
