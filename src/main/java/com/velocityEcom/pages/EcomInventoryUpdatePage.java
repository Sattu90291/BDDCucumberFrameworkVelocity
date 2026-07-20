package com.velocityEcom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EcomInventoryUpdatePage {

    @FindBy(xpath="//a[text()='Inventory Update']")
    private WebElement inventoryUpdateButton;

    @FindBy(xpath = "(//div[@class='stat-value'])[1]")
    private WebElement totalEntries;

    @FindBy(xpath = "(//div[@class='stat-value'])[2]")
    private WebElement open_partial;

    @FindBy(xpath="(//div[@class='stat-value'])[3]")
    private WebElement fullyRecieved;

    //Constructor
    public EcomInventoryUpdatePage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    //methods
    public void clickOnInventoryUpdateButton()
    {
        inventoryUpdateButton.click();
        System.out.println("clicking on inventoryUpdate button");
    }
    public String getTotalEntries()
    {
        System.out.println("getting total entries");
        return totalEntries.getText();
    }
    public String getOpenPartialOrders()
    {
        System.out.println("getting open partial orders");
        return open_partial.getText();
    }
    public String getFullyReceived()
    {
        System.out.println("getting Fully received orders");
        return fullyRecieved.getText();
    }
}
