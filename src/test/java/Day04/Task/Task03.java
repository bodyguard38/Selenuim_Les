package Day04.Task;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task03 {
    /*
    Navigate to website  https://testpages.herokuapp.com/styled/index.html
    Under the ORIGINAL CONTENTS
    Click on Alerts
    Print the URL
    Navigate back
    Print the URL
    Click on Basic Ajax
    Print the URL
    Enter value 20 and Enter
    And then verify Submitted Values is displayed open page
    Close driver.
     */
    @Test
    public void task03() throws InterruptedException {
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement alertLocatie= driver.findElement(By.xpath("//a[@id=\"alert\"]"));
        alertLocatie.click();

        System.out.println(driver.getCurrentUrl());
        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());

        WebElement clickBasicAjax = driver.findElement(By.xpath("//a[@id=\"basicajax\"]"));
        clickBasicAjax.click();
        System.out.println(driver.getCurrentUrl());

        WebElement basicAjaxInLocatie = driver.findElement(By.xpath("//input[@id=\"lteq30\"]"));
        basicAjaxInLocatie.sendKeys("20"+ Keys.ENTER);

        WebElement display = driver.findElement(By.xpath("//div[@id='_id']//..//p"));
        Assert.assertTrue(display.isDisplayed());

        driver.quit();





    }
}
