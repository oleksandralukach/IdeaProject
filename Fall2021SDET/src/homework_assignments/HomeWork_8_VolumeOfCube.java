package homework_assignments;

import java.util.Scanner;

public class HomeWork_8_VolumeOfCube {
    /*
    Write a program, that will accept 3 integers: width, length, height.
    Program should calculate volume of a cube (w*l*h), and print it.
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int width;
        int length;
        int height;
        System.out.println("Please enter width of a cube: ");
        width = s.nextInt();
        System.out.println("Please enter length of a cube: ");
        length = s.nextInt();
        System.out.println("Please enter height of a cube: ");
        height = s.nextInt();
        int volume = width * length * height;
        System.out.println("Volume of a cube is: " + volume);






    }
}
