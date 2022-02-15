package com.automation.tests;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class LoginTest extends Hooks{

    @Test
    public void verifyUserCanLogin() {
        loginPage.verifyLoginPage();
        loginPage.doLogin();
        homePage.verifyHomepage();
    }
}
