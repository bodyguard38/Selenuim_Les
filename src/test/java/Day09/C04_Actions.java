package Day09;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C04_Actions extends Base {
    //    Go to URL: https://demoqa.com/buttons
    //    Run the buttons on the page using the Actions Class.
    //    Verify the texts that appear after the buttons are operated.

    @Test
    public void test01(){

        driver.get("https://demoqa.com/buttons");
        Actions actions = new Actions(driver);

        WebElement doubleClick = driver.findElement(By.id("doubleClickBtn"));
        WebElement rightClick = driver.findElement(By.xpath("(//button)[3]"));
        WebElement click = driver.findElement(By.xpath("(//button)[4]"));

        actions.doubleClick(doubleClick).perform();
        actions.contextClick(rightClick).perform();
        actions.click(click).perform();


    }


}
