package Day06;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;

public class C01_RelativeLocator extends Base {

    @Test
    public void RelativeLocator(){
        //        Go to http://www.bestbuy.com
        //        Verify that the page title contains "Best" Also, using Relative Locator.
        //        LogoTest  Verify if the BestBuy logo is displayed.
        //        mexicoLinkTest  Verify if the link is displayed.

        driver.get("http://www.bestbuy.com");
        String pageTitle = driver.getTitle();
        Assert.assertTrue(pageTitle.contains("Best"));;
        By logoLocator = RelativeLocator.with(By.tagName("img")).above(By.xpath("//div[text()=\"Hello!\"]"));

        WebElement logo = driver.findElement(logoLocator);
        String bestBuyTitle = logo.getAttribute("Title");
        Assert.assertTrue(logo.isDisplayed());
        //    canada link locator  (//a[@class='canada-link'])[1]

        By UsLinkLocator = RelativeLocator.with(By.tagName("a")).toRightOf(By.xpath("(//a[@class='canada-link'])[1]"));
        WebElement UsLink = driver.findElement(UsLinkLocator);
        Assert.assertTrue(UsLink.isDisplayed());


    }
}
