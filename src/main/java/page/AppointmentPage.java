package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static stepdefination.HooksShared.driver;


public class AppointmentPage
{

    private By makeApp = By.id("btn-make-appointment");


   private By username = By.id("txt-username");
   private By password = By.id("txt-password");
   private By loginbtn = By.id("btn-login");


    public void clickOnMakeAppointmentbutton()
    {
        driver.findElement(makeApp).click();
    }

   public void kuraLoginwithvalidcred(String user,String pwd)
   {
       driver.findElement(username).sendKeys(user);
       driver.findElement(password).sendKeys(pwd);
       driver.findElement(loginbtn).click();
   }

}
