package com.fleet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Us003Page extends BasePage{

    @FindBy(xpath = "//a[.='Learn how to use this space']")
    public WebElement howToUseThisSpace;

    @FindBy(xpath = "//h3[.='How To Use Pinbar']")
    public WebElement howToUsePinBar;

    @FindBy(xpath = "//div[@class='clearfix']/p[1]")
    public WebElement howToUsePinIcon;

    @FindBy(xpath = "//img[@src='/bundles/oronavigation/images/pinbar-location.jpg']")
    public WebElement pinBarImage;


}
