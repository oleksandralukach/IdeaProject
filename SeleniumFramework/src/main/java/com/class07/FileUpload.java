package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUpload {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        //setting path to chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        //open the browser
        driver = new ChromeDriver();
        //open url in browser
        driver.get("http://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();

    }

    @Test
    public void fileUpload() {
        WebElement fileUploadInput = driver.findElement(By.id("file-upload"));
        fileUploadInput.sendKeys("C:\\Users\\Oleksanda\\IdeaProjects\\SeleniumFramework\\src\\main\\resources\\data\\fileUpload.txt");

        WebElement fileUploadButton = driver.findElement(By.id("file-submit"));
        fileUploadButton.click();
    }
}