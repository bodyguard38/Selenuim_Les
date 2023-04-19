package Extra_01.Day06_Oefenen;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C04_RadioButtons extends Base {

    @Test
    public void RadioButton() throws InterruptedException {
        driver.get("https://www.facebook.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//button[@data-testid])[3]")).click();

        driver.findElement(By.xpath("(//div[@class=\"_6ltg\"])[2]")).click();

        WebElement femaleRadio = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
        WebElement maleRadio = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
        WebElement costumRadio = driver.findElement(By.xpath("(//input[@type='radio'])[3]"));

        Assert.assertTrue(!femaleRadio.isSelected());
        Assert.assertTrue(!maleRadio.isSelected());
        Assert.assertTrue(!costumRadio.isSelected());

        femaleRadio.click();
        Thread.sleep(3000);
        Assert.assertTrue(femaleRadio.isSelected());
        Assert.assertTrue(!maleRadio.isSelected());
        Assert.assertTrue(!costumRadio.isSelected());

        maleRadio.click();
        Thread.sleep(3000);
        Assert.assertTrue(!femaleRadio.isSelected());
        Assert.assertTrue(maleRadio.isSelected());
        Assert.assertTrue(!costumRadio.isSelected());



    }
}
