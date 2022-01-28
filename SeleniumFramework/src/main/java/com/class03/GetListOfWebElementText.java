package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.List;

public class GetListOfWebElementText {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.manage().window().maximize();

        //Login
        //Getting element username and inputting Username:
        driver.findElement(By.id("txt.Username")).sendKeys("Admin");
        //Getting element password and inputting Password:
        driver.findElement(By.id("password")).sendKeys("admin123");
        //Getting element login button and clicking:
        driver.findElement(By.id("btnLogin")).click();

        Thread.sleep(5000);

        WebElement adminMenu = driver.findElement(By.id("menu_admin_viewAdminModule"));
        WebElement jobMenuEle = driver.findElement(By.id("menu_admin_Job"));
        Actions action = new Actions(driver);
        action.moveToElement(adminMenu).moveToElement(jobMenuEle).build().perform();

        // Creating a list of elements from element Job DropDown:
        List<WebElement> listOfJobDropDown = driver.findElements(By.xpath("//li/a[@id =\"menu_admin_Job\"]/following-sibling::ul/li"));
        for(WebElement jobMenu: listOfJobDropDown){
            System.out.println(jobMenu.getText());
        }

    }
}
