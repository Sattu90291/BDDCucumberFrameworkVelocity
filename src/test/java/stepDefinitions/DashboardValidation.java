package stepDefinitions;

import com.velocityEcom.driverfactory.DriverFactory;
import com.velocityEcom.pages.EcomDashBoardPage;
import com.velocityEcom.pages.EcomInventoryUpdatePage;
import com.velocityEcom.pages.EcomLoginPage;
import com.velocityEcom.pages.EcomProductPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class DashboardValidation {

    EcomLoginPage ecomLoginPage=new EcomLoginPage(DriverFactory.getDriver());
    EcomDashBoardPage ecomDashBoardPage=new EcomDashBoardPage(DriverFactory.getDriver());
    EcomInventoryUpdatePage ecomInventoryUpdatePage=new EcomInventoryUpdatePage(DriverFactory.getDriver());
    EcomProductPage ecomProductPage=new EcomProductPage(DriverFactory.getDriver());
    SoftAssert softAssert=new SoftAssert();

    @Given("user clicks on admin button of velocity Ecom Application")
    public void user_clicks_on_admin_button_of_velocity_ecom_application()
    {
     ecomLoginPage.clickOnAdminButton();
    }

    @When("user enters username as {string} on velocity Ecom Application")
    public void user_enters_username_as_on_velocity_ecom_application(String username)
    {
     ecomLoginPage.enterUserName(username);
    }

    @When("user enters password as {string} on velocity Ecom Application")
    public void user_enters_password_as_on_velocity_ecom_application(String password) throws InterruptedException {
     ecomLoginPage.enterPassword(password);
     //   Assert.fail();
    }

    @When("user clicks on AccessDashboard button")
    public void user_clicks_on_access_dashboard_button() throws InterruptedException {
     ecomLoginPage.clickOnAccessDashBoardButton(DriverFactory.getDriver());
    }

    @Then("user navigates to dashboard page and validate details")
    public void user_navigates_to_dashboard_page_and_validate_details() throws InterruptedException {
        Thread.sleep(2000);
        ecomDashBoardPage.handlePopup();
        String actualTotalOrders = ecomDashBoardPage.getTotalOrders();
        String actualTotalProducts = ecomDashBoardPage.getTotalProducts();
        Reporter.log("Total orders are " +actualTotalOrders, true);
        Reporter.log("Total products are " +actualTotalProducts, true);
        softAssert.assertNotNull(actualTotalOrders,"Actual Total order value is null,TC failed");
        softAssert.assertNotNull(actualTotalProducts,"Actual totalProduct value is null, TC failed");
        softAssert.assertAll();
    }

    @Then("user validates total entries, open_partial,fully recieved")
    public void userValidatesTotalEntriesOpen_partialFullyRecieved()
    {
        String actualTotalEntries = ecomInventoryUpdatePage.getTotalEntries();
        String actualOpenPartialOrders = ecomInventoryUpdatePage.getOpenPartialOrders();
        String actualFullyRecieved = ecomInventoryUpdatePage.getFullyReceived();
        Reporter.log("Total entries are "+actualTotalEntries,true);
        Reporter.log("Open partial orders are "+actualOpenPartialOrders,true);
        Reporter.log("Fully received orders are "+actualFullyRecieved,true);
    }

    @And("user clicks on Inventory Update")
    public void userClicksOnInventoryUpdate()
    {
     ecomInventoryUpdatePage.clickOnInventoryUpdateButton();
    }

    @And("user clicks on products")
    public void userClicksOnProducts()
    {
     ecomProductPage.clickOnproductButton();
    }

    @And("user clicks on Add product button")
    public void userClicksOnAddProductButton()
    {
      ecomProductPage.clickOnAddProductButton();
      ecomProductPage.sendKeysInNameField();
      ecomProductPage.selectCategory();
      ecomProductPage.enterDescription();
      ecomProductPage.enterPrice();
      ecomProductPage.enterStockField();
      ecomProductPage.enterProductImage();

    }

    @Then("new product should be added when user clicks on create product button")
    public void newProductShouldBeAddedWhenUserClicksOnCreateProductButton()
    {
      ecomProductPage.clickOnCreateButton();
    }
}
