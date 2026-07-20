package study.stepDefinations;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.*;
import org.testng.Reporter;

public class VelocityEcomLogin {
    @Given("User is on ecom login page")
    public void user_is_on_ecom_login_page() {
        Reporter.log("User is landed on ecom login page ", true);
    }

    @When("user clicks on admin button")
    public void user_clicks_on_admin_button() {
        Reporter.log("User clicks on admin", true);
    }

    @When("User enters username as {string}")
    public void user_enters_username_as(String username) {
        Reporter.log("User enters username as" + username, true);
    }

    @When("user enters password as {string}")
    public void user_enters_password_as(String password) {
        Reporter.log("user enters password as" + password, true);
    }

    @When("User clicks on Access Dashboard button")
    public void user_clicks_on_access_dashboard_button() {
        Reporter.log("User clicks on Access Dashboard button", true);
    }

    @Then("user navigates to dashboard page")
    public void user_navigates_to_dashboard_page() {
        Reporter.log("user navigates to dashboard page", true);
    }

    @When("user clicks on customer button")
    public void userClicksOnCustomerButton() {
        Reporter.log("user clicks on customer button", true);
    }

    @Then("user navigates to homepage")
    public void userNavigatesToHomepage() {
        Reporter.log("user navigates to homepage",true);
    }
}
