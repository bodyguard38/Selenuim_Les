package Day06;

import com.github.javafaker.Faker;
import org.junit.Test;

public class C05_Fakers {
    @Test
    public void FakerUsage(){

        Faker faker = new Faker();

        String isim = faker.name().nameWithMiddle();
        String adres = faker.address().city();
        String phoneNumber = faker.phoneNumber().phoneNumber();

        System.out.println(isim);
        System.out.println(adres);
        System.out.println(phoneNumber);
    }
}
