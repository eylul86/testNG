package tests.day18;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;

public class C01 {



  //


    @Test
    public void test01() {
//https://www.facebook.com/ adresine gidin
        Driver.getDriver().get("https://www.facebook.com/");
        //POM’a uygun olarak email, sifre kutularini ve giris yap
        FacebookPage facebookPage = new FacebookPage();
        Faker faker = new Faker();

        //butonunu locate edin
        //Faker class’ini kullanarak email ve sifre degerlerini
        facebookPage.email.sendKeys(faker.internet().emailAddress());
        facebookPage.sifre.sendKeys(faker.internet().password());
        //yazdirip, giris butonuna basin

        facebookPage.login.click();
        //Basarili giris yapilamadigini test edin
        Assert.assertTrue(facebookPage.girisYapilamadi.isDisplayed());

    }
}
