package com.automation.tests;

import com.automation.page_object_models.HomePage;
import com.automation.page_object_models.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class Hooks {

    public WebDriver driver;
    public LoginPage loginPage;
    public HomePage homePage;
    public WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://3.129.60.236:8080/bank/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver,60);
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
    }

    @AfterMethod
    public void tearUp() {
        driver.quit();
    }
}
