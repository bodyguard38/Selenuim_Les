package Day04.Task;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01 {

          // Go to http://automationpractice.com/index.php
          // When we write an e-mail without the @ sign in the e-mail box and press enter.
          // Let's test the "Invalid email address" warning.

    @Test
    public void task1(){

        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationexercise.com");
        driver.manage().window().maximize();

        WebElement signIn= driver.findElement(By.xpath("//a[@href=\"/login\"]"));
        signIn.click();
        WebElement mail=driver.findElement(By.xpath("//div[@class=\"login-form\"]//input[@ type=\"email\"]"));
        mail.sendKeys("ahmethotmail.com"+ Keys.ENTER);



    }
}
