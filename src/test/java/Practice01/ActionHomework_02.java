package Practice01;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionHomework_02 extends Base {

    @Test
    public void test(){
        driver.get("https://rangeslider.js.org/");

        WebElement slider = driver.findElement(By.xpath("(//div[@class=\"rangeslider__handle\"])[1]"));
        WebElement output = driver.findElement(By.id("js-output"));

        Actions act = new Actions(driver);

        act.dragAndDropBy(slider,100,0).perform();
        System.out.println("What is the output after dragging right?"+output.getText());

        act.dragAndDropBy(slider,-100,0).perform();
        System.out.println("What is the output after dragging left?"+output.getText());

   }
}
