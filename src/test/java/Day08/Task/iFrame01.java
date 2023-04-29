package Day08.Task;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class iFrame01 extends Base {
    /*
    https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/ sitesine gidiniz.
    Web sitesini maximize yapınız.
    İkinci emojiye tıklayınız.
    Tüm ikinci emoji öğelerine tıklayınız.
    Parent iframe geri dönünüz.
    Formu doldurun (Formu istediğiniz metinlerle doldurun) apply button’a basınız
     */
    @Test
    public void test(){

        driver.get(" https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");
        driver.manage().window().maximize();

        WebElement frame = driver.findElement(By.id("emoojis"));
        driver.switchTo().frame(frame);

        driver.findElement(By.xpath("(//span[@class=\"mdl-tabs__ripple-container mdl-js-ripple-effect\"])[2]")).click();

        List<WebElement> elements = driver.findElements(By.xpath("//div[@id=\"nature\"]//div"));

        elements.stream().forEach(WebElement::click);


       driver.switchTo().parentFrame();

        List<WebElement> textList = driver.findElements(By.xpath("//input[@class= 'mdl-textfield__input']"));

        List<String> text = new ArrayList<>(Arrays.asList("Bir", "iframe", "sorusu",
                "bu", "kadar", "eglenceli", "olabilir", "sizce de ", "oyle degil mi ?", "", ""));
        for (int i = 0; i < textList.size(); i++) {
            textList.get(i).sendKeys(text.get(i));
        }
       driver.findElement(By.id("send")).click();




    }

}
