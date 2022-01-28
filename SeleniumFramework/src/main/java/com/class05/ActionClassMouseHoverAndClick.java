package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassMouseHoverAndClick {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        //Login
        //Getting element username and inputting Username:
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        //Getting element password and inputting Password:
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        //Getting element login button and clicking:
        driver.findElement(By.id("btnLogin")).click();

        // creating webElements
        WebElement adminMenu = driver.findElement(By.id("menu_admin_viewAdminModule"));
        WebElement jobMenu = driver.findElement(By.id("menu_admin_Job"));
        WebElement jobTitle = driver.findElement(By.id("menu_admin_viewJobTitleList"));

        // creating action class object to perform some keyboard actions
        Actions actions = new Actions(driver); //to build our action
        //Its best paractice to use .build() as it 'll build sequence of action into single
        actions.moveToElement(adminMenu).moveToElement(jobMenu).moveToElement(jobTitle).build().perform();
    }
}
