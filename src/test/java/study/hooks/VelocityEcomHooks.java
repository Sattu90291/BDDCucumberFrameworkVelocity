package study.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.testng.Reporter;

public class VelocityEcomHooks {

    @Before(order=1)
    public void setUpBrowser()
    {
        Reporter.log("browser set to chrome",true);
    }
    @After(order=1)
    public void tearDown()
    {
        Reporter.log("closing browser",true);
    }
    @Before(order=2)
    public void launchUrl()
    {
        Reporter.log("launch url",true);
    }
    @After(order=2)
    public void logOutApplication()
    {
        Reporter.log("logging out Application ",true);
    }


}
