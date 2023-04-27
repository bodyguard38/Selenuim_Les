package Day09;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.WindowType;

public class C02_WindowHandle extends Base {
    @Test
    public void test01(){
        // 1- browser ac
        // 2- yeni sekme olustur
        // 3- yeni pencere olustur
        // 4- 2. sekmede https://www.linkedin.com/ ac
        // 5- son pencerede https://opensource-demo.orangehrmlive.com/web/index.php/auth/login sitesini ac
        // 6- Ilk sekmede https://www.amazon.com/ ac
        // ilk acilan sekmeden 2. ye gecmeden windowhande degerin isakliyoruz

       String firstTab = driver.getWindowHandle();

       driver.switchTo().newWindow(WindowType.TAB);
       String secondTab = driver.getWindowHandle();

       driver.switchTo().newWindow(WindowType.WINDOW);
       String thirdWindow = driver.getWindowHandle();

       driver.switchTo().window(secondTab);//2. sekmeye gecis yapildi
       driver.get("https://www.linkedin.com/");

       driver.switchTo().window(thirdWindow);
       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.switchTo().window(firstTab);
        driver.get("https://www.amazon.com/");


    }
}
