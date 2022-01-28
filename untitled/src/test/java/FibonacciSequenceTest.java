import org.checkerframework.checker.units.qual.A;
import org.junit.Assert;
import org.junit.Test;

public class FibonacciSequenceTest {

    @Test
    public void positiveTest1(){
        FibonacciSequence f = new FibonacciSequence();
        int actual = f.nthNumber(6);
        int expected = 8;

        //Assert equal is used to compare two values of the same data type
        //compare int to int. String to String
        Assert.assertEquals(expected,actual);
        Assert.assertEquals("6th number is not 8",expected,actual);

        //validate if the actual result is true
        //  Assert True should be used for methods that return boolean
       //Assert.assertTrue("6th Fibonacci number is not 8. " + "Actual: " + actual, actual == expected);
    }
}
