package Day09.Task;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class WindiwsHandle01 extends Base {

    //Go to URL: https://www.toolsqa.com/selenium-webdriver/window-handle-in-selenium/
   //Print the existing windowHandles ids by clicking all the links on the page.
   //Click on the links that open a new page.
   //Close other pages other than the home page.
   //Set the driver back to the main page.

    @Test
    public void test(){

        driver.get("https://www.toolsqa.com/selenium-webdriver/window-handle-in-selenium/");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-popup-blocking");
        //daha sonra kullanabilmek icin anasayfanin id sini sakliyoruz.
        String homepageId = driver.getWindowHandle();

        //yeni sekmeler olusturmak adina target =_blank 2 tanesine tiklayalim
        //sayfada yeni pencere acanlinkleri bulmak icin target =_blank attribute olan a link taglarini bulalim
        //                                         a[@target='_blank']

        List<WebElement> links = driver.findElements(By.xpath("//a[@target='_blank']"));

        System.out.println(links.size());
        links.get(0).click();
        links.get(1).click();

        Set<String> windows = driver.getWindowHandles(); //unig degerler set de saklanir.Iterate etmek icin id leri
        Iterator<String> it = windows.iterator();

        //gezinme islemi
        while(it.hasNext()) {
            //her bir gezilen id kullanilarak o anki sekmeye switch ediyoruz.
            driver.switchTo().window(it.next());

            //switch ettigimiz sayfanin ana sayfa olup olmadigini kontrol edelim.
            //eger anasayfa ise sekmeyi  kapatmiyoruz degilse kapatiyoruz.
            if(driver.getWindowHandle().equals(homepageId)){//anasayfa id si bulununca hemen dur diyoruz.
             continue;
            }
            driver.close();

        }
    }
}
