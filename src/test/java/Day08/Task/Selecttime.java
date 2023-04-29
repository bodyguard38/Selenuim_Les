package Day08.Task;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class Selecttime extends Base {

    /*
    Go to URL: https://demoqa.com/select-menu
    Get all the options of the dropdown
    Options size
    Print all test
    Verify the dropdown has option "Black"
    Print FirstSelectedOptionTest
    Select option "Yellow"
     */
    @Test
    public void test(){

        driver.get("https://demoqa.com/select-menu");

        WebElement options = driver.findElement(By.id("oldSelectMenu"));
        Select select = new Select(options);

        List<WebElement> selectedOptions = select.getOptions();

        List<String> allList = selectedOptions.stream().map(x->x.getText()).collect(Collectors.toList());

        System.out.println("alllList = " + allList);
        System.out.println("allList.size() = " + allList.size());

        Assert.assertTrue(allList.contains("Black"));

        String text = select.getFirstSelectedOption().getText();
        System.out.println(text);
        select.selectByVisibleText("Yellow");


    }
}
