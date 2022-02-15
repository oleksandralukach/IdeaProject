package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;

// to set up the driver
public class ChromeWebDriver {

    public static WebDriver loadChromeDriver() {

        //setting driver to open certain browser:
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-extensions");
        options.addArguments("--window-size=1920,1080");

        //headless we don't see how test executes
        if (ConfigReader.getProperty("headless").equalsIgnoreCase("true")) {
            options.addArguments("--headless");
        }

        //these are extra options, please research them for the next class
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-gpu");

        //open the browser:
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        return driver;
    }
}

