package Day04.Task;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task02 {
    /*
        Go to http://www.google.com
    Type "Green Mile" in the search box and print the number of results.
    Type "Premonition" in the search box and print the number of results.
    Type "The Curious Case of Benjamin Button" in the search box and print the number of results.

     */
    @Test
    public void task2(){
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        driver.manage().window().maximize();
        WebElement searchAlles= driver.findElement(By.xpath("//button[@id=\"L2AGLb\"]//div[@class=\"QS5gu sy4vM\"]"));
        searchAlles.click();

        WebElement searchBox= driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]"));
        searchBox.sendKeys("Green Mile");
        WebElement googleSearch= driver.findElement(By.xpath("//div[@class=\"FPdoLc lJ9FBc\"]//input[@class=\"gNO89b\"]"));
        googleSearch.click();
        WebElement result= driver.findElement(By.xpath("//div[@id=\"result-stats\"]"));
        System.out.println(result.getText());

        WebElement newSearchbox = driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]"));
        newSearchbox.clear();
        newSearchbox.sendKeys("Premonition"+Keys.ENTER);

        WebElement result2 = driver.findElement(By.xpath("//div[@id=\"result-stats\"]"));
        System.out.println(result2.getText());


    }
}
