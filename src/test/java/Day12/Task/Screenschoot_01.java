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

public class Screenschoot_01 extends Base {
    /*
    Go to n11.com.
    Take Full Page Screenshot.
    Take Page ScreenShot.
    Spesific WebElement ScreenShot
     */

    @Test
    public void name() throws IOException {

        driver.get("https://www.n11.com/");
        TakesScreenshot ts =(TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(source, new File(".\\test-output\\photo.png"));

        WebElement spesific= driver.findElement(By.xpath("(//img[@class=\"conceptImg\"])[1]"));
        File source1 = spesific.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source1, new File(".\\test-output\\photoImage.png"));




    }
}
