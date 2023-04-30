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

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement expected = driver.findElement(By.xpath("//*[text()='Opening a new window']"));
        Assert.assertEquals(expected.getText(),"Opening a new window");
        Assert.assertEquals(driver.getTitle(),"The Internet");
        String mainPageId = driver.getWindowHandle();

        driver.findElement(By.xpath("//*[text()='Click Here']")).click();

        Set<String> handlesList = driver.getWindowHandles();//sayfalarin handles degerleri alindi

        Iterator<String> it = handlesList.iterator();

        while (it.hasNext()){
            String currentHandle = it.next();

            driver.switchTo().window(currentHandle);
            if(driver.getTitle().equals("New Window")){
                Assert.assertEquals("New Window", driver.getTitle());
                break;
            }
        }

        Assert.assertEquals("The Internet",driver.switchTo().window(mainPageId).getTitle());

    }
}
