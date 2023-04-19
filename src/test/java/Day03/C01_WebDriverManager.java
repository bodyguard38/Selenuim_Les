package Day03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_WebDriverManager {
    public static void main(String[] args) {

        //WebdriverManager class kullanilarak istenilen browser in binary leri oto olarak indirilir
        //driver objesi olusturulur

        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/");


    }
}
