package com.practice.sofia;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

//NoSuchAlertException

public class AlertsPractice {
    WebDriver driver;

    @Before
    public void setUp() {
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
    public void testSimpleAlert() {
        driver.navigate().to( "https://demoqa.com/alerts");
        WebElement alert1 = driver.findElement(By.id("alertButton"));
        alert1.click();

        //now alert is present on the screen
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        Assert.assertEquals("You clicked a button", alertText);

        //with simple alert we can only click ok
        alert.accept();

        WebElement alert2 = driver.findElement(By.id("timerAlertButton"));
        alert2.click();

        //it takes 5 sec to appear
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert();
        alert.accept();

    }

    @Test
    public void testPromp(){
        driver.navigate().to("https://demoqa.com/alerts");

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");

        driver.findElement(By.id("promtButton")).click();

        Alert alert = driver.switchTo().alert();

        //since its a promt alert I need to type here:
        String name = "Sofia";
        alert.sendKeys(name);
        alert.accept();

        WebElement result = driver.findElement(By.id("promptResult"));
        Assert.assertTrue(result.getText().contains(name));
    }
    @Test
    public void testConfirmationAlert(){
        driver.navigate().to("https://demoqa.com/alerts");
    driver.findElement(By.id("confirmButton")).click();

    Alert alert = driver.switchTo().alert();
    alert.dismiss();

    WebElement resultMessage = driver.findElement(By.id("confirmResult"));
    Assert.assertTrue(resultMessage.getText().endsWith("Cancel"));
    }
}

