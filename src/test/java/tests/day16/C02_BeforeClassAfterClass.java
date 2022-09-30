package tests.day16;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeClassAfterClass;

public class C02_BeforeClassAfterClass extends TestBaseBeforeClassAfterClass {

    @Test
    public void amazontest() {
        driver.get("https://amazon.com");
    }

    @Test
    public void bestBuytest() {
        driver.get("https://bestbuy.com");
    }

    @Test
    public void techProtest() {
        driver.get("https://techproeducation.com");

        // @BeforeClass ve @AfterClass notasyonlarını
        // TestNG de kullanırken JUnit'teki gibi static yapmaya gerek yoktur
    }
}
