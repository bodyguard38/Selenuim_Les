package Practice01;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PositiveLoginTest extends Base {

    /*
           Test Case1: Positive Login Test
        *  Open page https://practicetestautomation.com/practice-test-login/
        *  Type username student into Username field
        *  Type password Password123 into Password field
        *  Puch Submit button.
        *  Verify new page URL contains practicetestautomation.com/logged-in-successfully/
        *  Verify new page contains expected text ('Congratulations' or 'successfully logged in')
        *  Verify button Log out is displayed on the new page.
    */

    @Test
    public void test01() {

        driver.get("https://practicetestautomation.com/practice-test-login/");
        /*  Location Username field  */
        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        username.sendKeys("student");       // Type username 'student' into Username field
        /*  Location password field  */
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("Password123");   // Type password 'Password123' into Password field
        /*  Location 'submit' button  */
        WebElement submit = driver.findElement(By.xpath("//button[@class='btn']"));
        submit.click();                                 // Puch Submit button.
        /* Verification new page URL contains practicetestautomation.com/logged-in-successfully/  */
        String actualURL = driver.getCurrentUrl();
        System.out.println("actualURL = " + actualURL);
        String ExpectedURL = "https://practicetestautomation.com/logged-in-successfully/";
        Assert.assertEquals(ExpectedURL, actualURL);

        /* Verify new page contains expected text ('Congratulations' or 'successfully logged in')   */
        WebElement logged = driver.findElement(By.xpath("//h1[@class='post-title']"));
        Assert.assertTrue(logged.getText().contains("Logged In Successfully"));
        System.out.println("logged = " + logged.getText().toString());
        /*  Verify button Log out is displayed on the new page. */
        WebElement logout = driver.findElement(By.xpath("//a[@style='color:#ffffff']"));
        Assert.assertTrue(logout.isDisplayed());
    }

}
