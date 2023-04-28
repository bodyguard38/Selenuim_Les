package Day08.Task;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;


public class Dropdown01 extends Base {
    /*
    Go to URL: https://the-internet.herokuapp.com/dropdown
    Create method selectByIndexTest and Select Option 1 using index .
    Create method selectByValueTest Select Option 2 by value.
    Create method selectByVisibleTextTest Select Option 1 value by visible text.
    Create method printAllTest Print all dropdown value.
    Verify the dropdown has Option 2 text.
    Create method printFirstSelectedOptionTest Print first selected option.
    Find the size of the dropdown, Print "Expected Is Not Equal Actual" if there are not 3 elements in the dropdown.
     */
    @Test
    public void selectByIndextest(){

        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement dropdownList = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdownList);
        select.selectByIndex(1);
    }
    @Test
    public void selectByValueTest(){
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement dropdownList = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdownList);
        select.selectByValue("2");
    }
    @Test
    public void selectByVisibleTextTest(){
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement dropdownList = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdownList);
        select.selectByVisibleText("Option 1");
    }
    @Test
    public void printAllTest(){
        driver.get("https://the-internet.herokuapp.com/dropdown");

        Select select = new Select(driver.findElement(By.id("dropdown")));
        List<WebElement> options = select.getOptions();
        List<String> optionValues = options.stream().map(x->x.getAttribute("value")).collect(Collectors.toList());
        System.out.println(optionValues);
    }
    @Test
    public void drobdownListTestOption2(){
        driver.get("https://the-internet.herokuapp.com/dropdown");
        Select select = new Select(driver.findElement(By.id("dropdown")));

        List<WebElement> options = select.getOptions();
        boolean optionpresent = false;

        for (WebElement option:options) {
            if(option.getText().equals("Option 2")){
                optionpresent= true;
                break;
            }
        }
        Assert.assertTrue("Option is not found", optionpresent);
    }
    @Test
    public void printFirstSelectedOptionTest(){

        driver.get("https://the-internet.herokuapp.com/dropdown");
        Select select = new Select(driver.findElement(By.id("dropdown")));
        System.out.println(select.getFirstSelectedOption().getText());

    }
    @Test
    public void printSize(){
        driver.get("https://the-internet.herokuapp.com/dropdown");
        Select select = new Select(driver.findElement(By.id("dropdown")));
        List<WebElement> options = select.getOptions();

        System.out.println(options.size());

        if(options.size()!=3){
            System.out.println("Expected Is Not Equal Actual");
        }else{
            System.out.println("Expected Is Equal Actual");
        }

    }

}
