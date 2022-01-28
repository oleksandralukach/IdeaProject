package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDragAndDrop {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

        WebElement iframeEle = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
        driver.switchTo().frame(iframeEle);

        WebElement img1 = driver.findElement(By.xpath("//ul[@id='gallery']/li/h5[text()='High Tatras']"));
        WebElement trashArea = driver.findElement(By.id("trash"));

        // creating action class object to perform some keyboard actions
        Actions actions = new Actions(driver); //to build our action
        actions.dragAndDrop(img1,trashArea).build().perform();

    }
}
