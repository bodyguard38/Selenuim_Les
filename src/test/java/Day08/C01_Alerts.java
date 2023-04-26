package Day08;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class C01_Alerts extends Base {

    @Test
    public void Alert() throws InterruptedException {


            driver.get("https://the-internet.herokuapp.com/javascript_alerts");

            // Click for JS Alert butonuna tikla
            List<WebElement> buttons = driver.findElements(By.tagName("button"));

            buttons.get(0).click();


            // Alert teki OK butonuna tikla
            driver.switchTo().alert().accept();


            // JS confirm butonuna tikla
            buttons.get(1).click();

            //Alertteki cancel butonuna tikla
            driver.switchTo().alert().dismiss();


            // JS Prompt butonuna tikla
            buttons.get(2).click();


            //Alert e Karl Ortis yaz ve OK a tikla
            driver.switchTo().alert().sendKeys("Karl Ortis");
            driver.switchTo().alert().accept();



        }


    }

