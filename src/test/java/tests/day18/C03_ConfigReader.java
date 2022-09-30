package tests.day18;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_ConfigReader {


    @Test
    public void test01() {
        String urlamzn= ConfigReader.getProperties("amznUrl");
        String urlFace= ConfigReader.getProperties("faceUrl");

        Driver.getDriver().get(urlamzn);
        Driver.getDriver().get(urlFace);
        Driver.closeDriver();




    }
}
