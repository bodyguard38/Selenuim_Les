package Extra_01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDriverMethod_01 {
    public static void main(String[] args) {

        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();

        System.out.println("driver.getTitle() = " + driver.getTitle());//sayfanin basligi
        System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());//sayfanin unique hash kodunu dondurur.
        System.out.println("driver.getPageSource() = " + driver.getPageSource());//sayfanin kaynak kodlarini dondurur.
        System.out.println("driver.getWindowHandles() = " + driver.getWindowHandles());//driver calisirken acilan tum sayfalarin hash kodunu doner.


        driver.quit();
    }
}
