package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

//to read from properties file and return value from specified key ("browser" or "username")
public class ConfigReader {

    private static Properties properties;

    static {
        try {
            // open to read from properties file
            String path = "src/test/resources/config.properties";
            FileInputStream file = new FileInputStream(path);
            properties = new Properties();
            properties.load(file);
            file.close();
        } catch (IOException exception) {
            exception.printStackTrace();//print the message of exception
        }
    }

    public static String getProperty(String key){

        return properties.getProperty(key).trim(); //method of Property class that returns value specified with key
    }
}
