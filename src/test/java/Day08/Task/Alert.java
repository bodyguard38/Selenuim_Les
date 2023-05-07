package Day08.Task;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class Alert extends Base {
    /*
       Go to URL: http://demo.automationtesting.in/Alerts.html
       Click "Alert with OK" and click 'click the button to display an alert box:’
       Accept Alert(I am an alert box!) and print alert on console.
       Click "Alert with OK & Cancel" and click 'click the button to display a confirm box’
       Cancel Alert  (Press a Button !)
       Click "Alert with Textbox" and click 'click the button to demonstrate the prompt box’
       And then sendKeys «Bootcamp» (Please enter your name)
       Finally print on console this message "Hello Bootcamp How are you today" assertion these message.
        */
    @Test
    public void test() {

        driver.get("http://demo.automationtesting.in/Alerts.html");
        driver.findElement(By.xpath("//a[text()='Alert with OK ']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]")).click();

        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
        driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();

        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
        driver.findElement(By.xpath("(//button[contains(.,demonstrate)])[4]")).click();

        driver.switchTo().alert().sendKeys("Bootcamp");
        driver.switchTo().alert().accept();
        String text = driver.findElement(By.id("demo1")).getText();
        System.out.println(text);
        Assert.assertEquals("Hello Bootcamp How are you today", text);



    }
}
