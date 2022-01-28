package com.automation.stepdef;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Hooks {
    @Before
    public void setUp(){} //will execute before each scenario
    @After
    public void cleanUp(){} //will execute after each scenario

    //@BeforeMethod
   //@BeforeClass
}
