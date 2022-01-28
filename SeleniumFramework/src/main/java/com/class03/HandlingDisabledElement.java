package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDisabledElement {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/sch/ebayadvsearch");
        WebElement checkBox1 = driver.findElement(By.id("LH_TitleDesc"));
        WebElement checkBox2 = driver.findElement(By.id("LH_Complete"));
        WebElement checkBox3 = driver.findElement(By.id("LH_Sold"));

        checkBox1.click();
        //check if element displayed on a webpage or not
        System.out.println(checkBox1.isDisplayed()); // all displayed
        System.out.println(checkBox2.isDisplayed());
        System.out.println(checkBox3.isDisplayed());

        //check if element is enabled
        System.out.println(checkBox1.isEnabled()); //just first is enabled as is clicked
        System.out.println(checkBox2.isEnabled()); // false
        System.out.println(checkBox3.isEnabled()); // false

        //check if element is selected
        System.out.println(checkBox1.isSelected()); // true
        System.out.println(checkBox2.isSelected()); // false
        System.out.println(checkBox3.isSelected()); // false


    }
}
