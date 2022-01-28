package strings;

import java.util.Locale;

public class MethodPractice {

    // static MethodPractice hw = new MethodPractice(); // only static object can be accessed in static main method
    // static int i; // static var

    //inside static method we can use only static var/methods
    // local // instance // static

    public static void main(String[] args) {

        String str1 = "DevxSchool";
        String str2 = "dev";
        int i; // local var

        MethodPractice hw = new MethodPractice();

        System.out.println(hw.containsWithIgnoringCase(str1, str2));

        //==========================================================

        String actPrice = "USD 2012 "; //getting from website
        String expPrice = "2012"; // expected

        actPrice.substring(actPrice.length() - 4);
        // actPrice.substring(actPrice.charAt(actPrice.length() - 4));

        actPrice.substring(4, actPrice.length()).trim();

        // replaceAll. regex - widely used to replace

        System.out.println(actPrice.equals(expPrice));

        //===================================================

    }

    public boolean containsWithIgnoringCase(String str1, String str2) {

        return str1.toLowerCase().contains(str2.toLowerCase());
    }

    //===========================================================

    // Calculator:

    // understanding on problem
    // chunk task
    // [pseudo] sudo coding -> just logic (logic first -> syntax next)

    // How many ways you tried? - brainstorm

    //div 10 0 ==> 1/0 ==> undefined

    // White - Unit Testing
    // 1) a = 10, b = 10  exp - 1
    // 2) a = 10, b = 20  exp - 0.5
    // 3) a = 20, b = 10  exp - 2
    // 4) a = 10, b = 10.5  exp -
    // 5) a = -10, b = 20  exp - 0.5
    // 6) a = 10, b = -10  exp - 1
    // 7) a = 0, b = 10  exp - 0
    // 8) a = 10, b = 10.5  exp - Cannot divide by zero
    // 9) a = 0, b = abc  exp - Error
    // 10) a = 0, b = -10  exp - 0
    // 11) a = 0, b = 0  exp - Cannot divide zero
    // 12) a = 20 digit, b = 0  exp - Success
    // 13) a = 2^16 digit, b = 2^16  exp - Undefined

    // 4 bytes - 32 bits

    public double div(int a, int b){
        if(b==0) {
            System.out.println("Cannot divide by zero");

        }
        return a / b;


    }
    public double sum(int a, int b){
        return a + b;

    }
    public double mul(int a, int b){
        return a * b;

    }
    public double sub(int a, int b){
        return a -b;

    }
}
