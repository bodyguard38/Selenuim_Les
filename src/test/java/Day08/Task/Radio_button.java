package Day08.Task;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Radio_button extends Base {
    /*
    Go to URL: https://demoqa.com/radio-button
    Soruya verilen 3 seçeneğin de seçilme durumlarını doğrulayınız.
    Her bir seçenek seçildiğinde aşağıda çıkan text’leri konsolda yazdırınız.
     */

    @Test
    public void test() throws InterruptedException {
        driver.get("https://demoqa.com/radio-button");

        WebElement yesbutton = driver.findElement(By.id("yesRadio"));
        WebElement impressivebutton = driver.findElement(By.id("impressiveRadio"));
        WebElement nobutton = driver.findElement(By.id("noRadio"));

        Assert.assertFalse(yesbutton.isSelected());
        Assert.assertFalse(impressivebutton.isSelected());
        Assert.assertFalse(nobutton.isSelected());
        Thread.sleep(3000);

        driver.findElement(By.xpath("//label[@for=\"yesRadio\"]")).click();
        System.out.println(driver.findElement(By.xpath("//span[@class=\"text-success\"]")).getText());
        Thread.sleep(3000);

        driver.findElement(By.xpath("(//label[@class=\"custom-control-label\"])[2]")).click();
        System.out.println(driver.findElement(By.xpath("//span[@class=\"text-success\"]")).getText());
        Thread.sleep(3000);




    }
}
