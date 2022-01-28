package homework_assignments;

import java.util.Scanner;

public class CompareTwoNumIfStatement {

    public static void main(String[] args) {
        /*
        Write a Java program to compare two numbers.
Input Data:
Input first integer: 25
Input second integer: 39
Expected Output:
25 < 39     or       39 > 25        or       "The fist number is smaller"
         */

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter 1st integer: ");
        int num1 = s.nextInt();
        System.out.println("Please enter 2nd integer: ");
        int num2 = s.nextInt();

        if (num1 < num2){
            System.out.println( num1 + " < " + num2 +
                    "\t\tor\t\t" + num2 + " > " + num1 +
                    "\t\tor\t\t" +
                    "The fist number is smaller");
        }
        else if (num1 > num2) {
            System.out.println( num1 + " > " + num2 +
                    "\t\tor\t\t" + num2 + " < " + num1 +
                    "\t\tor\t\t" +
                    "The fist number is larger");
        } else {
        System.out.println( num1 + " = " + num2 +
                "\t\tor\t\t" +
                "Numbers are equal");
        }
    }
}
