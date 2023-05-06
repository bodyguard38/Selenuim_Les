package Day09.Task;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class WindowsHandle02 extends Base {
    /*
    Go to URL: https://the-internet.herokuapp.com/windows
    Verify the text: “Opening a new window”
    Verify the title of the page is “The Internet”
    Click on the “Click Here” button
    Verify the new window title is “New Window”
    Go back to the previous window and then verify the title: “The Internet”
     */

    @Test
    public void test(){

        driver.get("https://the-internet.herokuapp.com/windows");
        String window1Handle = driver.getWindowHandle();

        WebElement window1Text = driver.findElement(By.xpath("//h3[text()='Opening a new window']"));
        Assert.assertEquals("Opening a new window", window1Text.getText());

        Assert.assertEquals("The Internet", driver.getTitle());

        driver.findElement(By.xpath("(//a[@target=\"_blank\"])[1]")).click();


        Set<String> AllWindowsHandels = driver.getWindowHandles();
        System.out.println(AllWindowsHandels);

        for (String eachHandle:AllWindowsHandels) {
            if(!eachHandle.equals(window1Handle))  {
                driver.switchTo().window(eachHandle);
                break;
            }
        }

        String window2Handle = driver.getWindowHandle();
        String window2Title = driver.getTitle();
        Assert.assertEquals("New Window", window2Title);

        driver.switchTo().window(window1Handle);
        Assert.assertEquals("The Internet", driver.getTitle());

        driver.switchTo().window(window2Handle);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.switchTo().window(window1Handle);
    }
}
