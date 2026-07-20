package com.velocityEcom.pages;

import com.velocityEcom.driverfactory.DriverFactory;
import com.velocityEcom.utils.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EcomDashBoardPage {

   // variable-->WebElements
    @FindBy (xpath = "(//div[@class='stat-value'])[1]") private WebElement totalProducts;
    @FindBy(xpath = "(//div[@class='stat-value'])[2]")  private WebElement totalOrders;
    @FindBy (xpath = "(//div[@class='stat-value'])[3]") private WebElement lowStockItems;
    @FindBy (xpath = "(//div[@class='stat-value'])[4]") private WebElement pendingOrders;
    @FindBy (xpath = "(//div[@class='stat-value'])[5]") private WebElement backOrders;
    @FindBy (xpath = "//button[@title='Dismiss']")  WebElement closePopup;

    //constructor
    public EcomDashBoardPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

   //methods

    public void handlePopup()
    {
        boolean result = closePopup.isDisplayed();
        if(result)
        {
            closePopup.click();
            System.out.println("Popup handled correctly");
        }
        else {
            System.out.println("No popup , proceeding ahead");
        }
    }

    public String getTotalProducts() throws InterruptedException {

        Utility.scrollIntoView(DriverFactory.getDriver(),totalProducts);
        System.out.println("getting totalProducts");
        return  totalProducts.getText();

    }

    public String getTotalOrders()
    {
     //   Utility.scrollIntoView(DriverFactory.getDriver(),totalOrders);
        System.out.println("getting totalOrders");
        return  totalOrders.getText();

    }
    public String getLowStockItems()
    {
        System.out.println("getting lowStockItems");
        return  lowStockItems.getText();
    }
    public String getPendingOrders()
    {
        System.out.println("getting pendingOrders");
        return pendingOrders.getText();
    }
    public String getBackOrders()
    {
        System.out.println("getting backOrders");
        return  backOrders.getText();
    }
}
