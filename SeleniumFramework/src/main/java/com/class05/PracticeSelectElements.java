package com.class05;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class PracticeSelectElements {
    //Draw a box with your cursor to select items. Hold down the Ctrl key to make multiple non-adjacent selections.
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/select-elements/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        Actions actions = new Actions(driver);
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class ='demo-frame lazyloaded']")));

        //want to drag from item 1 to item 5 and it's throwing me MoveTargetOutOfBoundsException
        //probably because item 5 is accessible only when we scroll down, but I thought whenever we provide locator
        //selenium will find it
        WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
        WebElement itemLast = driver.findElement(By.xpath("//li[text()='Item 5']"));

        //MoveTargetOutOfBoundsException:
        actions
                //Draw a box with your cursor to select items.
                .clickAndHold(item1)
                .pause(2000)
                .release(itemLast)
                .build().perform();

                //Hold down the Ctrl key to make multiple
//                .keyDown(Keys.CONTROL)
//                .click(item1)
//                .keyUp(Keys.CONTROL)
//                .keyDown(Keys.CONTROL)
//                .click(itemLast)
//                .keyUp(Keys.CONTROL)
//                .build().perform();

        driver.switchTo().defaultContent();
        driver.close();
    }
}