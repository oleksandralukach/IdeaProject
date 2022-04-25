package com.automation.stepdef;

import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Assume;
import org.junit.Before;


public class Hooks {
    @Before
    public void setUp(){} //will execute before each scenario

    @Before("@skip_scenario")
    public void skip_scenario(Scenario scenario){
        System.out.println("SKIP SCENARIO: " + scenario.getName());
        Assume.assumeTrue(false);}

    @After
    public void cleanUp(){} //will execute after each scenario

    //@BeforeMethod
   //@BeforeClass
}
