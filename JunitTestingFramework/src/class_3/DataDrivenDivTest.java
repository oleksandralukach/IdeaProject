package class_3;

import class_2.Calculator;
import empty_categories_classes.AlexCategory;
import empty_categories_classes.SmokeCategory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 1.	Annotate class with annotation - @RunWith(Parameterized.class)
 2.	Create a method, which will generate data & have annotation - @Parameterized.Parameters
 3.	Create a constructor which will take parameter from method which generate data
 4.	Create a variable at class level which we are going to use in our test method
 5.	Use class variable inside our test method to make it data-driven

 The flow: annotation -> method -> constructor -> class level variable -> test cases
 */

@RunWith(Parameterized.class) //1.
public class DataDrivenDivTest {
    Calculator c;

    @Before
    public void setUp() {

        c = new Calculator();
    }

// 4. var we will use inside test (created on a class level)
    Integer num;

    // 2. this method will create test data
    @Parameterized.Parameters (name = "Running with {0}")
    public static Collection createData(){
        Integer data[] = {10, 20, 100, 50};
        return Arrays.asList(data);
    }

    // constructor to initialize variable
    public DataDrivenDivTest(int num){

        this.num = num;
    }

    @Test
    @Category({AlexCategory.class, SmokeCategory.class})
    public void verifyPositiveEqualNumber() {
        double actResult = c.div(num, num); // actual result
        double expResult = 1;
        Assert.assertTrue("Expected was " + expResult + ": Actual " + actResult, actResult == expResult);
    }

}
