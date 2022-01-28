package practice;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        /*
        Write a program that prompts the user to input a positive integer.
        It should then print the multiplication table of that number.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a positive number: ");
        int i = scan.nextInt();


         while(i < 0){
             System.out.println("Number is negative. Please input positive number");
             i = scan.nextInt();
         }

        System.out.println("Multiplication Table of " + i);

         int product = 0; // multiplication result

         for (int counter = 1; counter <= 10; counter++){
             product = i * counter;
             System.out.println(i + "*" + counter + "=" + product);
         }

        // with multiply variables:
         for (int counter = 1, input = 5; counter <= 10; counter++){
            product = input * counter;
            System.out.println(input + "*" + counter + "=" + product);
        }
    }
}
