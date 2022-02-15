package com.automation.tests;

import org.testng.annotations.Test;

public class LogoutTest extends Hooks {

    @Test
    public void verifyUserLogout() {
        homePage.verifyHomepage(driver);
        homePage.clickOnProfileIcon();
        homePage.clickOnLogoutBtn();
        loginPage.verifyLoginPage(driver);
    }
}
