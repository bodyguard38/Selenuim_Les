package Practice01;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class PositiveLoginRep extends Base {
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
    public void name() {

        driver.get("https://practicetestautomation.com/practice-test-login/");
        WebElement userName=driver.findElement(By.id("username"));
        userName.sendKeys("student");

        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys("Password123");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement submitButton=driver.findElement(By.id("submit"));
        submitButton.click();
        System.out.println(driver.getCurrentUrl());

        Assert.assertTrue(driver.getCurrentUrl().contains("practicetestautomation.com/logged-in-successfully/"));

        String text = driver.findElement(By.xpath("//p[contains(.,'logged in')]")).getText();

        Assert.assertEquals("The text is not same",text,"Congratulations student. You successfully logged in!");

        WebElement logoutButton=driver.findElement(By.xpath("(//a[contains(.,Log)])[8]"));
        Assert.assertTrue(logoutButton.isDisplayed());
    }
}
