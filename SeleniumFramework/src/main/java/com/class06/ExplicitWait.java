package com.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ExplicitWait {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        //explicit wait syntax for Sel version < 4
        //create object of webdriverwait

        //"Hello world" element is present in the DOM but not visible
        // so selenium will wait till max 60 sec
        WebDriverWait wait = new WebDriverWait(driver,60);
        WebElement text = driver.findElement(By.xpath("//div[@id='finish']/h4"));

        //explicit wait syntax for Sel version < 4
        wait.until(ExpectedConditions.visibilityOf(text));

        System.out.println(text.getText());

        //Or short way:
//        WebElement submitButton = (new WebDriverWait(driver,10))
//                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("1111111")));
    }
}
