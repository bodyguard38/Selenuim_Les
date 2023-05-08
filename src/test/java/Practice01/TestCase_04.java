package Practice01;

import Utilities.Base;
import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class TestCase_04 extends Base {

    /* Given kullanici "https://editor.datatables.net/" sayfasina gider
    Then new butonuna basar
    And editor firstname kutusuna "<firstName>" bilgileri girer
    And editor lastname kutusuna "<lastName>" bilgileri girer
    And editor position kutusuna "<position>" bilgileri girer
    And editor office kutusuna "<office>" bilgileri girer
    And editor extension kutusuna "<extension>" bilgileri girer
    And editor startdate kutusuna "<startDate>" bilgileri girer
    And editor salary kutusuna "<salary>" bilgileri girer
    When Create tusuna basar
    Then Kullanıcının eklendiğini doğrular.
    And Eklediği kullanıcı kaydını siler.
    Then Kullanıcinin silindiğini doğrular.
    */


    Faker faker = new Faker();
    String fakeName = faker.name().firstName();
    String lastName = faker.name().lastName();



    @Test
    public void Test04() {

        driver.get("https://editor.datatables.net/");
        driver.findElement(By.xpath("//button[@type=\"button\"]")).click();

        driver.findElement(By.id("DTE_Field_first_name")).sendKeys(fakeName);
        driver.findElement(By.id("DTE_Field_last_name")).sendKeys(lastName);
        driver.findElement(By.id("DTE_Field_position")).sendKeys("Manager");
        driver.findElement(By.id("DTE_Field_office")).sendKeys("Central");
        driver.findElement(By.id("DTE_Field_extn")).sendKeys("Java");
        driver.findElement(By.id("DTE_Field_start_date")).sendKeys("1999-05-03");
        driver.findElement(By.id("DTE_Field_salary")).sendKeys("2450");

        WebElement check=driver.findElement(By.xpath("//button[@class=\"btn\"]"));
        check.click();
        driver.findElement(By.xpath("//input[@type=\"search\"]")).sendKeys(fakeName+ Keys.ENTER);
        WebElement check1 = driver.findElement(By.xpath("//td[@class=\"sorting_1\"]"));

        Assert.assertTrue(check1.getText().contains(fakeName));
        check1.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//span[contains(.,'Delete')]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//div[@class=\"DTE_Form_Buttons\"]")).click();

        WebElement isEmpty=driver.findElement(By.xpath("//table[contains(.,no)]"));
        Assert.assertTrue(isEmpty.getText().contains("No matching records found"));





    }
}
