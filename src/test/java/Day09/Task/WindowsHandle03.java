package Day09.Task;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

import java.util.Iterator;
import java.util.Set;

public class WindowsHandle03 extends Base {
    /*
    Go to URL: https://testproject.io/
    Selenium’s 4 newWindow() method to open a new Window for TestProject’s Blog page.
    https://blog.testproject.io/

     */
    @Test
    public void newWindow(){
        driver.get("https://testproject.io/");

        driver.switchTo().newWindow(WindowType.WINDOW);

        driver.get("https://blog.testproject.io/");
    }

    @Test
    public void newTab() {

        driver.get("https://testproject.io/");
        WebDriver newTab = driver.switchTo().newWindow(WindowType.TAB);

        newTab.get("https://www.amazon.com/");
        System.out.println(driver.getTitle());
    }

    @Test
    public void windowHandle() {

        driver.get("https://www.amazon.com/");
        String homePageHandle = driver.getWindowHandle();

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.amazon.com.tr/");

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.google.com");

        Set<String> handles = driver.getWindowHandles();
        Iterator<String> it = handles.iterator();


        while (it.hasNext()){
            String currentTab = it.next();
            driver.switchTo().window(currentTab);
            System.out.println(driver.getTitle());
        }

        if(!driver.getWindowHandle().equals(homePageHandle)){

            driver.close();
        }
    }
}
