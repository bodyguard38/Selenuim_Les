package Day08.Task;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

import static org.bouncycastle.crypto.tls.ContentType.alert;

public class Untitted extends Base {
    /*
    Go to URL: http://demo.automationtesting.in/Alerts.html
    Click "Alert with OK" and click 'click the button to display an alert box:’
    Accept Alert(I am an alert box!) and print alert on console.
    Click "Alert with OK & Cancel" and click 'click the button to display a confirm box’
    Cancel Alert  (Press a Button !)
    Click "Alert with Textbox" and click 'click the button to demonstrate the prompt box’
    And then sendKeys «BootcampCamp» (Please enter your name)
    Finally print on console this message "Hello BootcampCamp How are you today" assertion these message.

     */
    @Test
    public void test(){
        driver.get("http://demo.automationtesting.in/Alerts.html");

        List<WebElement> buttons = driver.findElements(By.xpath("(//button)[2]"));
        buttons.get(0).click();

        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();


        driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
        driver.switchTo().alert().dismiss();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//a[@href=\"#Textbox\"]")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]")).click();

        driver.switchTo().alert().sendKeys("Ahmet Aktas");


    }
}
