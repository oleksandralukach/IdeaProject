package com.automation.tests;

import org.testng.annotations.Test;

public class LoginTest extends Hooks{

    @Test
    public void verifyUserCanLogin() {
        loginPage.verifyLoginPage(driver);
        loginPage.doLogin(driver);
        wait.until()
        homePage.verifyHomepage(driver);
    }
}
