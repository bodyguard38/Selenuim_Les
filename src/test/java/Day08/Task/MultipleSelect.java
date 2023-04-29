package Day08.Task;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class MultipleSelect extends Base{
    /*
    Go to URL: https://demoqa.com/select-menu
    Select options in Standard multiple select
    */
    @Test
    public void test() throws InterruptedException {
        driver.get("https://demoqa.com/select-menu");
        WebElement cars=driver.findElement(By.xpath("//select[@id=\"cars\"]"));

        Select select= new Select(cars);
        if (select.isMultiple()){
            select.selectByIndex(3);
            Thread.sleep(3000);
            select.selectByValue("opel");
            Thread.sleep(3000);
            select.selectByIndex(2);


        }

    }

}
