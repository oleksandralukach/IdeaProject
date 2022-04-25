package com.automation.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {

    //data provider gives us opportunity to execute test with different set of data
    //we use dataProvider for functionality that require not more than 10 fields(pieces of info)
    //if more than 10 we use external files like xml Apache POI - java library to read and write from and to xml
    @DataProvider(name = "prerequisitedData")
    public static Object[][] data(){
        return new Object[][]{
                {"johndoe@gmail.com", "hardcode", true},
                {"log", "chicago123", false}};
    }

    @Test(dataProvider = "prerequisitedData") //it will be executed the amount of outer array (2)
    //param data should be able to get values from inner arrays in the same order
    public static void test1(String login, String password, Boolean result){
        System.out.println("Test: " + login + " " + password + " " + result);
    }
}
