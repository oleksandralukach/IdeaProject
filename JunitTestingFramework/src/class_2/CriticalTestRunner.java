package class_2;

// Test Case - Collection of test steps
// Test Suite - Collection of test cases

import class_3.CalculatorDivMethodTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({CalculatorDivMethodTest.class}) // here we are calling the whole classes with all test cases

public class CriticalTestRunner {
}
