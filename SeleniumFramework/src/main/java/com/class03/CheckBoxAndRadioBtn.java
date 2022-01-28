package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxAndRadioBtn {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe"); //no .exe for mac
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/checkboxes");

        WebElement checkBox1 = driver.findElement(By.xpath("//form[@id=\"checkboxes\"]/input[1]"));
        checkBox1.click();
        WebElement checkBox2 = driver.findElement(By.xpath("//form[@id=\"checkboxes\"]/input[2]"));
        checkBox2.click();

        // to select both boxes in check box
        if(!checkBox1.isSelected()){
            checkBox1.click();
        }
        if (!checkBox2.isSelected()){
            checkBox2.click();
        }
    }
}
