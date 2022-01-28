package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;

public class PracticeReOrderElementsActions {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/sorting/");

        Actions actions = new Actions(driver);
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class ='demo-frame lazyloaded']")));

        WebElement shoppingElement = driver.findElement(By.xpath("//div[text()='Shopping']"));
        WebElement feedsElement = driver.findElement(By.xpath("//div[text()='Feeds']"));

        actions.clickAndHold(shoppingElement).release(feedsElement).pause(1000).build().perform();//dragAndDrop works the same

        driver.switchTo().defaultContent();
        driver.close();

    }
}
