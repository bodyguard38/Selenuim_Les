package Day03;

import org.junit.*;

public class C02_FirstTestClass {

    //TC001_Name testler icin isim atanabilir tertler alfabetik siraya gore calisir
    @Before
    public void beforeTestMethod(){
        System.out.println("\tbrowser acma konfigurasyonlari yapildi.");

    }
    @Test
    public void test01(){

        System.out.println("\t\tTest1 executed");

    }

    @Test
    public void test02(){

        System.out.println("\t\tTest2 executed");

    }
    @Ignore//test e eklendigi zaman o testi calistirmaz.
    @Test
    public void test03(){

        System.out.println("\t\tTest2 executed");

    }
    @After
    public void afterTestMethod(){
        System.out.println("\tBrowser imiz kapatildi");
    }
    @BeforeClass
    public static void beforeClassMethod(){
        System.out.println("Before class calisti");
    }
    @AfterClass
    public static void afterClassMethod(){
        System.out.println("After class calisti");
    }

}
