package Day11;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C05_FileUpload extends Base {

    //Go to URL: https://the-internet.herokuapp.com/upload
    //Find the path of the file that you want to upload.
    //Click on Upload button.
    //Verify the upload message.

    @Test
    public void fileUpload(){

        driver.get("https://the-internet.herokuapp.com/upload");

        String path = System.getProperty("user.dir")+System.getProperty("file.separator")
                +"fileExists.txt";

        System.out.println("path = " + path);
        WebElement chooseFile = driver.findElement(By.id("file-upload"));

        chooseFile.sendKeys(path);
        driver.findElement(By.id("file-submit")).click();

        WebElement infoMessage = driver.findElement(By.xpath("//h3[.='File Uploaded!']"));
        Assert.assertTrue(infoMessage.isDisplayed());

        


    }
}
