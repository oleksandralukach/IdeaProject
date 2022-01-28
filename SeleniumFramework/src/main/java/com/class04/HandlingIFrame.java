package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingIFrame {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/iframe");

        // switch to iframe, to go inside(page within a page:
        WebElement iframeE = driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(iframeE);

        // entering text inside the iframe
        WebElement textBox = driver.findElement(By.xpath( "//body[@id = 'tinymce']/p"));
        textBox.sendKeys("Alex Lukach");

        // switch to main page again:
        driver.switchTo().defaultContent();

        // interacting with main page
        WebElement titleText = driver.findElement(By.xpath("//div[@class='example']/h3"));
        System.out.println(titleText.getText()); //printing the text
    }
}
