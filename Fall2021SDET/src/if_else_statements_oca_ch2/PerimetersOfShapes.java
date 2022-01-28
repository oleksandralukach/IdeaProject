package if_else_statements_oca_ch2;

import java.util.Scanner;

public class PerimetersOfShapes {

        public static void main(String[] args) {

        /*
            1. input from the user for the "numberOfSides" of the shape [EX: triangle and quadrilateral shape]
            2. now ask user to input the length for each of the sides of the shape[EX: a,b,c,d]
            3. according to the "numberOfSides" we need to identify the "typeOfShape"
            4. and print out the "nameOfTheShape" + "typeOfShape" and "perimeter" of the shape

            * perimeter of any shape is just adding all the sides;

            Expected output: Isosceles Triangle and it's perimeter is 24.3 inches;

            Limitations:
            3 types of each shape:
                - Triangle:
                    -> Equilateral [all sides equal]
                    -> Isosceles [2 sides equal]
                    -> Scalene [no equal sides]
                - Quadrilateral shape [shape that has 4 sides]
                    -> Square [all sides equal]
                    -> Rectangle [2 parallel sides equal]
                    -> Trapezoid [no equal sides or 2 sides can be equal]
         */

            String typeOfShape = "";
            String nameOfTheShape = "";

            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter the number of sides for the shape?");
            // 1. input from the user for the "numberOfSides" of the shape [EX: triangle and quadrilateral shape]
            byte numberOfSides = scan.nextByte();
            double perimeter = 0;

            if (numberOfSides ==3 || numberOfSides ==4) {
                System.out.println("Please enter the length for side 'a':");
                double a = scan.nextDouble();
                System.out.println("Please enter the length for side 'b':");
                double b = scan.nextDouble();
                System.out.println("Please enter the length for side 'c':");
                double c = scan.nextDouble();

                if (numberOfSides == 3) {
                    System.out.print("You entered Triangle shape. ");
                    perimeter = a + b + c;
                    if (a == b && b == c) {
                        System.out.println("It is: Equilateral. Perimeter: " + perimeter);
                    } else if (a == b || b == c || a == c) {
                        System.out.println("It is: Isosceles. Perimeter: " + perimeter);
                    } else {
                        System.out.println("It is: Scalene. Perimeter: " + perimeter);
                    }

                } else if (numberOfSides == 4) {
                    System.out.println("Please enter the length for side 'd':");
                    double d = scan.nextDouble();
                    System.out.print("You entered Quadrilateral shape. ");
                    perimeter = a + b + c + d;

                    if (a == b && b == c && c == d) {
                        System.out.println("It is: Square. Perimeter: " + perimeter);
                    } else if (a == b && c == d || b == c && a == d || b == d && c == a) {
                        System.out.println("It is: Rectangle. Perimeter: " + perimeter);
                    } else {
                        System.out.println("It is: Trapezoid. Perimeter: " + perimeter);
                    }
                }
            } else {
                System.out.println("Invalid input. Please enter '3' or '4'");
            }
        }
}