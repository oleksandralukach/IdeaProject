package com.automation.page_object_models;

import com.automation.tests.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage extends Hooks {
    WebDriver driver;

    @FindBy(className = "user-avatar rounded-circle")
    WebElement profileIcon;
    @FindBy(xpath = "//div[@class = \"user-menu dropdown-menu show\"]/a[3]")
    WebElement logoutBtn;
    @FindBy(xpath = "//a[@class=\"navbar-brand\"]/img")
    WebElement homePageLogo;
    String currentUrl;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void verifyHomepage(WebDriver driver) {
        Assert.assertTrue(homePageLogo.isDisplayed(), "Logo is missing from homepage");
//        currentUrl = driver.getCurrentUrl();
//        Assert.assertTrue(currentUrl.equals("http://3.129.60.236:8080/bank/home"), "Not a Home Page");
    }

    public void clickOnProfileIcon() {
        profileIcon.click();
    }

    public void clickOnLogoutBtn() {
        logoutBtn.click();
    }

}
