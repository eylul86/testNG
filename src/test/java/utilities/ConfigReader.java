package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {


    public  static Properties properties;
    static{

        String dosyaYolu="configuration.properties";

        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
            properties = new Properties();
            properties.load(fis); //fısın okudugu bılgılerı properties e yukledı

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }






    public static String getProperties(String key){
        /*
Test methodundan yolladigimiz String key degerini alip properties classindan
getProperty() methodunu kullanarak bu key'e ait value'yu bize getirir
 */

        return properties.getProperty(key);
    }

}