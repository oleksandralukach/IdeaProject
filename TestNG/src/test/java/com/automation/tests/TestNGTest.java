package com.automation.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGTest {

    @Test(groups = {"@Smoke"})
    public void firstTest(){
        System.out.println("Test #1");
    }
    @Test
    public void secondTest(){
        System.out.println("Test #2");
    }

    @BeforeMethod
    public void setUp(){
        System.out.println("Before");
    }
    @AfterMethod
    public void cleanUp(){
        System.out.println("After");
    }
}
