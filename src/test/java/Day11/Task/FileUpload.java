package Day11.Task;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends Base {

    //Go to URL: https://www.monsterindia.com/seeker/registration
    //Upload file.

    @Test
    public void test(){
        driver.get("https://www.monsterindia.com/seeker/registration");

        String path = System.getProperty("user.dir")+System.getProperty("file.separator")
                +"fileExists.txt";

        WebElement chooseFile = driver.findElement(By.xpath("//div[@class=\"contentTitle\"]"));

        chooseFile.sendKeys(path);

    }
}
