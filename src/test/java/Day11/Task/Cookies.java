package Day11.Task;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.Cookie;

import java.util.Iterator;
import java.util.Set;

public class Cookies extends Base {
    /*
    Go to URL: http://facebook.com
    getCookies,
    addCookie,
    deleteCookieNamed,
    deleteAllCookies.
     */
    @Test
    public void printCookies(){

        Set<Cookie> cookies = driver.manage().getCookies();
        Iterator<Cookie> it = cookies.iterator();

        while (it.hasNext()) {
            Cookie currentCookie = it.next();

            String name = currentCookie.getName();
            String value = currentCookie.getValue();

            System.out.println("name :"+name+" value :"+value);
        }
        System.out.println("\n");
    }

    //addcookie
    @Test
    public void Test(){

        driver.get("http://facebook.com/");

        printCookies();

        System.out.println("Cookies added.....");
        Cookie cookie = new Cookie("ahmet","bayram");
        Cookie cookie1 = new Cookie("Halide","Edip");
        driver.manage().addCookie(cookie1);
        driver.manage().addCookie(cookie);

        printCookies();

        driver.manage().deleteCookieNamed("ahmet");
        System.out.println("Cookies deleted with name.....");
        printCookies();

        driver.manage().deleteAllCookies();
        System.out.println("Cookies all deleted.....");
        printCookies();

    }
}
