package Extra_01.Day06_Oefenen;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C03_CheckBox extends Base {
    @Test
    public void CheckBox(){
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        WebElement checkbox1 = driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[1]"));
        WebElement checkbox2 = driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[2]"));

        System.out.println("checkbox1 is before = " + checkbox1.isSelected());
        System.out.println("checkbox2 is before = " + checkbox2.isSelected());

        checkbox1.click();
        checkbox2.click();

        System.out.println("Checkbox is clicked");

        System.out.println("checkbox1 is after = " + checkbox1.isSelected());
        System.out.println("checkbox2 is after = " + checkbox2.isSelected());
    }
}
