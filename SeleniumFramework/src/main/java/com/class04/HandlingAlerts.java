package com.class04;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        //click on button to get java script alert
        WebElement jsAlertButtn = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
        jsAlertButtn.click();

        Alert alert = driver.switchTo().alert();
        alert.getText(); //retrieve text //1
        alert.sendKeys("Test input"); //2
        alert.accept(); //clicking on ok botton //3
        //alert.dismiss(); //clicking on cancel /we can not do both accept and dismiss //4

    }
}
