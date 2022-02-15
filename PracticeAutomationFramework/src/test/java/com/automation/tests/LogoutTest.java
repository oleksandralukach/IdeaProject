package com.automation.tests;

import org.testng.annotations.Test;

public class LogoutTest extends Hooks {

    @Test
    public void verifyUserLogout() {
        loginPage.doLogin();
        homePage.verifyHomepage();
        homePage.clickOnProfileIcon();
        homePage.clickOnLogoutBtn();
        loginPage.verifyLoginPage();
    }
}
