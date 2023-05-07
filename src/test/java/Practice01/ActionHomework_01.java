package Practice01;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionHomework_01 extends Base {
    /*
     Go to URL: http://demo.guru99.com/test/drag_drop.html
     Drag and drop the BANK button to the Account section in DEBIT SIDE
     Drag and drop the SALES button to the Account section in CREDIT SIDE
     Drag and drop the 5000 button to the Amount section in DEBIT SIDE
     Drag and drop the second 5000 button to the Amount section in CREDIT SIDE
     Verify the visibility of Perfect text.
   */
    @Test
    public void name() {

        driver.get("http://demo.guru99.com/test/drag_drop.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement iframe = driver.findElement(By.xpath("(//iframe)[4]"));
        driver.switchTo().frame(iframe);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement element = driver.findElement(By.xpath("//span[text()='Alles accepteren']"));
        element.click();

       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       WebElement bank = driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
       WebElement sales = driver.findElement(By.xpath("//a[text()=' SALES ']"));
       WebElement num5000 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
       WebElement num5000sec = driver.findElement(By.xpath("//a[text()=' 5000']"));
       WebElement bankaccount = driver.findElement(By.xpath("(//h3[@align=\"center\"])[2]"));
       WebElement bankamount = driver.findElement(By.xpath("(//h3[@align=\"center\"])[3]"));
       WebElement creditAccount = driver.findElement(By.xpath("(//h3[@align=\"center\"])[5]"));
       WebElement creditAmount = driver.findElement(By.xpath("(//h3[@align=\"center\"])[6]"));

       Actions action = new Actions(driver);

       actions.dragAndDrop(bank,bankaccount).perform();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       actions.dragAndDrop(sales,creditAccount).perform();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       actions.dragAndDrop(num5000,bankamount).perform();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       actions.dragAndDrop(num5000sec,creditAmount).perform();

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        WebElement perfectText = driver.findElement(By.xpath("//a[.='Perfect!']"));
        Assert.assertTrue(perfectText.isDisplayed());



    }
}
