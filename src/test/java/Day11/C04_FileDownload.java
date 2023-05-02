package Day11;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;

public class C04_FileDownload extends Base{

    //    Go to URL: https://the-internet.herokuapp.com/download
    //    Download testing.pdf
    //    Verify if the file downloaded successfully.

    @Test
    public void fileDownload() {

       driver.get("https://the-internet.herokuapp.com/download");
       driver.findElement(By.xpath("//a[@href=\"download/testing.pdf\"]")).click();

       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       String path = System.getProperty("user.home")+System.getProperty("file.separator")
               +"Downloads"+System.getProperty("file.separator")+"Testing.pdf";

       boolean isExists = Files.exists(Paths.get(path));
       Assert.assertTrue(isExists);



       driver.quit();
    }
}
