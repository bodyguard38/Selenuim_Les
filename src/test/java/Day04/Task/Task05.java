package Day04.Task;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task05 {
    /*
    Navigate to https://testpages.herokuapp.com/styled/index.html
    Click on Calculate under Micro Apps.
    Type any number in the first input.
    Type any number in the second input.
    Click on Calculate.
    Get the result.
    Print the result.
     */

    @Test
    public void microApps() throws InterruptedException {
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        Thread.sleep(3000);
        driver.findElement(By.id("calculatetest")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("number1")).sendKeys("10");
        Thread.sleep(3000);
        driver.findElement(By.id("number2")).sendKeys("5");
        Thread.sleep(3000);
        driver.findElement(By.id("calculate")).click();
        Thread.sleep(3000);
        System.out.println("Answer is :"+driver.findElement(By.id("answer")).getText());



        driver.quit();
    }
}
