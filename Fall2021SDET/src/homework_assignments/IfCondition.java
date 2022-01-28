package homework_assignments;

import java.util.Scanner;

public class IfCondition {

    public static void main(String[] args) {
        /*
        1. Write a Java program to calculate the sum of two integers
        and return true if the sum is equal to a third integer.
        Input the first number : 5
        Input the second number: 10
        Input the third number : 15
        The result is: true
         */
        Scanner s = new Scanner(System.in);

        System.out.println("Input the first number :");
        int firstNum = s.nextInt();
        System.out.println("Input the second number :");
        int secondNum = s.nextInt();
        System.out.println("Input the third number :");
        int thirdNum = s.nextInt();

        int sum = firstNum + secondNum;

        if (sum == thirdNum){
            System.out.println("true");
        }
    }
}
