package Day06.Task;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomeWork_1 extends Base {
    /*
    Go to https://the-internet.herokuapp.com/checkboxes
    Locate the elements of checkboxes.
    Then click on checkbox 1 if box is not selected.
    Then click on checkbox 2 if box is not selected.
    Then verify that checkbox 1 is checked.
     */

    @Test
    public void Test() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/checkboxes");

        System.out.println(driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[1]")).getLocation());
        System.out.println(driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[2]")).getLocation());

        WebElement checkbox1 = driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[1]"));
        WebElement checkbox2 = driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[2]"));

        Assert.assertTrue(!checkbox1.isSelected());
        Assert.assertTrue(checkbox2.isSelected());


        Thread.sleep(3000);
        checkbox1.click();
        Assert.assertTrue(checkbox1.isSelected());
    }
}
