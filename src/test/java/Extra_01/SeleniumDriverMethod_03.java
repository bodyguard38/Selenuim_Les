package Extra_01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDriverMethod_03 {
    public static void main(String[] args) {
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.automationexercise.com/");
        driver.manage().window().maximize();

        WebElement signUpButton = driver.findElement(By.xpath("//a[contains(.,'Signup / Login')]"));
        System.out.println("signUpButton.isDisplayed() = " + signUpButton.isDisplayed());
        System.out.println("signUpButton.getText() = " + signUpButton.getText());
        System.out.println("signUpButton.getCssValue() = " + signUpButton.getCssValue("color"));
        System.out.println(signUpButton.getAttribute("href"));
        signUpButton.click();

        WebElement newUserName = driver.findElement(By.name("name"));
        WebElement newUserEmail = driver.findElement(By.xpath("//div[@class= 'Signup form']//input[@name=email"));
        WebElement newUserSignUpButton = driver.findElement(By.xpath("//button[.='Signup']"));
        newUserName.sendKeys("liyoline");
        newUserEmail.sendKeys("fajoh30766@lieboe.com");
    }
}
