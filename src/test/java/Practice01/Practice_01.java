package Practice01;

import Utilities.Base;
import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class Practice_01 extends Base {
    //Kaynak https://www.techlistic.com/p/selenium-tutorials.html

    //    1. Open this url  http://automationpractice.pl/index.php
    //    2. Click on sign in link.
    //    3. Verify sign in page
    //    3. Enter your email address in 'Create and account' section.
    //    4. Click on Create an Account button.
    //    5. Enter your Personal Information, Address and Contact info.
    //    6. Click on Register button.
    //    7. Validate that user is created.
    Faker faker = new Faker();
    String fakemail;
    String fakeFirstName;
    String fakeLastName;
    String fakepassword;


    @Test
    public void test(){

        driver.get("http://automationpractice.pl/index.php");
        driver.findElement(By.xpath("//a[@class=\"login\"]")).click();

        //    3. Verify sign in page
        Assert.assertTrue(driver.getCurrentUrl().contains("my-account"));

        fakemail = faker.internet().emailAddress();

        WebElement inputEmail = driver.findElement(By.id("email_create"));
        inputEmail.sendKeys(fakemail);

        driver.findElement(By.id("SubmitCreate")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("id_gender1")).click();

        fakeFirstName = faker.name().firstName();
        fakeLastName = faker.name().lastName();
        fakepassword = faker.internet().password();


        driver.findElement(By.id("customer_firstname")).sendKeys(fakeFirstName);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.id("customer_lastname")).sendKeys(fakeLastName);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.id("passwd")).sendKeys(fakepassword);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.id("days")).sendKeys("1");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.id("months")).sendKeys("March");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.id("years")).sendKeys("1981");

        WebElement checkBox = driver.findElement(By.id("newsletter"));
        checkBox.click();
        WebElement checkBox1 = driver.findElement(By.id("uniform-optin"));
        checkBox1.click();

        driver.findElement(By.xpath("//*[text()='Register']")).click();


        WebElement userCreated = driver.findElement(By.xpath("//p[@class=\"alert alert-success\"]"));

        System.out.println(userCreated.getText());
        Assert.assertTrue(userCreated.getText().contains("created"));

    }
}
