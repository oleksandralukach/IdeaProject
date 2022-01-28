package methods;

import java.util.Scanner;

public class CarData {

    public static void main(String[] args) {

        System.out.println("Car Info: ");
        takeInput();

    }

    public static void takeInput () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the year of your car: ");
        int year = scan.nextInt();
        scan.nextLine();

        System.out.println("Please enter the make of your car: ");
        String make = scan.nextLine();

        System.out.println("Please enter the model of your car: ");
        String model = scan.nextLine();

        System.out.println("Please enter the color of your car: ");
        String color = scan.nextLine();

        System.out.println("Please enter the engine size of your car: ");
        double engineSize = scan.nextDouble();

        // CarData obj = new CarData();
        new CarData().printInput (year, make, model, color, engineSize); // in 1 line
    }

    public void printInput (int year, String make, String modelOfTheCar, String colorOfTheCar, double engineSizeOfTheCar){

        System.out.println("Year: " + year +
                "\n Make: " + make +
                "\n Model: " + modelOfTheCar +
                "\n Color: " + colorOfTheCar +
                "\n Engine size: " + engineSizeOfTheCar);
    }
}
