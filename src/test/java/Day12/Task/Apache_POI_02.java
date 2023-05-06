package Day12.Task;

import Utilities.Base;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Apache_POI_02 extends Base {
    /*
    Store the path of the file as string and open the file.
    Open the workbook.
    Open the first worksheet.
    Go to the first row.
    Create a cell on the 3rd column (2nd index) on the first row.
    Write “POPULATION” on that cell.
    Create a cell on the 2nd row 3rd cell(index2), and write data.
    Create a cell on the 3rd row 3rd cell(index2), and write data.
    Create a cell on the 4th row 3rd cell(index2), and write data.
    Write and save the workbook.
    Close the file.
    Close the workbook.
     */
    @Test
    public void test() throws FileNotFoundException {
        String path = ".\\Users\\ahmet\\JunitSelenium\\src\\test\\resources\\excelfile.xlsx";
        FileInputStream fis = new FileInputStream(path);

    }
}
