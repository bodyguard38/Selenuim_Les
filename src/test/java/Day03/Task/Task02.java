package Day03.Task;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task02 {
    public static void main(String[] args) {

        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

        System.out.println(driver.getCurrentUrl().contains("Amazon") ? "Test passed" : "Test failed");

        System.out.println(!driver.getTitle().contains("Facebook") ? "Test passed" : "Test failed");
    }
}
