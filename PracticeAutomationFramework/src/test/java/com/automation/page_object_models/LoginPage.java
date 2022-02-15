package com.automation.page_object_models;

import com.automation.tests.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class LoginPage {

    //Why we can not just extend Hooks class here? And need to create constructor instead?
    //NullPointerException
    @FindBy(id = "username")
    WebElement userName;
    @FindBy(id = "password")
    WebElement password;
    @FindBy(id = "submit")
    WebElement loginBtn;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void doLogin(WebDriver driver)  {
        userName.sendKeys("test22.gmail.com");
        password.sendKeys("12345678Ab");
        loginBtn.click();
    }

    public void verifyLoginPage(WebDriver driver){
        Assert.assertTrue(userName.isDisplayed(), "Username input is not displayed");
        Assert.assertTrue(password.isDisplayed(), "Password input is not displayed");
    }

}
