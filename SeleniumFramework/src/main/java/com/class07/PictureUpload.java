package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class PictureUpload {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        //setting path to chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        //open the browser
        driver = new ChromeDriver();
        //open url in browser
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Test
    public void pictureUpload(){

        WebElement pictureUploadInput = driver.findElement(By.id("uploadPicture"));
        pictureUploadInput.sendKeys("C:\\Users\\Oleksanda\\IdeaProjects\\SeleniumFramework\\src\\main\\resources\\data\\picture.png");

        // to scroll down to click button:
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,500)");
        //js.executeScript("window.scrollBy(0,600)");

        WebElement pictureUploadBttn = driver.findElement(By.id("submit"));
        pictureUploadBttn.click();
    }
}
