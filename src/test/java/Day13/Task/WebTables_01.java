package Day13.Task;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class WebTables_01 extends Base {
        /*
        Go to URL: http://demo.guru99.com/test/web-table-element.php
        To find third row of table
        To get 3rd row's 2nd column data
        Get all the values of a Dynamic Table
         */

    @Test
    public void name() {

        driver.get("http://demo.guru99.com/test/web-table-element.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



        WebElement table = driver.findElement(By.xpath("//table[@class='dataTable']//tbody"));

        WebElement row3 = table.findElement(By.xpath(".//tr[3]"));
        System.out.println("row3.getText() = " + row3.getText());

        WebElement r3c2 = table.findElement(By.xpath(".//tr[3]//td[2]"));

        String text = r3c2.getText();
        System.out.println("text = " + text);

        List<WebElement> AllText = driver.findElements(By.xpath("(//table)[2]//tr"));

        for (WebElement a:AllText) {
            System.out.println(a.getText());
        }

    }
}
