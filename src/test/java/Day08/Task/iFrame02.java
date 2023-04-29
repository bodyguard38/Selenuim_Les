package Day08.Task;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class iFrame02 extends Base {
            /*
            Go to URL: http://demo.guru99.com/test/guru99home/
        Find the number of iframes on the page.
        Link to the fourth iframe (JMeter Made Easy) (https://www.guru99.com/live selenium project.html) click here.
        Exit the iframe and return to the main page.
             */

    @Test
    public void test(){
        driver.get("http://demo.guru99.com/test/guru99home/");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-popup-blocking");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        int iframe = driver.findElements(By.tagName("iframe")).size();
        System.out.println(iframe);

        driver.switchTo().frame("//iframe[@id=\"a077aa5e\"]");
        driver.findElement(By.xpath("/html/body/a")).click();

        driver.switchTo().defaultContent();
    }
}
