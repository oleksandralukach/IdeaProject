package com.practice.sofia;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.mockito.Mock;

public class ActionPracticeClass {

    WebDriver driver;

    @Before
    public void setUp() {
        //System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
//        SoftAssert softAssert = new SoftAssert();
//        softAssert.fail();
        //@Mock annotation is used to create the mock object to be injected
        @Mock

    }

    @After
    public void tearDown() {
        driver.close();
    }

    //doubleClick() and contextClick()
    @Test
    public void test1() {
        driver.navigate().to("///");
        WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));
        WebElement rightClickButton = driver.findElement(By.id("rightClickBtn"));

        Actions actions = new Actions(driver);

        //1
        actions.doubleClick(doubleClickButton).contextClick(rightClickButton).perform();
        WebElement doubleClickMessage = driver.findElement(By.id("doubleClickMessage"));
        Assert.assertTrue(doubleClickMessage.isDisplayed());

        //2
        //actions.contextClick(rightClickButton).perform();- instead we are adding it to line 39
        WebElement rightClickMessage = driver.findElement(By.id("rightClickMessage"));
        Assert.assertTrue(rightClickMessage.isDisplayed());
    }

    @Test
    public void test2() {
        // test if text is displayed when we hover over the element 9we can not locate that text,
        // but new attribute appearing
        driver.navigate().to("///");
        WebElement greenButton = driver.findElement(By.id("toolTipButton"));

        Actions actions = new Actions(driver);
        actions.moveToElement(greenButton).perform();

        WebDriverWait wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.attributeToBe(greenButton, "area-describedBy", "buttonToolTip"));

        //verify my greenButton has an attribute of the text after we're hovering over it
        Assert.assertTrue("ToolTip is not displayed",
                greenButton.getAttribute("area-describedBy").equals("buttonToolTip"));
    }

    //slider (slide to the right and to the left
    @Test
    public void test3() {
        driver.navigate().to("///");
        WebElement sliderCircle = driver.findElement(By.xpath("//input[@min=0]"));
        Actions actions = new Actions(driver);

        actions.clickAndHold(sliderCircle).moveByOffset(30, 0).release().perform();

        //verify that attribute with the value will change (which represent position)

        int newSliderValue = Integer.parseInt(sliderCircle.getAttribute("value")); //which will give number of value

        Assert.assertTrue(newSliderValue > 25);//25 was default value
    }

    //dragAndDrop() 1.
    @Test
    public void test4() {
        driver.navigate().to("///");

        //1. use built into selenium method
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.xpath("//div[@id='']/div[@id='droppable']"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(source, target).perform();

        //locating child element through existing one:
        WebElement successfulDrop = target.findElement(By.xpath("./p"));

        Assert.assertTrue(successfulDrop.getText().equals("Dropped"));
    }

    //dragAndDrop() 2.
    @Test
    public void test5() {
        driver.navigate().to("///");

        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.xpath("//div[@id='']/div[@id='droppable']"));

        Actions actions = new Actions(driver);

        //2:with clickAndHold().release()
        //actions.clickAndHold(source).moveToElement(target).release().perform();

        //3:with clickAndHold().moveByOffset()
        actions.clickAndHold(source).moveByOffset(220, 20).release().perform();

        //locating child element through existing one:
        WebElement successfulDrop = target.findElement(By.xpath("./p"));

        Assert.assertTrue(successfulDrop.getText().equals("Dropped"));
    }

    @Test
    public void test6() {
        driver.navigate().to("https://demoqa.com/progress-bar");

        WebElement startButton = driver.findElement(By.id("startStopButton"));
        startButton.click();

        WebElement progressBar = driver.findElement(By.xpath("//div[@role='progressbar]"));

        new WebDriverWait(driver, 15)
                .until(ExpectedConditions.attributeToBe(progressBar, "aria-valuenow", "100"));

        WebElement resetButton = driver.findElement(By.id("resetButton"));
        Assert.assertTrue(startButton.getText().equals("Reset"));
        startButton.click();

        Assert.assertTrue(progressBar.getAttribute("aria-valuenow").equals("0"));
    }

    @Test
    public void test7() {
        driver.navigate().to("https://demoqa.com/menu");
        WebElement mainItem2 = driver.findElement(By.xpath("//a[text() ='Main Item 2']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(mainItem2).perform();

        WebElement subMenu = driver.findElement(By.xpath("//a[text() ='SUB SUB LIST »'"));
        actions.moveToElement(subMenu).perform();
        WebElement subMenuItem1 = driver.findElement(By.xpath("//a[text() ='Sub Sub Item 1'"));
        actions.moveToElement(subMenuItem1).perform();
    }

    @Test
    public void test8() throws InterruptedException {
        driver.navigate().to("https://demoqa.com/automation-practice-form");
        WebElement firstNameField = driver.findElement(By.id("firstName"));
        WebElement lastNameField = driver.findElement(By.id("lastName"));

        //highlight(firstNameField);
        Faker faker = new Faker();
        firstNameField.sendKeys(faker.funnyName().name());

        // copy/paste action
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();

        Thread.sleep(3000);
        //highlight(lastNameField);
        actions.sendKeys(Keys.TAB).perform(); //to switch to next input field
        actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();

        Assert.assertTrue(firstNameField.getAttribute("value").equals(lastNameField.getAttribute("value")));

    }

    @Test
    public void test9() throws InterruptedException {
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers#");
        WebElement login = driver.findElement(By.id("txtUsername"));
        login.sendKeys("Admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("admin123");

        WebElement submitButton = driver.findElement(By.id("btnLogin"));
        submitButton.click();

        Thread.sleep(1000);

        try {
            WebElement assignLeaveIcon = driver.findElement(By.xpath("//span[text()='Assign Leave']/.."));
            assignLeaveIcon.click();
        } catch (Exception e) {
            WebElement dashBoardMenuIcon = driver.findElement(By.id("menu_dashboard_index"));
            dashBoardMenuIcon.click();
            WebElement assignLeaveIcon = driver.findElement(By.xpath("//span[text()='Assign Leave']/.."));
            assignLeaveIcon.click();
        }

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement nameInputField = driver.findElement(By.id("assignleave_txtEmployee_empName"));
        js.executeScript("arguments[0].setAttribute('style',arguments[1]);", nameInputField, "border:4px solid red");
        Thread.sleep(4000);
        nameInputField.sendKeys("jo");

        Actions actions = new Actions(driver);

        WebElement inputName = driver.findElement(By.xpath("//div[@class='ac_results'][2]//li[contains(text(),' Mathews')]"));
      actions.moveToElement(inputName).perform();
      Thread.sleep(2000);
        System.out.println(inputName.getText());
        js.executeScript("arguments[0].click();", inputName);

        Thread.sleep(2000);

        WebElement dropdownLeaveType = driver.findElement(By.id("assignleave_txtLeaveType"));
        js.executeScript("arguments[0].setAttribute('style',arguments[1]);", dropdownLeaveType, "border:2px solid fuxia");
        Thread.sleep(4000);
        Select selectLeaveType = new Select(dropdownLeaveType);
        selectLeaveType.selectByValue("10");

        WebElement calendarIcon = driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']"));
        js.executeScript("arguments[0].setAttribute('style',arguments[1]);", calendarIcon, "border:2px solid fuxia");
        Thread.sleep(4000);
        calendarIcon.click();

        WebElement datePicker = driver.findElement(By.xpath("//a[text()='29']"));
        datePicker.click();

        WebElement assignButton = driver.findElement(By.id("assignBtn"));
        assignButton.click();

        Thread.sleep(2000);

        WebElement modalWindow = driver.findElement(By.id("leaveBalanceConfirm"));
        Assert.assertTrue(modalWindow.isDisplayed());

    }
}
