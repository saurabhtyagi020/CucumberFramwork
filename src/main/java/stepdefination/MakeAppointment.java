package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.jspecify.annotations.Nullable;
import org.testng.Assert;
import page.MakeAppointmentPage;
import utils.PropertiesReader;

import static stepdefination.HooksShared.driver;

public class MakeAppointment {


    @Given("I am on the Katalon home page")
    public void i_am_on_the_katalon_home_page() {
        System.out.println("Navigated to Katalon home page");
        // Add Selenium code here if needed:
        // driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.get(PropertiesReader.readKey("url"));


    }

    @When("I am click on Make Appointment button")
    public void i_am_click_on_make_appointment_button() {
        System.out.println("Clicked on Make Appointment button");
        MakeAppointmentPage mk = new MakeAppointmentPage();
        mk.clickOnMakeAppointmentbutton();
    }

    @Then("User should land on login page")
    public void user_should_land_on_login_page() {
        System.out.println("Landed on Login page");
         String Actualcurl = driver.getCurrentUrl();
        System.out.println(Actualcurl);

        Assert.assertEquals(PropertiesReader.readKey("curl"),Actualcurl,"It not a login page");




    }

}
