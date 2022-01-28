package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeDraggableBoxes {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/draggableboxes/");

        driver.manage().window().maximize();

        Actions actions = new Actions(driver);
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class ='demo-frame lazyloaded']")));

        WebElement dragElement = driver.findElement(By.xpath("//div/p[text()='Drag me around']"));
        WebElement spotToDrag = driver.findElement(By.xpath("//div[@class='demo-description']"));

        actions
                .clickAndHold(dragElement)
                .moveByOffset(50, 150)
                .pause(1000)
                .release()
                .build().perform();

        driver.close();


    }
}
