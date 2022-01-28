package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

//Drag and drop all 4 images into trash area
public class PracticeDragAndDrop {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

       //1.Switching to iframe:
        WebElement iframe = driver.findElement(By.xpath("//iframe[@class ='demo-frame lazyloaded']"));
        driver.switchTo().frame(iframe);

       //2. Creating "trash" web element and list of images:
        WebElement trash = driver.findElement(By.id("trash"));
        List<WebElement> webElementList = driver.findElements(By.xpath("//ul[@id='gallery']/li"));
        //3.Creating Actions class object to perform some drag and drop actions with keyboard/mouse
        Actions actions = new Actions(driver);

        //4.Iterating through all images and one by one dropping it in trash web element
        for (WebElement element : webElementList){
           actions.dragAndDrop(element,trash).build().perform();
           Thread.sleep(1000);
       }

        driver.switchTo().defaultContent();
        driver.close();

    }
}
