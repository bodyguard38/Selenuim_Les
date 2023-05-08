package Practice01;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class TestCase_01 extends Base {
    
    /*
    1-Test01 isimli bir class olusturun
    2- https://www.amazon.com/ adresine gidin
    3- Browseri tam sayfa yapin
    4-Sayfayi "refresh" yapin
    5-"Salesforce Apex Questions Bank" icin arama yapiniz
    6- Kac sonuc bulundugunu yaziniz
    7-Sayfayi kapatin
     */

    @Test
    public void Test01() {

        driver.get("https://www.amazon.com/");
        driver.navigate().refresh();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Salesforce Apex Questions Bank"+ Keys.ENTER);

        System.out.println(driver.findElement(By.xpath("(//div[@class=\"a-section a-spacing-small a-spacing-top-small\"])[1]")).getText());



        driver.quit();
    }
}
