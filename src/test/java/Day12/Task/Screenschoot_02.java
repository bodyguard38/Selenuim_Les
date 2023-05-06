package Day12.Task;

import Utilities.Base;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class Screenschoot_02 extends Base {
    /*
    Go to amazon.com.
    Take Page ScreenShot.
    Spesific WebElement ScreenShot
    */
    @Test
    public void test01() throws IOException {

        driver.get("https://www.amazon.com/");

        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source, new File(".\\test-output\\photo1.png"));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String date = new SimpleDateFormat("yyyy-MM-dd- hh-mm-ss").format(new Date());

        WebElement logo = driver.findElement(By.id("nav-logo-sprites"));
        File element = logo.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(element, new File(".\\test-output\\"+date+".png"));

    }
}
