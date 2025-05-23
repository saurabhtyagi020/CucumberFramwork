package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "Feature",
glue = "stepdefination"
       , tags = " @appointment",
        plugin = {"pretty","html:target/Cucumber/report.html"}
)
public class TestRunner extends AbstractTestNGCucumberTests {

}
