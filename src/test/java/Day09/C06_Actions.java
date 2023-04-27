package Day09;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C06_Actions extends Base {

    //Go to URL: http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
    // Put Rome to Italy
    // Put Washington to United States
    @Test
    public void test(){

        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");


        WebElement roma = driver.findElement(By.id("box6"));
        WebElement italy = driver.findElement(By.id("box106"));
        WebElement washington = driver.findElement(By.id("box3"));
        WebElement usa = driver.findElement(By.id("box103"));
        WebElement madrid = driver.findElement(By.id("box7"));
        WebElement spain = driver.findElement(By.id("box107"));
        WebElement seoul = driver.findElement(By.id("box5"));
        WebElement copenhagen = driver.findElement(By.id("box4"));
        WebElement stockholm = driver.findElement(By.id("box2"));
        WebElement oslo = driver.findElement(By.id("box1"));
        WebElement norway = driver.findElement(By.id("box101"));
        WebElement denmark = driver.findElement(By.id("box104"));
        WebElement southKorea = driver.findElement(By.id("box105"));
        WebElement sweden = driver.findElement(By.id("box102"));




        Actions action = new Actions(driver);
        // oplossing 1
        action.dragAndDrop(roma, italy).perform();
        action.dragAndDrop(oslo,spain).perform();
        //oplossing 2
        action.moveToElement(washington).clickAndHold().moveToElement(usa).release().perform();
        action.moveToElement(madrid).clickAndHold().moveToElement(norway).release().perform();
        action.moveToElement(stockholm).clickAndHold().moveToElement(southKorea).release().perform();
        action.moveToElement(copenhagen).clickAndHold().moveToElement(sweden).release().perform();
        action.moveToElement(seoul).clickAndHold().moveToElement(denmark).release().perform();
    }
}
