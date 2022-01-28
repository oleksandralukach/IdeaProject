package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class HandlingMultipleWindows {
    public static void main(String[] args) {
        // Setting path to chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "src//main//resources//driver//chromedriver.exe");

        // Open the browser
        WebDriver driver = new ChromeDriver();

        // 1. To open url in browser
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");

        driver.manage().window().maximize();

        // Retrieve current window id (each window has an id)
        String currentWindowId = driver.getWindowHandle();
        System.out.println(currentWindowId);

        // Click on footer link - OrangeHRM
        WebElement linkToOrangeHrm = driver.findElement(By.xpath("//div[@id='footer']/div/a[text()='OrangeHRM, Inc']"));
        linkToOrangeHrm.click();

        // Retrieve list of open windows id
        Set<String> listOfWindows = driver.getWindowHandles(); //set of windows, no duplicates;

        //switching to new window
        for (String newWindow : listOfWindows) {
            if (!newWindow.equals(currentWindowId)) {
                driver.switchTo().window(newWindow);
            }
        }

        // Entering text
        WebElement emailInputBox = driver.findElement(By.id("myText"));
        emailInputBox.sendKeys("test@gmail.com");

        WebElement tryForFreeBtn = driver.findElement(By.id("linkadd"));
        tryForFreeBtn.click();

        //close the current window or tab
        driver.close();

        // Come back to original window
        driver.switchTo().window(currentWindowId);

        driver.close();
    }
}
