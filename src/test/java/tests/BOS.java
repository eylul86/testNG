package tests;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class BOS extends TestBaseBeforeMethodAfterMethod {



    @Test
    public void testamazon() {
        driver.get("https://amazon.com");


    }

    @Test
    public void testbestBuy() {

        driver.get("https://bestbuy.com");
    }

    @Test
    public void testtechpro() {

        driver.get("https://techproeducation.com");
    }
}

