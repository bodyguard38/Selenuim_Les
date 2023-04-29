package Day04.Task;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Task04 {
    /*
    https://id.heroku.com/login sayfasına gidiniz.
    Bir mail adresi giriniz.
    Bir password giriniz.
    Login butonuna tıklayınız.
    "There was a problem with your login." text görünür ise "Kayıt Yapılamadı" yazdırınız.
    Eğer yazı görünür değilse "Kayıt Yapıldı" yazdırınız.
    Tüm sayfaları kapatınız.
     */

    @Test
    public void Task04() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://id.heroku.com/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("//button[@id=\"onetrust-accept-btn-handler\"]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("//input[@autofocus=\"true\"]")).sendKeys("ahmet@hotmail.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//input[@autocomplete=\"off\"]")).sendKeys("ddss1299+");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//button[@class=\"btn btn-primary btn-lg btn-block\"]")).submit();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        System.out.println(driver.findElement(By.xpath("//div[@class=\"alert alert-danger\"]"))
                .getText().equals("There was a problem with your login.") ? "Could not record" : "recorded");



        driver.quit();
    }
}
