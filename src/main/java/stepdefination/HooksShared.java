package stepdefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import utils.PropertiesReader;

public class HooksShared {

    public static WebDriver driver;
    @Before
    public void openBroser()
    {
        driver = new EdgeDriver();
        driver.manage().window().maximize();

    }

    @After
    public void closeBrowser()
    {
        driver.quit();
    }

    public static WebDriver getDriver()
    {
        return driver;
    }
}
