package Practice01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practice01 {
    WebDriver driver;

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
   // @After
   // public void tearDown(){
   //     driver.close();
   // }
    @Test
    public void test01() throws InterruptedException {
        driver.get("https://www.automationexercise.com/");
        WebElement homepage = driver.findElement(By.xpath("//i[@class=\"fa fa-home\"]"));
        Assert.assertTrue("Homepage is visible", homepage.isDisplayed());

        Thread.sleep(2000);
        WebElement sing = driver.findElement(By.xpath("//a[@href=\"/login\"]"));
        sing.click();
        WebElement newUser = driver.findElement(By.xpath("//*[text()='New User Signup!']"));
        Assert.assertTrue("New User Signup is visible", newUser.isDisplayed());

        WebElement nameInput = driver.findElement(By.xpath("//input[@type=\"text\"]"));
        nameInput.sendKeys("Hamza");
        WebElement emailInput = driver.findElement(By.xpath("(//input[@type=\"email\"])[2]"));
        emailInput.sendKeys("gnr4lyfe@invtribe04.xyz");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@data-qa=\"signup-button\"]")).click();

        WebElement check = driver.findElement(By.xpath("//*[text()='Enter Account Information']"));
        Assert.assertTrue("Account Information is visible", check.isDisplayed());

        driver.findElement(By.xpath("//input[@id=\"id_gender1\"]")).click();

        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("123456");
        Thread.sleep(2000);

        WebElement dayOfBirth = driver.findElement(By.id("days"));
        dayOfBirth.click();
        dayOfBirth.sendKeys("1");

        WebElement monthOfBirth = driver.findElement(By.id("months"));
        monthOfBirth.click();
        monthOfBirth.sendKeys("April");

        WebElement yearOfBirth = driver.findElement(By.id("years"));
        yearOfBirth.click();
        yearOfBirth.sendKeys("2000");

        driver.findElement(By.xpath("//input[@id=\"newsletter\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id=\"optin\"]")).click();

        driver.findElement(By.id("first_name")).sendKeys("Hamza");
        driver.findElement(By.id("last_name")).sendKeys("Bayram");
        driver.findElement(By.id("company")).sendKeys("Sehbal");
        driver.findElement(By.id("address1")).sendKeys("pietersan straat 49 ");
        Thread.sleep(2000);
        WebElement country = driver.findElement(By.id("country"));
        country.click();
        country.sendKeys("United states");

        driver.findElement(By.id("state")).sendKeys("New Jersey");
        driver.findElement(By.id("city")).sendKeys("LOS ANGELES");
        driver.findElement(By.id("zipcode")).sendKeys("New Jersey");
        driver.findElement(By.id("mobile_number")).sendKeys("+1356885522");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@data-qa=\"create-account\"]")).click();

        WebElement result = driver.findElement(By.xpath("//*[text()='Account Created!']"));
        Assert.assertTrue("Account is diplayed", result.isDisplayed());
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Continue']")).click();
        Thread.sleep(5000);

        WebElement reklama = driver.findElement(By.xpath("//body[@aria-hidden=\"true\"]"));
        reklama.click();

        WebElement loggedInAs = driver.findElement(By.xpath("//*[text()=' Logged in as ']"));
        Assert.assertTrue(loggedInAs.isDisplayed());
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href=\"/delete_account\"]")).click();

    }
}
