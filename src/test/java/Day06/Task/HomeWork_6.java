package Day06.Task;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

public class HomeWork_6 extends Base {
    /*
    https://www.teknosa.com/ adresine gidiniz.
    Arama çubuğuna ‘’oppo’’ yazıp ENTER tıklayınız.
    Sonuç sayısını yazdırınız.
    Çıkan ilk ürüne tıklayınız.
    Sepete ekleyiniz.
    Sepetime gite tıklayınız.
    Konsolda "Sipariş Özeti" WebElement’inin text’ini yazdırınız.
    Alışverişi tamamlayınız.
    Son olarak "Teknosa’ya Hoş Geldiniz" WebElement’inin text’ini yazdırınız.
    Driver’ı kapatınız.
     */

    @Test
    public void test() throws InterruptedException {
        driver.get("https://www.teknosa.com/");

        String cssSelectorForHost1 = ".efilli-layout-default";

        SearchContext shadow = driver.findElement(By.cssSelector(".efilli-layout-default")).getShadowRoot();
        shadow.findElement(By.cssSelector(".banner__accept-button")).click();

        Thread.sleep(3000);
       // driver.findElement(By.xpath("//div[@id=\"ins-editable-button-1580496494\"]")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id=\"search-input\"]")).sendKeys("oppo"+ Keys.ENTER);
        Thread.sleep(3000);
        System.out.println(driver.findElement(By.xpath("//div[@class=\"plp-info\"]")).getText());

        driver.findElement(By.xpath("(//a[@class=\"prd-link gowitPlp-js\"])[1]")).click();
        Thread.sleep(7000);
        driver.findElement(By.xpath("(//button[@id=\"addToCartButton\"])[1]")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class=\"btn btn-primary\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class=\"btn btn-primary js-checkout-controls\"]")).click();

        System.out.println(driver.findElement(By.xpath("//div[@class=\"cart-sum-title\"]")).getText());

        System.out.println(driver.findElement(By.xpath("//div[@class=\"lrp-title\"]")).getText());




        driver.quit();
    }
}
