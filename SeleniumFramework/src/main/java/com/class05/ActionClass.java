package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ActionClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://ebay.com/");

        WebElement signInLink = driver.findElement(By.xpath("//span[@id ='gh-ug']/a"));

        // creating action class object to perform some keyboard actions
        Actions actions = new Actions(driver); //to build our action
        actions.keyDown(Keys.CONTROL).click(signInLink).keyUp(Keys.CONTROL).build().perform(); //use build when we use multiple actions

    }
}
