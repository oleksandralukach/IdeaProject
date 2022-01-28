package homework_assignments;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SumDifferenceAverage {
    public static void main(String[] args) {
        /*
        Write a Java program that accepts two integers from the user and then prints the sum,
        the difference, the product, the average, the distance (the difference between integer),
        the maximum (the larger of the two integers), the minimum (smaller of the two integers).

Test Data
Input 1st integer: 25
Input 2nd integer: 5

Expected Output :
Sum of two integers: 30
Difference of two integers: 20
Product of two integers: 125
Average of two integers: 15.00
Distance of two integers: 20
Max integer: 25
Min integer: 5
         */

        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat(".00");

        System.out.println("Please enter 1st integer: ");
        int num1 = s.nextInt();
        System.out.println("Please enter 2nd integer: ");
        int num2 = s.nextInt();

        int sum = num1 + num2;
        int dif = num1 - num2;
        int product = num1 * num2;
        double average = (num1 + num2) / 2;
        int distance = num1 - num2;
        int max = num1 > num2 ? num1 : num2;
        int min = num1 < num2 ?  num1 : num2;

        System.out.println("Sum of two integers: " + sum);
        System.out.println("Difference of two integers: " + dif);
        System.out.println("Product of two integers: " + product);
        System.out.println("Average of two integers: " + df.format(average));
        System.out.println("Distance of two integers: " + distance);
        System.out.println("Max integer: " + max);
        System.out.println("Min integer: " + min);

    }
}
