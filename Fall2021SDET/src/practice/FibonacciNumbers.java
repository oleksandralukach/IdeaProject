package practice;

public class FibonacciNumbers {
    /*
    find first 10 Fibonacci Numbers:
    1 1 2 3 5 8 13 21 34 55
    every next number is sum of 2 previous one
     */

    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 1;
        int num3 = 0;
        System.out.println(num1 + "" + num2); //printing 0 and 1

        for (int i = 1; i < 10; i++) { // printing from "2"

            num3 = (num1 + num2);
            System.out.println(num3);
            num1 = num2;
            num2 = num3;
        }


    }
}
