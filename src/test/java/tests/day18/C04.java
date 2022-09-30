package tests.day18;

import org.testng.annotations.Test;
import pages.HmcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C04 {


    @Test
    public void test01() {



    //    Bir Class olustur : PositiveTest
    //    2) Bir test method olustur positiveLoginTest()  https://www.hotelmycamp.com/ adresine git  login butonuna bas

        Driver.getDriver().get(ConfigReader.getProperties("hmcUrl"));
        HmcPage hmcPage=new HmcPage();
        hmcPage.login.click();

    //    test data username: manager ,  test data password : Manager1!
      hmcPage.userName.sendKeys("manager");
     hmcPage.login.click();

    //      Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
    }
}
