package Practice01;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class TestCase_03 extends Base {

        /*
      1. "https://www.saucedemo.com" Adresine gidin
      2. Username kutusuna "standard_user" yazdirin
      3. Password kutusuna "secret_sauce" yazdirin
      4. Login tusuna basin
      5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
      6. Add to Cart butonuna basin
      7. Alisveris sepetine tiklayin
      8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
      9. Sayfayi kapatin
        */

    @Test
    public void Test03() {

        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();

        System.out.println(driver.findElement(By.id("item_4_title_link")).getText());
        driver.findElement(By.id("item_4_title_link")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.id("shopping_cart_container")).click();

        WebElement product = driver.findElement(By.xpath("//div[@class=\"inventory_item_name\"]"));
        Assert.assertEquals("Sauce Labs Backpack", product.getText());



        driver.quit();

    }
}
