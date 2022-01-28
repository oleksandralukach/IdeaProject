package user_input;

import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {

        /* In order to take an input from the user we need to
        create an object of Scanner class that way we can use it's methods.
        There are methods that support an input form the user in different date types.
        Such as: next() -> for the string before the next white space
        nextInt() -> for int type;
        next
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your first name: ");
        String firstName = scan.next(); // this next() method from Scanner class will take an input
        // until the next white space
        System.out.println("Firstname: " + firstName);

        // This is another way of getting an input from the user without referencing it's object
        System.out.println("Please enter your last name: ");
        String lastName = scan.next();
        System.out.println("Lastname: " + lastName);
        scan.nextLine();

        // nextLine() method enables us to take an input from users with white spaces in between
        // and scans them into one variable

        System.out.println("Now finally input your full name: ");
        String fullName = scan.nextLine();
        System.out.println("Fullname: " + fullName);

        // nextShort() -> which expects a short data type inout from user

        System.out.println("Enter your age: ");
        short age = scan.nextShort();

        // nextInt() -> for int data type inputs
        // nextBoolean()-> boolean type inputs
        // nextDouble() -> double input data type
        // nextLong() -> long input data type

        System.out.println("What is the value of PI? ");
        double PI = scan.nextDouble();
        System.out.println("Pi is: " + PI);

        System.out.println("Are you 18 or over? Please enter true for yes, false for no");
        boolean isQualified = scan.nextBoolean();

        System.out.println( !isQualified ? "Customer is qualified." : "Not qualified.");
        // "!" -> mark is called negation operator which converts the value to the
        // compliment of it [EX: if true then it converts it to "Not true which is false"]


        System.out.print("Enter your name: \n");
        String name = scan.next();
        //System.out.println(scan.nextLine());
        System.out.print("Enter marks in three subjects: ");
        int marks1=scan.nextInt();
        int marks2=scan.nextInt();
        int marks3=scan.nextInt();
        double average = ( marks1+marks2+marks3)/3.0;
        System.out.println("\nName: "+name);
        System.out.println("Average: "+average);

        Scanner bucky = new Scanner (System.in);
        String num = (bucky.nextLine());
        System.out.println(num);

        System.out.println("New line: ");

        int fnum = (bucky.nextInt());
        System.out.println(fnum);






    }
}
