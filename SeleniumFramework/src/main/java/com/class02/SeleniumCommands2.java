package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.Scanner;

public class SeleniumCommands2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Browser: ");
        String browser = s.nextLine();

        WebDriver driver;

        switch (browser) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "internet explorer":
                System.setProperty("webdriver.ie.driver", "src/main/resources/driver/IEDriverServer.exe");
                driver = new InternetExplorerDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.firefox.driver", "src/main/resources/driver/IEDriverServer.exe");
                driver = new FirefoxDriver();
                break;
            default:
                throw new RuntimeException("Your browser is not valid");
        }

        //System.setProperty("webdriver.safari.driver","/usr/bin/safaridriver"); for safari

        WebElement searchBox = driver.findElement(By.id("gh-ac"));
    }
}
