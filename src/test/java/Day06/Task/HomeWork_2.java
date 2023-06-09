package Day06.Task;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomeWork_2 extends Base {
    /*
    Go to URL: https://demoqa.com/
    Click on Elements.
    Click on Checkbox.
    Verify if Home checkbox is selected.
    Verify that "You have selected" is visible
     */

    @Test
    public void test() throws InterruptedException {
        driver.get("https://demoqa.com/");
       WebElement element = driver.findElement(By.xpath("//*[@d=\"M16 132h416c8.837 0 16-7.163 16-16V76c0-8.837-7.163-16-16-" +
                "16H16C7.163 60 0 67.163 0 76v40c0 8.837 7.163 16 16 16zm0 160h416c8.837 0 16-7.163 16-16v-40c0-" +
                "8.837-7.163-16-16-16H16c-8.837 0-16 7.163-16 16v40c0 8.837 7.163 16 16 16zm0 160h416c8.837 0 16-7.163" +
                " 16-16v-40c0-8.837-7.163-16-16-16H16c-8.837 0-16 7.163-16 16v40c0 8.837 7.163 16 16 16z\"]"));

       element.click();
       WebElement checkBox = driver.findElement(By.xpath("(//span[@class=\"text\"])[2]"));
       checkBox.click();
        Thread.sleep(2000);

       WebElement checkbox2=driver.findElement(By.xpath("//input[@id=\"tree-node-home\"]"));
        Assert.assertTrue(!checkbox2.isSelected());
        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[@class=\"rct-checkbox\"]")).click();

        WebElement text=driver.findElement(By.xpath("//span[text()='You have selected :']"));
        System.out.println("text.getText() = " + text.getText());
    }
}
