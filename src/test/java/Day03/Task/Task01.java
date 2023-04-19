package Day03.Task;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01 {
    public static void main(String[] args) {

        WebDriverManager.chromiumdriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.google.nl/");

        driver.manage().window().maximize();
        System.out.println(driver.getTitle());

        System.out.println(driver.getTitle().equals("Google") ? "Test passed" : "Test failed");
    }
}
