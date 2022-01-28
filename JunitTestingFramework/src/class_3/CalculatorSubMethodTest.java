package class_3;

import class_2.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


// Test cases for calculator

// Test Cases

//        1) a = 10, b = 10   exp - 0
//        2) a = 10, b = 20   exp - -10
//        3) a = 20, b = 10   exp - 10
//        4) a = 10, b = 0    exp - 10
//        5) a = -10, b = 20  exp - -30
//        6) a = 10, b = -10  exp - 20
//        7) a = 0, b = 10  exp - -10
//        8) a = 10, b = 0  exp - 10
//        9) a = 10, b = 10.5  exp - -0.5
//       14) a = -10, b = -10 exp - 10

public class CalculatorSubMethodTest {
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
        double actResult = c.sub(10, 10);
        double expResult = 0;
        Assert.assertTrue("Expected was "+expResult +" : Actual "+actResult,actResult == expResult);
    }

    @Test
    public void verifyPositiveFirstLargerThanSecondNumber(){
        double actResult = c.sub(20, 10);
        double expResult = 10;
        Assert.assertTrue("Expected was "+expResult +" : Actual "+actResult,actResult == expResult);
    }

    @Test
    public void verifyPositiveSecondLargerThanFirstNotEqualNumber(){
        double actResult = c.sub(10, 20);
        double expResult = -10;
        Assert.assertTrue("Expected was "+expResult +" : Actual "+actResult,actResult == expResult);
    }

    @Test
    public void verifyPositiveSecondLargerThanFirstWithMinusNotEqualNumber(){
        double actResult = c.sub(0, 10);
        double expResult = -10;
        Assert.assertTrue("Expected was "+expResult +" : Actual "+actResult,actResult == expResult);
    }

//    5) a = -10, b = 20  exp - -30
@Test
public void verifyNegativeFirstNumberSecondLargerThanFirstNotEqualNumber(){
    double actResult = c.sub(-10, 20);
    double expResult = -30;
    Assert.assertTrue("Expected was "+expResult +" : Actual "+actResult,actResult == expResult);
}
//        6) a = 10, b = -10  exp - 20
@Test
public void verifyPositiveFirstNumberNegativeSecondNumberNotEqualNumber(){
    double actResult = c.sub(10, -10);
    double expResult = 20;
    Assert.assertTrue("Expected was "+expResult +" : Actual "+actResult,actResult == expResult);
}


//        7) a = 0, b = 10  exp - -10
@Test
public void verifyZeroFirstNumberSecondPositiveNotEqualNumber(){
    double actResult = c.sub(0, 10);
    double expResult = -10;
    Assert.assertTrue("Expected was "+expResult +" : Actual "+actResult,actResult == expResult);
}
//        8) a = 10, b = 0  exp - 10
@Test
public void verifyPositiveFirstNumberZeroSecondNumberNotEqualNumber(){
    double actResult = c.sub(10, 0);
    double expResult = 10;
    Assert.assertTrue("Expected was "+expResult +" : Actual "+actResult,actResult == expResult);
}
//         14) a = -10, b = -10 exp - 0
    @Test
    public void verifyNegativeEqualNumbers(){
        double actResult = c.sub(-10, -10);
        double expResult = 0;
        Assert.assertTrue("Expected was "+expResult +" : Actual "+actResult,actResult == expResult);
    }
    //        9) a = 10, b = 10.5  exp - -0.5
    @Test
    public void verifySecondDecimalPointNumber() {

        double actResult = c.sub(10, 10.5);
        double expResult = -0.5;

        Assert.assertTrue("Expected was " + expResult + ": Actual " + actResult, actResult == expResult);
    }

}
