package Day09;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C05_Actions extends Base {
    //https://www.amazon.com/ git
    //Account abd list linkinin uzerine gel
    //cikan pencerede orders linkine tikla
    //login ekraninin acildigini dogrula
    @Test
    public void test(){

        driver.get("https://www.amazon.com/");

        Actions actions = new Actions(driver);
        WebElement accountList = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        WebElement orders = driver.findElement(By.xpath("(//span[@class=\"nav-text\"])[4]"));

        actions.moveToElement(accountList).click(orders).perform();

        Assert.assertTrue(driver.getTitle().contains("Amazon Sign-In"));

    }
}
