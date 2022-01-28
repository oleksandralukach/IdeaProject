package methods;

public class MethodDesign1 {
    // nothing beside package, import statement can be outside class scope.
    // any methods will have to be outside main method but inside a class

    public static void main(String[] args) {

        // we can call methods inside other methods.
        // in this case we are calling (use) printSumOfTwoNumbers methods inside main method.
        // main method is static method, so we can call printSumOfTwoNumbers method directly.

        //System.out.println("Adding 2 numbers together" + (2 + 10));

        printSumOfTwoNumbers(2, 10); // calling a method
        //same as: System.out.println("Adding 2 numbers together" + (2 + 10));
        printSumOfTwoNumbers(534, 34);
        printSumOfTwoNumbers(12, 34);

        // ====================================================

        printHello();

        // ====================================================

        System.out.println("Done with multiplication: ");
        // < == multiply 3.2 and 6.4)
        double result = multiplication(3.2, 6.4);
        System.out.println(result); // 1 -> save it to variable with the option to not printing it out but using it later

        System.out.println(multiplication(3, 4)); // 2 -> just printing out

        // ====================================================

        convertCtoF(10.5);
        double resultOfConvert = convertCtoF(10.5);
        System.out.println(resultOfConvert);

        // calculate the average temp of 4 days
        // in F given C

        double average2 =   (convertCtoF(18) + convertCtoF(20) + convertCtoF(14) + convertCtoF(22)) / 4;

        // or create variables with values and
        // then use method with them but not just numbers
        int day1TempInC = 18;
        int day2TempInC = 20;
        int day3TempInC = 14;
        int day4TempInC = 22;
        double average =
                (convertCtoF(day1TempInC) + convertCtoF(day2TempInC) + convertCtoF(day3TempInC) + convertCtoF(day4TempInC)) / 4;
        System.out.println(average);
        double result2 = convertCtoF(20); // -> saving the result of conversion in variable

        // or create variables with already converted C to F values
        // by using method convertCToF
        double day1F = convertCtoF(day1TempInC);
        double day2F = convertCtoF(day2TempInC);
        double day3F = convertCtoF(day3TempInC);
        double day4F = convertCtoF(day4TempInC);

        // ================================================================

        login("Test user", "Bad Password");
        login("Demo", "Test Password");

        String validInput1 = login("Dem", "Test Password");
        String validInput2 = login("Demo", "Test Password");

        System.out.println(validInput1);
        System.out.println(validInput2);

        // ===================================================================
    }

    // we don't have to put return statement bc the return type is void
    public static void printSumOfTwoNumbers(int num1, int num2) { // dynamic initializing

        // we can put in method body
        // as many statements as we need to
        System.out.println("Adding 2 numbers together" + num1 + num2);

    }

    public static void printHello() {
        System.out.println("Hello World!");
    }

    // create a method which return multiplication of two numbers
    // 1. do we need to return int, double or what? -> double
    // 2. do we need to multiply int, doubles? -> double
    public static double multiplication(double a, double b) {

        double product = a * b;
        // System.out.println(product);
        return product;
    }

    // convert Celsius to Fahrenheits
    // F = (C * 9/5) + 32;
    public static double convertCtoF(double celsius) {
        double fahrenheits = (celsius * 9/5) + 32;
        return fahrenheits;

    }
    // user should be successfully logged in if the given username is "Demo"
    // and password is "TestPassword"

    // so for successful login print "Success"
    // otherwise print "Failure"
    public static String login(String username, String password){


        if (username.equals("Demo")&& password.equals("Test Password")){
            return "Success";
        } else
            return "Failure";
    }
}
