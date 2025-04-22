package page;

import org.openqa.selenium.By;

import static stepdefination.HooksShared.driver;

public class MakeAppointmentPage {

    private By makeApp = By.id("btn-make-appointment");

    public void clickOnMakeAppointmentbutton()
    {
        driver.findElement(makeApp).click();
    }
}
