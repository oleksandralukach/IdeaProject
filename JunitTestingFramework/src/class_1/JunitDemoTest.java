package class_1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JunitDemoTest {

    // This method will be executed before each test cases
    // Before annotation we're using to execute method before each test methods
    @Before
    public void setUp(){
        System.out.println("Before Test");
    }

    // This is our test cases & we're using @Test annotation to treat any methods as a test case in JUnit
    @Test
    public void testCase1(){
        System.out.println("Hello World1");
    }

    // This is our test cases & we're using @Test annotation to treat any methods as a test case in JUnit
    @Test
    public void testCase2(){
        System.out.println("Hello World2");
    }

    // This is our test cases & we're using @Test annotation to treat any methods as a test case in JUnit
    @Test
    public void testCase3(){
        System.out.println("Hello World3");
    }

    // This method will be executed after each test cases
    // After annotation we're using to execute method after each test methods
    @After
    public void cleanUp(){
        System.out.println("After Test");
    }

}
