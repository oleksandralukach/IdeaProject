package utilities;

import org.openqa.selenium.WebDriver;

public class Driver {

    public static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null){
            switch (ConfigReader.getProperty("browser").toLowerCase().trim()){
                case "chrome":
                    driver =
            }
        }
    }
}
