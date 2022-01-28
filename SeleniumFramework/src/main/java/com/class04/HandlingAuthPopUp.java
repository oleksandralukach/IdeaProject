package com.class04;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAuthPopUp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        //appending url
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

        driver.manage().window().maximize();
    }
}
