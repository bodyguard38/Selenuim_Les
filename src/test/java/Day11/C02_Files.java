package Day11;

import Utilities.Base;
import org.junit.Test;

public class C02_Files {
    @Test
    public void files(){
        // Dosya ayiraci: Windows icin '\' - mac icin '/'

        String fileSeparator = System.getProperty("file.separator");
        System.out.println("fileSeparator = " + fileSeparator);

        // Calisma ortami (Projenin content rootu)

        String project = System.getProperty("user.dir");
        System.out.println("project = " + project);

        //Home path
        String home = System.getProperty("user.home");
        System.out.println("home = " + home);
    }

}
