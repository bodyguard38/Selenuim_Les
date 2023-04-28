package Day08.Task;

import Utilities.Base;
import org.junit.Test;

public class iFrame02 extends Base {
            /*
            Go to URL: http://demo.guru99.com/test/guru99home/
        Find the number of iframes on the page.
        Link to the fourth iframe (JMeter Made Easy) (https://www.guru99.com/live selenium project.html) click here.
        Exit the iframe and return to the main page.
             */

    @Test
    public void test(){
        driver.get("http://demo.guru99.com/test/guru99home/");

    }
}
