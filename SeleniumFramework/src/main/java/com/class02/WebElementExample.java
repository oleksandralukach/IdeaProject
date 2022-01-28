package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementExample {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");

        //by is a class of selenium, and it has static methods:
        //WebElement is a class in a selenium/object of webElement
        //element belongs to browser and attribute belongs to an element
        WebElement searchBox = driver.findElement(By.id("gh-ac"));//creating object of webElement by findelement() mrthod
        WebElement searchButton = driver.findElement(By.id("gh-btn"));

        // Type something in an input element:
        searchBox.sendKeys("TV");

        // Get text inside the element by .getAttribute(placeholder):
        String text = searchBox.getAttribute("placeholder");//placeholder - text inside the tag vs between the tags - text
        System.out.println(text);

        //Click on button:
        searchButton.submit();//when we have a type submit we can use method submit() for clicking
        //or searchButton.click();

        // Get/retrieve text inside footer:
        WebElement footerText = driver.findElement(By.xpath("//td[@class='gf-legal']"));
        System.out.println(footerText.getText());
    }
}
