package homework_assignments;

import java.util.Scanner;

public class HomeWork_8_InchesToMeters {
    /*
    2. Write a Java program that reads a number in inches, converts it to meters.
Note: One inch is 0.0254 meter.
Test Data
Input a value for inch: 1000
Expected Output :
1000.0 inch is 25.4 meters
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a value for inch: ");
        double inch = s.nextDouble();

        double meter = inch * 0.0254;
        System.out.println( inch + " inch is " + meter + " meters");
    }
}
