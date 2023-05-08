package Practice01;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class TestCase_02 extends Base {
    /*
    1. http://zero.webappsecurity.com sayfasina gidin
    2. Signin buttonuna tiklayin
    3. Login alanine  "username" yazdirin
    4. Password alanine "password" yazdirin
    5. Sign in buttonuna tiklayin (hata mesaji icin back tusuna tiklayin)
    6. Online Banking menusunden Pay Bills sayfasina gidin
    7. amount kismina yatirmak istediginiz herhangi bir miktari yazin
    8. tarih kismina "2020-09-10" yazdirin
    9. Pay buttonuna tiklayin
    10. "The payment was successfully submitted." mesajinin ciktigini kontrol edin
    */

    @Test
    public void Test01() {

        driver.get("http://zero.webappsecurity.com");
        driver.findElement(By.id("signin_button")).click();

        driver.findElement(By.id("user_login")).sendKeys("username");
        driver.findElement(By.id("user_password")).sendKeys("password");
        driver.findElement(By.xpath("(//input)[4]")).click();

        driver.navigate().back();

        driver.findElement(By.xpath("(//div[contains(.,'Online Banking')])[7]")).click();

        driver.findElement(By.id("pay_bills_link")).click();

        driver.findElement(By.id("sp_amount")).sendKeys("1000");
        driver.findElement(By.id("sp_date")).sendKeys("2020-09-10");
        driver.findElement(By.id("pay_saved_payees")).click();

        WebElement alertText = driver.findElement(By.id("alert_content"));

        Assert.assertEquals("The payment was successfully submitted.",alertText.getText());

    }
}
