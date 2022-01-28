package class_3;

import class_2.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorSumMethodTest {

    Calculator c;

    // Pre-condition
    @Before
    public void setUp() {
        // initialization
        c = new Calculator();
    }

    // When we use @Test then it'll become test cases otherwise it'll be only java methods
    @Test
    public void verifyPositiveEqualNumber() {

        double actResult = c.sum(10, 10); // actual result
        double expResult = 20;

        // deprecated -> no longer in use
        //Assert.assertEquals(expresult,actresult,0); // delta - after decimal

        Assert.assertTrue("Expected was " + expResult + ": Actual " + actResult, actResult == expResult);
        System.out.println("Bye"); // will be not printed if condition will not be met and program will hard stop
    }

    @Test
    public void verifyPositiveFirstSmallerNumber() {

        double actResult = c.sum(10, 20);
        double expResult = 30;

        Assert.assertTrue("Expected was " + expResult + ": Actual " + actResult, actResult == expResult);
    }

    @Test
    public void verifyPositiveFirstLargerNumber() {

        double actResult = c.sum(20, 10);
        double expResult = 30;

        Assert.assertTrue("Expected was " + expResult + ": Actual " + actResult, actResult == expResult);
    }

    @Test
    public void verifyFirstNegativeNumber() {

        double actResult = c.sum(-10, 20); // result is 0.0 if two numbers are integers
        double expResult = 10;

        Assert.assertTrue("Expected was " + expResult + ": Actual " + actResult, actResult == expResult);
    }

    @Test
    public void verifySecondNegativeNumber() {

        double actResult = c.sum(10, -10);
        double expResult = 0;

        Assert.assertTrue("Expected was " + expResult + ": Actual " + actResult, actResult == expResult);
    }

    @Test
    public void verifyFirstZeroNumber() {

        double actResult = c.sum(0, 10);
        double expResult = 10;

        Assert.assertTrue("Expected was " + expResult + ": Actual " + actResult, actResult == expResult);
    }

    @Test
    public void verifySecondDecimalPointNumber() {

        double actResult = c.sum(10, 10.5);
        double expResult = 20.5;

        Assert.assertTrue("Expected was " + expResult + ": Actual " + actResult, actResult == expResult);
    }
}
