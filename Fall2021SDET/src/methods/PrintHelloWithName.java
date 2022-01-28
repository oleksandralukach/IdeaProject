package methods;

import java.util.Scanner;

public class PrintHelloWithName {

    // methods define the behavior of the classes
    // methods are aka functions in other programming languages

    public static void main(String[] args) {

        // now we call method sayHelloToUser();
        sayHelloToUser();

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter age: ");
        int yourAge = scan.nextInt();

        printAge(yourAge);
    }

    public static void sayHelloToUser() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scan.nextLine();
        System.out.println("Hello " + name);

    }

    public static void printAge (int age) {

        System.out.println("Your age is: " + age);
    }
}
