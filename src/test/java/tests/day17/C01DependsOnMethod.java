package tests.day17;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C01DependsOnMethod extends TestBaseBeforeMethodAfterMethod {
    @Test
    public void test01() {
        driver.get("https://amazon.com");
    }

    @Test (dependsOnMethods = "test01")
    public void test02() {
        driver.get("https://facebook.com");
    }

    @Test (dependsOnMethods = "test02")
    public void test03() {
        driver.get("https://bestbuy.com");
    }

    @Test (priority = -1)
    public void test04() {
        driver.get("https://youtube.com");
    }
}
// Hard Assertions : JUNit'te öğrendiğimiz assertion ile aynıdır.  Assert.assertTrue();  Assert.assertFalse();  Assert.assertEquals();
// Hard Assertions'da herhangi bir assertion failed olursa, test method'un çalışmasını durdurur ve kalan kodları yürütmez.(stop execution)

// Soft Assert : Kullanabilmek için obje oluştururuz, oluşturduktan sonra obje ismi ile kullanırız, Herhangi bir hata verdiğinde test methodu
// çalışmaya devam eder, en sonra rapor verir.    baslangıc  SoftAssert objeadı=new SoftAssert();  bitis objeadı.assertAll();