package homework_assignments;

import java.util.Scanner;

public class AreaOfHexagon {
    public static void main(String[] args) {
        /*
        Write a Java program to compute the area of a hexagon.
Area of a hexagon = (6 * s^2)/(4*tan(π/6))
tan = Math.tan | π = Math.PI
Where S is the length of a side
Example:
Input the length of a side of the hexagon: 6
Expected Output
The area of the hexagon is: 93.53074360871938
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length of a side: ");
        int s = input.nextInt();
        double PI = Math.PI;
        double tong = Math.tan(PI/6);
        double areaOfHexagon = (6 * s * s)/(4*tong);
        System.out.println("The area of the hexagon is: " + areaOfHexagon );
    }
}
