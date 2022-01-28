package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeMoveToElement {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://ebay.com/");

        WebElement electronicsLinkMenu = driver.findElement(By.xpath("//li/a[text()='Electronics']"));
        WebElement cameraLink = driver.findElement(By.xpath("//li/a[contains(text(),'Cameras & Photo')]"));

        Actions actions = new Actions(driver);
        actions.moveToElement(electronicsLinkMenu).pause(1000).moveToElement(cameraLink).click().build().perform();

        //Thread.sleep(5000);


    }
}
