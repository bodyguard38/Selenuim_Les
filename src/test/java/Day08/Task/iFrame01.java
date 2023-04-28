package Day08.Task;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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

        driver.findElement(By.xpath("//a[@href=\"#nature\"]")).click();
        driver.switchTo().defaultContent();

        driver.findElement(By.id("text")).sendKeys("Wat een gezellige wereld");
        driver.findElement(By.id("smiles")).sendKeys("Ik ben blij");
        driver.findElement(By.id("nature")).sendKeys("Nederland");
        driver.findElement(By.id("food")).sendKeys("Turkse doner");
        driver.findElement(By.id("activities")).sendKeys("wandelen");
        driver.findElement(By.id("places")).sendKeys("Amsterdam");
        driver.findElement(By.id("objects")).sendKeys("klomp");
        driver.findElement(By.id("symbols")).sendKeys("Molen");
        driver.findElement(By.id("flags")).sendKeys("Nederlanse vlag");

        driver.findElement(By.id("send")).click();


    }

}
