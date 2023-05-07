package Practice01;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionHomework_03 extends Base {

    @Test
    public void test(){

        driver.get("https://foundation.zurb.com/sites/docs/v/5.5.3/components/range_slider.html");

        WebElement slider = driver.findElement(By.xpath("(//span[@class=\"range-slider-handle\"])[1]"));
        WebElement value = driver.findElement(By.id("sliderOutput2"));
        Actions act = new Actions(driver);

        act.dragAndDropBy(slider,0,34).perform();
        System.out.println("What is the value after dragginig 34 unit slider up?"+value.getText());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        act.dragAndDropBy(slider,0,-34).perform();
        System.out.println("What is the value after dragginig 34 unit slider down?"+value.getText());
   }
}
