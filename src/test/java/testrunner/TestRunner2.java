package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "Feature",
glue = "stepdefination"
       , tags = "@login"
)
public class TestRunner2 extends AbstractTestNGCucumberTests {

}
