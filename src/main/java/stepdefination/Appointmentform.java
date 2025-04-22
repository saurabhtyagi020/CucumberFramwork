package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import page.AppointmentPage;
import utils.PropertiesReader;

import static stepdefination.HooksShared.driver;


public class Appointmentform {



    @Given("I am the login page of katalon")
    public void iAmTheLoginPageOfKatalon() {

        driver.get(PropertiesReader.readKey("lurl"));

    }

    @When("I enter the correct username and password")
    public void iEnterTheCorrectUsernameAndPassword() {
        AppointmentPage ap = new AppointmentPage();
        ap.kuraLoginwithvalidcred(PropertiesReader.readKey("username"),PropertiesReader.readKey("password"));

    }

    @And("I click on Login button")
    public void iClickOnLoginButton() {
        System.out.println("Click successfully!");
    }

    @Then("User should be land on Make Appointment page")
    public void userShouldBeLandOnMakeAppointmentPage() {
        String currentUrl=driver.getCurrentUrl();
        Assert.assertEquals(currentUrl,PropertiesReader.readKey("appointment"));
    }
}
