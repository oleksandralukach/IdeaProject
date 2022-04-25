package com.practice.sofia;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class JavaScriptExecutorPractice {

    WebDriver driver;

    @Before
    public void setUp() {
        //System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void etsyTest() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.location='https://www.etsy.com/'");

        WebElement signInButton = driver.findElement(By.cssSelector(".select-signin"));

        js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
                signInButton, "border: 2px solid green");

        js.executeScript("arguments[0].click()", signInButton);
        Thread.sleep(3000);

        Faker faker = new Faker();
        String fakeEmail = faker.internet().emailAddress();
        String fakePassword = faker.internet().password();

        //highlight email field
        js.executeScript("document.getElementById('join_neu_email_field').setAttribute('style',arguments[1]);", signInButton, "border: 2px solid green");
        Thread.sleep(2000);
        js.executeScript("document.getElementById('join_neu_email_field').value=arguments[0];", fakeEmail);

        js.executeScript("document.getElementById('join_neu_password_field').setAttribute('style',arguments[1]);", signInButton, "border: 2px solid green");
        Thread.sleep(2000);
        js.executeScript("document.getElementById('join_neu_password_field').value=arguments[0];", fakePassword);

        WebElement submitButton = driver.findElement(By.xpath("//button[@name='submit_attempt']"));
        js.executeScript("arguments[0].setAttribute('style',arguments[1]);", submitButton, "border:2px solid fuxia");
        js.executeScript("arguments[0].click();", submitButton);
        Thread.sleep(2000);


    }
}
