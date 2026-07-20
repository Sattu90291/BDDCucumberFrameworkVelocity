package com.velocityEcom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EcomProductPage
{
    @FindBy(xpath = "//a[text()='Products']")
    private WebElement productButton;

    @FindBy(xpath = "//button[text()=' Add Product']")
    private WebElement addProductButton;

    @FindBy(xpath = "(//input[@class='form-control'])[1]")
    private WebElement nameField;

    @FindBy(xpath = "//select[@class='form-control']")
    private WebElement categoryDropdown;

    @FindBy(xpath = "//textarea[@class='form-control']")
    private WebElement descriptionField;

    @FindBy(xpath = "(//input[@class='form-control'])[2]")
    private WebElement priceField;

    @FindBy(xpath = "(//input[@class='form-control'])[3]")
    private WebElement stockField;

    @FindBy(xpath = "//input[@placeholder='Paste image URL or upload below']")
    private WebElement productImageField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement createButton;

    //constructor
    public EcomProductPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    //methods
    public void clickOnproductButton()
    {
        productButton.click();
        System.out.println("clicking on Product button");
    }
    public void clickOnAddProductButton()
    {
        addProductButton.click();
        System.out.println("clicking on Add product button");
    }
    public void sendKeysInNameField()
    {
        nameField.sendKeys("Puma scandal");
        System.out.println("Entering name field");
    }
    public void selectCategory()
    {
        Select select=new Select(categoryDropdown);
        select.selectByVisibleText("Footwear");

    }
    public void enterDescription()
    {
        descriptionField.sendKeys("Puma light weight scandal");
        System.out.println("Entering description");
    }
    public void enterPrice()
    {
        priceField.sendKeys("1299");
        System.out.println("Entering price");
    }
    public void enterStockField()
    {
        stockField.sendKeys("12");
        System.out.println("Entering stock field");
    }
    public void enterProductImage()
    {
        productImageField.sendKeys("https://rukminim1.flixcart.com/image/80/80/xif0q/s…e-watermarked-original-imahejws3yrpbjmm.jpeg?q=20");
        System.out.println("Entering product image");
    }
    public void clickOnCreateButton()
    {
        createButton.click();
        System.out.println("clicking on create button");
    }
}
