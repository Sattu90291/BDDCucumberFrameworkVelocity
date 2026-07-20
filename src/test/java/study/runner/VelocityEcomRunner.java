package study.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features={"src/test/resources/features/VelocityEcomLogin.feature"},
        glue = {"study/stepDefinations", "study/hooks"},
        publish = true,
        plugin={"pretty"}
       // tags="@regression"
       // dryRun = true
)

public class VelocityEcomRunner extends AbstractTestNGCucumberTests {

}
