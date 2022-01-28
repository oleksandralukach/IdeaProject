package com.class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasicCommands {
    public static void main(String[] args) {

        // 1. Setting path to chromedriver.exe first(give path to driver/ set properties)
       // System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        WebDriverManager.chromedriver().setup(); //instead, no need to import the drivers too
        // 2. Open the browser (build driver object/browser will open)/this property will be used in chromedriver
        WebDriver driver = new ChromeDriver();// interface webdriver - child class implement/ parent class reference- child class object

        // - To open url in browser using driver to open website
        driver.get("https://www.google.com/");

        // - Maximize
        driver.manage().window().maximize();

        // - delete cookies(info stored in your browser like when you visited, who you are etc.)
        driver.manage().deleteAllCookies(); //only when driver is open

        //close the browser
        driver.close();

        //we are using web elements
        //full browser is a driver
        // each part of browser is web element
    }
}
