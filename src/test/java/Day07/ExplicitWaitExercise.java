package Day07;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitExercise extends Base {

    @Test
    public void test(){
    driver.get("https://www.bestbuy.com/");

        WebElement hiddenelement = driver.findElement(By.xpath("(//a[@class='us-link'])[2]"));

        //hiddenelement.click(); ifadesinde elementnot interactible hatasi aliyoruz bu yzden explictWait kullanacagiz

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(hiddenelement)).click();

    }
}
