package Day11.Task;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class FileUpload extends Base {

    //Go to URL: https://www.monsterindia.com/seeker/registration
    //Upload file.

    @Test
    public void test(){

        driver.get("https://www.monsterindia.com/seeker/registration");

        String path=System.getProperty("user.dir") + System.getProperty("file.separator") + "\\src\\test\\resources\\sample.docx";

        System.out.println("path = " + path);
        WebElement uploadResume= driver.findElement(By.xpath("//input[@type='file']"));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        uploadResume.sendKeys(path);



    }
}
