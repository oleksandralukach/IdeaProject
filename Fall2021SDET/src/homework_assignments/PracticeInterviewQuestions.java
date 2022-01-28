package homework_assignments;

import java.util.Scanner;

public class PracticeInterviewQuestions {

    static final double PI = 3.14;

    public static void main(String[] args) {
        System.out.println("1 =======================================");
        // Will the above code compile? If not what's the cause?
        // int t;
        // System.out.println(t);

        System.out.println("It's not going to compile because variable \"t\" not have been initialized");

        System.out.println("2 =======================================");
        // Predict the output of following Java program.
        int i = 1;
        double d1 = 2.4;
        System.out.println("The sum is: " + i + d1);

        // Concatenation - is the operation of joining two strings together.
        // When adding any value to the string java will convert that value to a string

        System.out.println("3 =======================================");
        //Will this code compile?
        //int num1;
        //int num2 = 5;
        //int sumOfNums = num1 + num2;
        //System.out.println(sumOfNums);

        System.out.println("It's not going to compile because variable \"num1\" not have been initialized");

        System.out.println("4 =======================================");
        //What is the DATA TYPE of ‘sum’?
        int num1 = 4;
        double num2 = 4.4;
        float num3 = 7.3F;
        double sum = num1 + num2 + num3;

        System.out.println("Double data type " + sum);
        // When values of arithmetic operation have different data types,
        // Java will automatically promote them to the largest of 3 data types.
        // The resulting value will have the same data type as its promoted operands.

        System.out.println("5 =======================================");
        // Difference between implicit and explicit type casting? And why it is needed?

        // Explicit Type casting - type casting of larger data type to a smaller type is called a narrowing casting
        // we have to manually [explicitly] type cast it.
        // by adding the desired data type in parentheses before the assigning variable.

        // Implicit type casting - converting smaller data type to larger one.
        // It's done automatically [implicitly].
        // widening casting

        // This is because the fractional part would be lost

        System.out.println("6 =======================================");
        // What is main() method in our application?

        // Main method is entry point of JAVA program. A Java program begins execution with its main() method.
        // The braces { } enclose the body of the method, which contains programming statements.
        // Statement has to end with semicolon ";".
        // Syntax of main method "public static void main(String[] args) {}"

        System.out.println("7 =======================================");
        // System.out.print() vs System.out.println()?

        // print() - next statement will print out in a console on the same line.
        // println() - break line at the end of the statement and next will print out on new line.

        System.out.println("8 =======================================");
        // Class structure in java?

        // A Class is like an object constructor, or a "blueprint" for creating objects.
        // Class definition requirements: [Access Modifiers ](public, default…)
        // [Class name] should follow valid Java naming conventions. Public class name must be the same as file name
        // [Body must] be surrounded by curly braces {}

        System.out.println("9 =======================================");
        // What are reserved keywords and what happens if we use them as Java identifiers?

        // There are 53 reserved words in Java.
        // Reserved Words can’t be used as an identifier [variable names]
        // because they have predefined meaning in the language
        // they're already used by the syntax of the Java programming language.

        System.out.println("10 =======================================");
        //What will be the output if I print out this variable?
        char ch1 = 78;
        System.out.println(ch1);
        // if you have a char that holds a character, each character is assigned a unique value from ASCII table
        // here we have number value assigned to char variable and this value has a letter assigned from ASCII table

        System.out.println("11 =======================================");
        // What will be printed out?
        // PI = 3.15;
        System.out.println(PI);

        // Because here we already have constant variable "PI"
        // It can be declared and initialized only once
        // It cannot be updated during program execution

        System.out.println("12 =======================================");
        // Ternary Operator EX:

        // Write a ternary operator that turns the String yourName into
        // an upper-cased string if caseChar is upper case char and if the caseChar
        // is lower case then assign lower case String to your name

        char caseChar = 'A';
        String yourName = caseChar == 'a' ? "ALEX LUKACH" : "alex lukach";
        System.out.println(yourName);

        System.out.println("13 =======================================");
//        /*
//        Just like the example above please use ternary operator to display this message
//        [Hint: new line can be inserted by escape sequence -> \n in a String]
//        If the gender is ‘F’ then display this message:
//        Hello welcome to our fall clothing collection store!
//        Here is the list of items available for you to choose the best outfit:
//        1. Jackets for women
//        2. Long sleeve shirts
//        3. Classic coats for women
//        4. Cashmere scarves
//        If the gender is ‘M’ then display this message:
//        Hello welcome to our fall clothing collection store!
//        Here is the list of items available for you to choose the best outfit:
//        1. Jackets
//        2. Polo long sleeves
//        3. Classic coats
//        4. Classic scarves
//         */
//        char gender = 'F';
//        String isGender = gender == 'F' ? "Hello welcome to our fall clothing collection store!\n" +
//                "Here is the list of items available for you to choose the best outfit:\n" +
//                "1. Jackets for women \n" +
//                "2. Long sleeve shirts\n" +
//                "3. Classic coats for women\n" +
//                "4. Cashmere scarves" : "Hello welcome to our fall clothing collection store!\n" +
//                "Here is the list of items available for you to choose the best outfit:\n" +
//                "1. Jackets\n" +
//                "2. Polo long sleeves\n" +
//                "3. Classic coats\n" +
//                "4. Classic scarves";
//        System.out.println(isGender);
//
//        System.out.println("14 =======================================");
//        // What is the output of the below code?
//        int i1 = 5;
//        boolean bool = i1-- < 6 || ++i1 >= 5 && i1 > 7;
//        System.out.println(i1 + " " + bool);
//        //because "true" value got assigned before last expression
//
//        System.out.println("15 =======================================");
//        // Write a ternary operator which checks if the number is even or odd
//        // [Hint: % -> gives us the remainder of 0 if the number is even when divided by 2].
//        // And if the number is even then prints out “The number is even.”
//        // or if odd then “The number is odd.”
//        int number = 10;
//        int evenNumber = number % 2;
//
//        String isEvenOrOdd = evenNumber == 0 ? "The number is even." : "The number is odd.";
//        System.out.println(isEvenOrOdd);
//
//        System.out.println("16 =======================================");
//        //What will be the output of the below code?
//        int x = 1;
//        int y = 2;
//        boolean bool1 = x < y && y >= ++x;
//
//        System.out.println(x);
//        System.out.println(bool1);
//
//        System.out.println("=========================================================================");
//
//        System.out.println(50 / 3); // result is 16, it's going to lose fractional part
//        // as java type cast numbers to int implicitly
//
//        System.out.println("=========================================================================");
//
//        int x1 = 100;
//        int y1 = 10;
//
//        x1 = y1;
//        System.out.println("x1 " + x1);
//
//        y1 = x1 * x1;
//        System.out.println("y1 " + y1);
//
//        //int x2;
//        //int y2;
//        //x1 = x2 = 10;
//        //y1 = y2 = 100;
//
//        //x1 = x1 + y1; // now x1 is 110
//        //y1 = x1 - y1; // y1 is 100
//        //x1 = x1 - y1; // now x1 is 10
//
//        //x1 = x1/y1;
//        //y1 = y1 * x1;
//
//        System.out.println("=========================================================================");
//
//        String pass = "Pass";
//        String fail = "Fail";
//        int result = 73;
//
//        String passOrFail = result > 50 ? pass : fail;
//        System.out.println("You " + passOrFail + " the test");
//
//        System.out.println("=========================================================================");
//
//        short s = 123;
//        short s2 = 456;
//        short sum3 = (short) (s + s2); //carry out in int data type
//        System.out.println();
//
//        System.out.println("=========================================================================");
//
//        String result1 = 50 == 50.00 ? "Equal" : "Not equal";
//        // equal because int and double are being compared so java will convert
//        // the smaller type to larger data type
//
//        System.out.println("=========================================================================");
//
//        // % -> returns the remainder of a number divided by another
//
//       // x % 10 -> returns the last digit of a number
        // x / 10 -> returns first digit if it's 2-digit number
//      // x % 2 == 0 -> returns 0 for even number, else for odd numbers
//
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter an integer number:");
//        int num = input.nextInt();
//
//        /* If number is divisible by 2 then it's an even number
//         * else odd number*/
//        int remainder = num % 2;
//        if (remainder == 0)
//            System.out.println("Entered number is even");
//        else
//            System.out.println("Entered number is odd");
//
//        System.out.println("=========================================================================");
//
//        /*
//        Write the java program that takes an int input from user
//        and prints out whether that number is absolute number.
//         */
//
//        System.out.println("Please enter a number: ");
//        int num4 = input.nextInt();
//
//        // to prints out whether that number is absolute number:
//        if (num4 > 0) {
//            System.out.println("Number " + num4 + " is absolute number");
//        } else System.out.println("Number " + num4 + " is not absolute number");
//
//        // to prints out absolute value of number:
//        if (num4 < 0) {num4 = (-1) * num4; System.out.println("Absolute value of your number is " + num4);}
//        else if (num4 >= 0) {System.out.println("Absolute value of your number is " + num4);}

        System.out.println("=========================================================================");

        String equalToSymbol = "=";
        char equalToChar = '=';

        System.out.println( equalToSymbol + 2);

        System.out.println("=========================================================================");

        int n;
        char s1, s2, s3;
        System.out.print("Input number: ");
        n = input.nextInt();
        System.out.printf("%d + %d%d + %d%d%d\n", n,n,n,n,n,n);

        System.out.println("=========================================================================");

        short sh1 = 12;
        short sh2 =10;
       // short shSum = sh1 + sh2;

        System.out.println("=========================================================================");

        switch(45)
        {
            case 45: ;
        }

        //18. Write a Java program to calculate the sum of two integers and return true if the sum is
        //equal to a third integer.
        //Sample Output:
        //Input the first number : 5
        //Input the second number: 10
        //Input the third number : 15
        //The result is: true


    }
}








