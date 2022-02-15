package utilities;

import org.openqa.selenium.WebDriver;

public class Driver {

    public static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            switch (ConfigReader.getProperty("browser").toLowerCase().trim()) {
                case "chrome":
                    driver = ChromeWebDriver.loadChromeDriver();
                    break;
            }
        }
        return driver;
    }

    public static void closeDriver() {
        try {
            if (driver != null) {
                driver.close();
                //   driver.quit();
                driver = null;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
