package class_3;

import class_2.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

// Test cases for calculator

// Test Cases

//        1) a = 10, b = 10   exp - 100
//        2) a = 10, b = 0   exp - 0
//        3) a = -20, b = 0   exp - 0
//        4) a = -10, b = -10    exp - (100)
//        5) a = -10, b = 20  exp - -200
//        6) a = 10, b = -10  exp - -100
//        7) a = 0, b = 10  exp - 0
//        8) a = 10, b = 0  exp - 0
//       14) a = -10, b = -10 exp - 100

public class CalculatorMulMethodTest {
    // Declaration of object
    Calculator c ;

    // Pre-condition
    @Before
    public void setUp(){
        // Initialization of object
        c = new Calculator();
    }

    // When we use @Test then it'll become test cases otherwise it'll be only java method
    @Test
    public void verifyPositiveEqualNumber(){
        double actResult = c.mul(10, 10);
        double expResult = 100;
        Assert.assertTrue("Expected was "+expResult +" : Actual "+actResult,actResult == expResult);
        System.out.println("Bye"); // will be not printed if condition will not be met and program will hard stop
    }

    @Test
    public void verifyPositiveFirstLargerThanSecondNumber(){
        double actResult = c.mul(20, 0);
        double expResult = 0;
        Assert.assertTrue("Expected was "+expResult +" : Actual "+actResult,actResult == expResult);
    }

    @Test
    public void verifyPositiveSecondLargerThanFirstNotEqualNumber(){
        double actResult = c.mul(-20, 0);
        double expResult = 0;
        Assert.assertTrue("Expected was "+expResult +" : Actual "+actResult,actResult == expResult);
    }

    @Test
    public void verifyPositiveSecondLargerThanFirstWithMinusNotEqualNumber(){
        double actResult = c.mul(-10, -10);
        double expResult = 100;
        Assert.assertTrue("Expected was "+expResult +" : Actual "+actResult,actResult == expResult);
    }
    //        5) a = -10, b = 20  exp - -200
    @Test
    public void verifyNegativeFirstNumberSecondLargerThanFirstNotEqualNumber(){
        double actResult = c.mul(-10, 20);
        double expResult = -200;
        Assert.assertTrue("Expected was "+expResult +" : Actual "+actResult,actResult == expResult);
    }
    //        6) a = 10, b = -10  exp - -100
    @Test
    public void verifyPositiveFirstNumberNegativeSecondNumberNotEqualNumber(){
        double actResult = c.mul(10, -10);
        double expResult = -100;
        Assert.assertTrue("Expected was "+expResult +" : Actual "+actResult,actResult == expResult);
    }

    //        7) a = 0, b = 10  exp - 0
    @Test
    public void verifyZeroFirstNumberSecondPositiveNotEqualNumber(){
        double actResult = c.mul(0, 10);
        double expResult = 0;
        Assert.assertTrue("Expected was "+expResult +" : Actual "+actResult,actResult == expResult);
    }
    //        8) a = 10, b = 0  exp - 0
    @Test
    public void verifyPositiveFirstNumberZeroSecondNumberNotEqualNumber(){
        double actResult = c.mul(10, 0);
        double expResult = 0;
        Assert.assertTrue("Expected was "+expResult +" : Actual "+actResult,actResult == expResult);
    }

    //        9) a = 10, b = 10.5  exp - 105
    @Test
    public void verifySecondDecimalPointNumber() {

        double actResult = c.sub(10, 10.5);
        double expResult = 105;

        Assert.assertTrue("Expected was " + expResult + ": Actual " + actResult, actResult == expResult);
    }
    //       14) a = -10, b = -10 exp - 100
    @Test
    public void verifyNegativeEqualNumbers(){
        double actResult = c.mul(-10, -10);
        double expResult = 100;
        Assert.assertTrue("Expected was "+expResult +" : Actual "+actResult,actResult == expResult);
    }
}
