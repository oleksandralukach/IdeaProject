package com.practice.sofia;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

//NoSuchFrameException

public class IFramePractice {
    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void test1() {
        driver.navigate().to("https://demoqa.com/frames");

        //before checking if text1 is displayed first we need to switch to iframe that contains it
        //Option 1: switch to iframe by webelement
        WebElement iFrame = driver.findElement(By.id("frame1"));
        driver.switchTo().frame(iFrame);
        WebElement text1 = driver.findElement(By.id("sampleHeading"));
        Assert.assertTrue(text1.isDisplayed());

        //switch back to default html
        driver.switchTo().defaultContent();

        //Option 2: switch to iframe by id
        driver.switchTo().frame("frame2");
        WebElement text2 = driver.findElement(By.id("sampleHeading"));
        Assert.assertTrue(text2.isDisplayed());

        driver.switchTo().defaultContent();

        //Option 3: switch to iframe by index (starts from 0)
        driver.switchTo().frame(1);
//        WebElement text3 = driver.findElement(By.id("sampleHeading"));
//        Assert.assertTrue(text2.isDisplayed());
    }

    @Test
    public void test2() {
        driver.navigate().to("https://leetcode.com/");
        Actions actions = new Actions(driver);

        actions.moveToElement(driver.findElement(By.xpath("//div[@class='playground-demo']"))).perform();
        driver.switchTo().frame(0);

        WebElement runBtn = driver.findElement(By.cssSelector(".run-code-btn"));//button[contains(@class='btn-success')]
        runBtn.click();

        // WebDriverWait wait = new WebDriverWait(driver,5);
        WebElement runResultMessage = new WebDriverWait(driver, 7)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='success result']")));

        String text = runResultMessage.getText(); //finished in 88 ms
        System.out.println(text);

        String[] arr = text.split(" "); // = String[] arr = {finished, in, 88, ms}
        for (String word : arr) { //split method returns array of strings by splitting around regex
            if (Character.isDigit(word.charAt(0))) {
                int ms = Integer.parseInt(word);
                Assert.assertTrue(ms < 5);
            }
        }
    }

    @Test
    public void testNestedIFrames() throws InterruptedException {
        driver.navigate().to("https://demoqa.com/nestedframes");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");

        Thread.sleep(3000);
        WebElement parentFrame = driver.findElement(By.id("frame1"));
        driver.switchTo().frame(parentFrame);

        driver.switchTo().frame(0);
        //verify child iframe:
        WebElement textChildFrame = driver.findElement(By.xpath("//p[text()='Child Iframe']"));

        Assert.assertEquals("Child Iframe", textChildFrame.getText());

        driver.switchTo().parentFrame();
        WebElement textParentFrame = driver.findElement(By.xpath("//body[text()='Parent frame']"));
        Assert.assertEquals("Parent frame", textParentFrame.getText());

        driver.switchTo().defaultContent();
        WebElement textDefaultFrame = driver.findElement(By.xpath("//div[contains(text(),'Sample')]"));
        Assert.assertTrue("No",textDefaultFrame.getText().contains("Sample Nested Iframe page."));
    }
}
