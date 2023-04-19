package Extra_01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SeleniumDriverMethod_02 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://automationexercise.com/");

        //Sayfanin konumu ve boyutlarini yazdirin

        System.out.println("Pencere konumu "+driver.manage().window().getPosition());  //acilan browsdr in konumunu pixel olarak verir.
        System.out.println("Pencere olculeri = " + driver.manage().window().getSize());//acilan browser in pixel olarak olculerini verir.

        driver.manage().window().setPosition(new Point(10,10));// yeni pozisyon set eder
        driver.manage().window().setSize(new Dimension(600,600));//yeni size set eder

        //sayfayi simge durumuna getirin
        driver.manage().window().minimize();//browser simge durumuna gelir
        Thread.sleep(3000);

        //sayfanin konumu ve boyutlarini maximize durumunda yazdirin
        driver.manage().window().maximize();
        System.out.println("Maximize boyutta Browser olculer = " + driver.manage().window().getSize());
        System.out.println("Maximize boyutta Pencere konumu = " + driver.manage().window().getPosition());
        driver.manage().window().fullscreen();


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.quit();

    }
}
