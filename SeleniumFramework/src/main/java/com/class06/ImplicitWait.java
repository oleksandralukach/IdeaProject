package com.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWait {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");

        driver.manage().window().maximize();

        //if the element not present in the DOM than implicit wait will
        //If element will be present in DOM but not visible than
        //selenium version < 4
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

//        //selenium version >= 4
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        WebElement startbtn = driver.findElement(By.xpath("//div[@id='start']/button"));
        startbtn.click();

        // Static - not recommended
        //Thread.sleep(5000);

        //Hello world element is not present in the DOM so selenium will wait till max 60 sec
        WebElement text = driver.findElement(By.xpath("//div[@id='finish']/h4"));
        System.out.println(text.getText());
    }
}
