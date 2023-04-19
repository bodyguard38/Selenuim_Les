package Extra_01.Day06_Oefenen;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C02_ChromeOptions {

    @Test
    public void test01(){
        WebDriverManager.chromiumdriver().setup();
        ChromeOptions option = new ChromeOptions();
        option.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(option);

        driver.get("https://www.google.com/");

        System.out.println(driver.getTitle());
    }
}
