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
    public void childWindow(){

        driver.get("https://demoqa.com/browser-windows");

        driver.findElement(By.id("windowButton")).click();
        String mainWindowHandle = driver.getWindowHandle();

        Set<String> allWindowsHandels = driver.getWindowHandles();
        Iterator<String> it = allWindowsHandels.iterator();

        while(it.hasNext()){

            String ChildWindow = it.next();

            if(!mainWindowHandle.equals(ChildWindow)){

                driver.switchTo().window(ChildWindow);
                WebElement text = driver.findElement(By.id("sampleHeading"));
                System.out.println("Heading of child window is "+ text.getText());
            }
        }

    }

    @Test
    public void multipleChildWindows() {

        driver.get("https://demoqa.com/browser-windows");


        driver.findElement(By.id("windowButton")).click();
        driver.findElement(By.id("messageWindowButton")).click();
        String mainWindow = driver.getWindowHandle();
        System.out.println(mainWindow);

    }
}
