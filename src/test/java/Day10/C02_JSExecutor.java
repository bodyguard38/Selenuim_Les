package Day10;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class C02_JSExecutor extends Base {

    @Test
    public void jsexecutor(){

        driver.get("https://www.amazon.com/");

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        //jse.executeScript("alert(\"Merhaba Dünya!\");");

        //id = twotabsearchtextbox

        // jse.executeScript("console.log(\"JS kullanarak konsola siziyoruz\");");

        jse.executeScript("document.getElementById(\"twotabsearchtextbox\").style.backgroundColor = \"red\"");

    }

    @Test
    public void scrollWithJs(){
        driver.get("https://www.amazon.com/");
        JavascriptExecutor jse = (JavascriptExecutor)driver;

        jse.executeScript("window.scrollBy(0, 800);");//sayfada 800 px asagi indik

        jse.executeScript("window.scrollTo(0,0)");//sayfamizin 0,0 noktasina scrol yaptik
        jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");//sayfamizin sonuna scroll yaptik

        jse.executeScript("arguments[0].scrollIntoView()",driver.findElement(By.id("gw-sign-in-button")));
        //belirttigimiz element gorunur olana kadar scroll yapacagiz


    }
}
