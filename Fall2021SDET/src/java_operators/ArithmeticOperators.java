package java_operators;

public class ArithmeticOperators {
    public static void main(String[] args) {
        // Arithmetic operators in java are the basic mathematical operations
        // such as addition (+), subtraction (-), division (/), multiplication (*)
        // modulo operator (%)

        int num1 = 123;
        int num2 = 456;
        // addition
        int numsAdded = num1 + num2;
        System.out.println("Addition: " + numsAdded);
        // subtraction
        int numsSubtracted = num2 - num1;
        System.out.println("Subtracted: " + numsSubtracted);
        // division
        float numsDivided = num2 / num1; // when integer numbers are divided the outcome of that
        // operation is going to be an integer
        System.out.println("Divided: " + numsDivided);
        // multiplication
        int numsMultiplied = num1 * num2;
        System.out.println("Multiplied: " + numsMultiplied);

        int x = 3;
        int y = 2;
        // when dividing 2 integers java will treat them as integers and does the math operation
        // and then convert them to a float
        // rather if we want more precise outcome with the fractions
        // then we can first convert the type and then do the math operation
        float z = (float) x / y;  //type cast them first and it's converting them into float
        System.out.println(z);
        int res = (int) z;
        System.out.println(res);

        long varLong = 123456L;
        float varFloat = varLong;
        System.out.println(varFloat);

        // precedence order is starts with parenthesis operation first
        // then multiplication or division and then right to left
        System.out.println("What will be the outcome of this?");

        int finalOutcome1 = x + (res - y);
        System.out.println(finalOutcome1);

        int finalOut2 = x * y / 3;
        System.out.println(finalOut2);

        // What is your salary after 5 years?
        double salary = 100_000;
        double yearlyIncrease = 0.03;

        double secondYearSalary = salary * yearlyIncrease + salary;
        System.out.println("After the first year: " + secondYearSalary);

        double thirdYearSalary = secondYearSalary * yearlyIncrease + secondYearSalary;
        System.out.println("After the second year: " + thirdYearSalary);

        double fourthYearSalary = thirdYearSalary * yearlyIncrease + thirdYearSalary;
        System.out.println("After the third year: " + fourthYearSalary);

        double fifthYearSalary = fourthYearSalary * yearlyIncrease + fourthYearSalary;
        System.out.println("After the fourth year: " + fifthYearSalary);

        //order precedence of arithmetic operations
        //first parenthesis
        // multiplication, division, %
        // plus, minus - will go from left to right
        System.out.println("The order of precedence: "+ (4-3 % 2));
        System.out.println("The order of precedence: "+ (4* 2 / 2 %3));
        System.out.println( 6+ 2 - 3* (4+ (5-3)%2)); // first precedence the most inner parethesis

        int dividend = 4; //4.0
        double diviser = 2.2;
        System.out.println(dividend/diviser); //both operands are going to convert to double type

        //when perform operation of 2 chars - numbers from ASCII table
        char charA = 'a';
        char charB = 'b';
        int aBSum = charA +charB;
        System.out.println(aBSum);

        // x * y / z ?
        short sh = 14;
        float fl = 13;
        double dou = 30;
        double nums = sh * fl / dou;
        System.out.println(nums);

        int number = 6;
        int numberWithO = number * 10;
        int result = numberWithO - number;
        System.out.println(result);

        }

    }
