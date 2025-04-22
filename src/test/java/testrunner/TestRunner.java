package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "Feature",
glue = "stepdefination")
public class TestRunner extends AbstractTestNGCucumberTests {

}
