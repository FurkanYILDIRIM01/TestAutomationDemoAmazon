package testRunners;

import Util.DriverFactory;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;


@CucumberOptions(
        features = {"src/test/java/Features"},
        glue = {"StepDefinitions.AmazonStepDefinitions","Util"},
        tags = "",
        plugin = {
                "summary","pretty","html:Reports/CucumberReports.html"
        }
)

public class TestRunner extends AbstractTestNGCucumberTests {
    static WebDriver driver = DriverFactory.getDriver();

}
