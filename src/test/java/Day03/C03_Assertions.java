package Day03;

import org.junit.Assert;
import org.junit.Test;

import static com.google.common.math.BigIntegerMath.divide;

public class C03_Assertions {

    public int divide(int a, int b){
        return a/b;
    }

        // divide diye bir fonksiyon var 2 parametre alir ilk parametreyi ikinciye boler. Bu method u bizim icin test eder misin?

        // Senaryo 1: Birbirine tam bolunen iki sayi methoda saglanirsa cikti bolumleri olmalidir. ORN divide(10,2) == 5

        // Senaryo 2: Birbirine tam bolunemeyen iki sayi methoda saglanirsa cikti virgullu sayi olmali? ORN: 5,2 == 2.5

        // Senaryo 3: Ikinci sayi sifir saglandiginda method -1 donmeli ORN: 9,0 == -1

    @Test
    public void scenario1(){
        int expected = 5;
        int actual = divide(10,2);
        //Assert.assertEquals() metodu kendisine gonderilen iki degerin esitligini kontrol eder
        // Expected == actual?
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void scenario2(){
        double expected = 2.5;
        int actual = divide(5,2);

        Assert.assertTrue(expected ==actual);
        //Assert true icerisine gonderilen boolean ifade true olursa test passed olur false olursa gecmez
    }



}
