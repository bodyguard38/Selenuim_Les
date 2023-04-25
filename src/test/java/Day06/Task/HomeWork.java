package Day06.Task;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeWork extends Base {
    /*
    Go to URL: https://demoqa.com/radio-button
    Soruya verilen 3 seçeneğin de seçilme durumlarını doğrulayınız.
    Her bir seçenek seçildiğinde aşağıda çıkan text’leri konsolda yazdırınız.
    */
    @Test
    public void test() throws InterruptedException {
        driver.get("https://demoqa.com/radio-button");
        Thread.sleep(3000);

        WebElement yesCheck = driver.findElement(By.xpath("//input[@id=\"yesRadio\"]"));
        WebElement impressiveCheck = driver.findElement(By.xpath("(//input[@class=\"custom-control-input\"])[2]"));
        WebElement noCheck = driver.findElement(By.xpath("//input[@class=\"custom-control-input disabled\"]"));


        Assert.assertTrue(!yesCheck.isSelected());
        Assert.assertTrue(!impressiveCheck.isSelected());
        Assert.assertTrue(!noCheck.isSelected());


        yesCheck.click();
        Thread.sleep(3000);
        Assert.assertTrue(yesCheck.isSelected());
        Assert.assertTrue(!impressiveCheck.isSelected());
        Assert.assertTrue(!noCheck.isSelected());



    }
}
