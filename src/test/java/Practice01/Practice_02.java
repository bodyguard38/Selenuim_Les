package Practice01;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;


public class Practice_02 extends Base {

    //    Actions Class ile Test Case - Automate 'Search Product' feature of e-commerce website with Selenium.
    //    Steps to Automate:
    //            1. Open link http://automationpractice.pl/index.php
    //            2. Move your cursor over Women's link.
    //            3. Click on sub menu 'T-shirts'
    //            4. Get Name/Text of the first product displayed on the page.
    //            5. Now enter the same product name in the search bar present on top of page and click search button.
    //            6. Validate that same product is displayed on searched page with same details which were displayed on T-Shirt's page.

    @Test
    public void searchProduct() {
        singIn();
        Actions actions = new Actions(driver);
        WebElement womanTab = driver.findElement(By.xpath("(//a[@class=\"sf-with-ul\"])[1]"));
        actions.moveToElement(womanTab).perform();

        WebElement tshirtButton= driver.findElement(By.xpath("(//a[@title=\"T-shirts\"])[1]"));
        tshirtButton.click();

    }

    private void singIn() {
        driver.get("http://automationpractice.pl/index.php");
    }
}
