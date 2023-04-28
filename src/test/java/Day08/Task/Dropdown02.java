package Day08.Task;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class Dropdown02 extends Base {

    /*
    Launch the browser.
    Open "https://demoqa.com/select-menu".
    Select the Old Style Select Menu using the element id.
    Print all the options of the dropdown.
    Select 'Purple' using the index.
    After that, select 'Magenta' using visible text.
    Select an option using value.
    Close the browser.
     */
    @Test
    public void test() throws InterruptedException {
        driver.get("https://demoqa.com/select-menu");
        WebElement element = driver.findElement(By.id("oldSelectMenu"));
        Select select = new Select(element);

        List<WebElement> options = select.getOptions();
        for (WebElement option:options) {
            System.out.println(option.getText());
        }
        select.selectByVisibleText("Magenta");
        select.selectByValue("1");
        Thread.sleep(3000);


        driver.close();
    }
}
