package Day08.Task;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown03 extends Base {
    /*
    Launch the browser.
    Open "https://demoqa.com/select-menu".
    Select the Standard Multi-Select using the element id.
    Verifying that the element is multi-select.
    Select 'Opel' using the index and deselect the same using index.
    Select 'Saab' using value and deselect the same using value.
    Deselect all the options.
    Close the browser.
     */
    @Test
    public void test() throws InterruptedException {
        driver.get("https://demoqa.com/select-menu");
        WebElement multiselectMenu = driver.findElement(By.id("cars"));
        Select select=new Select(multiselectMenu);

        Assert.assertTrue(select.isMultiple());
        select.selectByIndex(2);
        Thread.sleep(2000);
        select.deselectByIndex(2);

        select.selectByValue("saab");
        Thread.sleep(2000);
        select.deselectByValue("saab");

        select.deselectAll();

        driver.quit();

    }
}
