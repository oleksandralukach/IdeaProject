package class_3;

import class_2.Calculator;
import empty_categories_classes.AlexCategory;
import empty_categories_classes.NataliaCategory;
import empty_categories_classes.SmokeCategory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 *  Test cases for calculator
 *
 So we can run this tests manually in a class we created it. All together or one by one
 Or we can do it by calling them from another class/package as well
 */

public class CalculatorDivMethodTest {

    // first create object of a class we are testing // declaration
    Calculator c;

    // Pre-condition
    @Before
    public void setUp() {
        // initialization
        c = new Calculator();
    }

    // When we use @Test then it'll become test cases otherwise it'll be only java methods
    @Test
    @Category({AlexCategory.class})
    public void verifyPositiveEqualNumber() {

        double actResult = c.div(10, 10); // actual result
        double expResult = 1; //mock data

        // deprecated -> no longer in use
        //Assert.assertEquals(expResult,actResult,0); // delta - after decimal

        Assert.assertTrue("Test Failed. Expected was " + expResult + ": Actual " + actResult, actResult == expResult);
   //(1, c.div(10,10), 1 == c.div(10,10));
        System.out.println("Test passed");
    }

    @Test
    @Category({AlexCategory.class, SmokeCategory.class})
    public void verifyPositiveFirstSmallerNumber() {

        double actResult = c.div(10, 20);
        double expResult = 0.5;

        Assert.assertTrue("Test Failed. Expected was " + expResult + ": Actual " + actResult, actResult == expResult);
        System.out.println("Test passed");
    }

    @Test
    @Category(NataliaCategory.class)
    public void verifyPositiveFirstLargerNumber() {

        double actResult = c.div(20, 10);
        double expResult = 2;

        Assert.assertTrue("Expected was " + expResult + ": Actual " + actResult, actResult == expResult);
        System.out.println("Test passed");
    }

    @Test
    @Category({SmokeCategory.class})
    public void verifyPositiveDecimalNumber() {

        double actResult = c.div(10, 20);
        double expResult = 0.5;

        Assert.assertTrue("Expected was " + expResult + ": Actual " + actResult, actResult == expResult);
        System.out.println("Test passed");
    }

    @Test
    @Category({AlexCategory.class})
    public void verifyFirstNegativeNumber() {
        // 5) a = -10, b = 20  exp - -0.5

        double actResult = c.div(-10, 20); // result is 0.0 if two numbers are integers
        double expResult = -0.5;

        Assert.assertTrue("Expected was " + expResult + ": Actual " + actResult, actResult == expResult);
        System.out.println("Test passed");
    }

    @Test
    @Category({SmokeCategory.class})
    public void verifySecondNegativeNumber() {
        // 6) a = 10, b = -10  exp - -1

        double actResult = c.div(10, -10);
        double expResult = -1;

        Assert.assertTrue("Expected was " + expResult + ": Actual " + actResult, actResult == expResult);
        System.out.println("Test passed");
    }

    @Test
    @Category({SmokeCategory.class})
    public void verifyFirstZeroNumber() {
        // 7) a = 0, b = 10    exp - 0

        double actResult = c.div(0, 10);
        double expResult = 0;

        Assert.assertTrue("Expected was " + expResult + ": Actual " + actResult, actResult == expResult);
        System.out.println("Test passed");
    }

    @Test
    @Category({NataliaCategory.class})
    public void verifyDivisionByZeroNumber() {
        //  11) a = 0, b = 0  exp - Cannot divide by zero

        double actResult = c.div(0, 0); // NaN
        String actResultStr = String.valueOf(actResult);
        String expResult = "NaN";

        Assert.assertTrue("Expected was " + expResult + ": Actual " + actResult, actResultStr.equals(expResult));
        // System.out.println("Can not divide by zero");
        System.out.println("Test passed");

    }
    @Test
    @Category({NataliaCategory.class})
    public void verifySecondDecimalPointNumber() {

        double actResult = c.div(10, 10.5);
        double expResult = 0.9523809523809523;

        Assert.assertTrue("Expected was " + expResult + ": Actual " + actResult, actResult == expResult);
    }
}

