package tests.day16;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C03_Priority extends TestBaseBeforeMethodAfterMethod {


    @Test (priority = 1)
    public void youtubetest() {
        driver.get("https://youtube.com");
    }

    @Test (priority =3)
    public void bestBuytest() {
        driver.get("https://bestbuy.com");
    }

    @Test (priority =2)
    public void amazontest() {
        driver.get("https://amazon.com");

    }
}/*
- @Test notasyonunun yanına (priority = sayı) yazarsak testlerin çalışma sırasını belirlemiş oluruz.
- Önce en küçük olan çalışır
- priority olarak herhangi bir sayı yazılmamışsa 0 olarak kabul edilir.
 */