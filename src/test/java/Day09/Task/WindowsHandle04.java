package Day09.Task;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class WindowsHandle04 extends Base {
    /*
    Go to URL: https://demoqa.com/browser-windows
    Click on the windows - "WindowButton"
    Click on all the child windows.
    Print the text present on all the child windows in the console.
    Print the heading of the parent window in the console.
     */
    @Test
    public void test(){
        driver.get("https://demoqa.com/browser-windows");
        String MainPageId = driver.getWindowHandle();


        driver.findElement(By.id("windowButton")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.id("tabButton")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("messageWindowButton")).click();

        Set<String> handleList=  driver.getWindowHandles();
        Iterator<String> it= handleList.iterator();

        while(it.hasNext()){
           driver.switchTo().window(String.valueOf(it.hasNext()));

        }


        System.out.println(driver.switchTo().window(MainPageId).getTitle());

    }
}
