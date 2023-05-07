package Day13.Task;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WebTables_02 extends Base {
        /*
    Go to URL: https://the-internet.herokuapp.com/tables
    Print the entire table
    Print All Rows
    Print Last row data only
    Print column 5 data in the table body
    Write a method that accepts 3 parameters
    parameter 1 = table
    parameter 2 = row number
    parameter 3 = column number
    printData(table,3,4); => prints
    printData(table, 3,4,) => prints data in 3rd row 4th Column of table specified
        */

    @Test
    public void test01() {
        driver.get("https://the-internet.herokuapp.com/tables");

        List<WebElement> tables = driver.findElements(By.tagName("table"));

        for (WebElement table : tables) {
            System.out.println("Table: " + table.getAttribute("id"));

            List<WebElement> rows = table.findElements(By.tagName("tr"));
            for (WebElement row : rows) {
                System.out.println(row.getText());
            }
        }

    }

    @Test
    public void test02() {

        driver.get("https://the-internet.herokuapp.com/tables");

        WebElement table = driver.findElement(By.xpath("//table[@id='table1']"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));

        for (WebElement row : rows) {
            System.out.println(row.getText());
        }
    }

    @Test
    public void test03() {

        driver.get("https://the-internet.herokuapp.com/tables");

        WebElement firstTable = driver.findElement(By.xpath("//table[@id='table1']"));
        List<WebElement> firstTableRows = firstTable.findElements(By.tagName("tr"));
        WebElement lastRowOfFirstTable = firstTableRows.get(firstTableRows.size() - 1);

        List<WebElement> firstTableCells = lastRowOfFirstTable.findElements(By.tagName("td"));
        System.out.println("Last row of first table:");
        for (WebElement cell : firstTableCells) {
            System.out.print(cell.getText() + " ");
        }

        WebElement secondTable = driver.findElement(By.xpath("//table[@id='table2']"));
        List<WebElement> secondTableRows = secondTable.findElements(By.tagName("tr"));
        WebElement lastRowOfSecondTable = secondTableRows.get(secondTableRows.size() - 1);

        List<WebElement> secondTableCells = lastRowOfSecondTable.findElements(By.tagName("td"));
        System.out.println("Last row of second table:");
        for (WebElement cell : secondTableCells) {
            System.out.print(cell.getText() + " ");
        }
    }

    @Test
    public void test04() {

        driver.get("https://the-internet.herokuapp.com/tables");

        WebElement firstTable = driver.findElement(By.xpath("//table[@id=\"table1\"]"));
        List<WebElement> firstTableRows = firstTable.findElements(By.tagName("tr"));
        for (WebElement row : firstTableRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            WebElement fifthCell = cells.get(4); // beşinci sütun, dizide 4. indis
            System.out.println(fifthCell.getText());
        }

        WebElement secondTable = driver.findElement(By.xpath("//table[@id=\"table2\"]"));
        List<WebElement> secondTableRows = secondTable.findElements(By.tagName("tr"));
        for (WebElement row : secondTableRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            WebElement fifthCell = cells.get(4); // beşinci sütun, dizide 4. indis
            System.out.println(fifthCell.getText());
        }
    }

    @Test
    public void test05() {

        driver.get("https://the-internet.herokuapp.com/tables");

        WebElement table = driver.findElement(By.id("table1"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        WebElement thirdRow = rows.get(2);
        List<WebElement> cells = thirdRow.findElements(By.tagName("td"));
        WebElement fourthCell = cells.get(3);
        String cellText = fourthCell.getText();
        System.out.println("Data in the 3rd row 4th column: " + cellText);

    }
    @Test
    public void test06() {

        driver.get("https://the-internet.herokuapp.com/tables");

        WebElement table = driver.findElement(By.id("table2"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        WebElement thirdRow = rows.get(2);
        List<WebElement> cells = thirdRow.findElements(By.tagName("td"));
        WebElement fourthCell = cells.get(3);
        String cellText = fourthCell.getText();
        System.out.println("Data in the 3rd row 4th column: " + cellText);

    }
}
