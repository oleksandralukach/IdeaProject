package com.class04;

import com.google.j2objc.annotations.Property;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class HomeWorkPractice {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://ebay.com/");

        // Inputting text into search box and clicking on search button:
        WebElement searchBox = driver.findElement(By.id("gh-ac"));
        searchBox.sendKeys("TV");
        WebElement searchBtn = driver.findElement(By.id("gh-btn"));
        searchBtn.click();

        // Clicking on first search result:
        WebElement firstSearchResult = driver.findElement(By.xpath("//li[@data-view=\"mi:1686|iid:1\"]//div[@class=\"s-item__info clearfix\"]/a"));
        firstSearchResult.click();

        // Switching to another open window:
        // (looking for its id by iterating through all open windows id and extracting not the original one)
        String originalWindowId = driver.getWindowHandle();
        Set<String> openWindowsIds = driver.getWindowHandles();
        for (String windowId : openWindowsIds) {
            if (!windowId.equals(originalWindowId)) {
                driver.switchTo().window(windowId);}}
        // Getting text from sellerInfo element:
        WebElement sellerInfo = driver.findElement(By.xpath("//span[@class='ux-textspans--PSEUDOLINK ux-textspans--BOLD']"));
        System.out.println(sellerInfo.getText());

        //closing first window we are on, then switching to original and closing it too:
        driver.close();
        driver.switchTo().window(originalWindowId);
        driver.close();
    }
}
