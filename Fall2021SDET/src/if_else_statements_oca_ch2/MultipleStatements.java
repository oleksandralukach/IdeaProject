package if_else_statements_oca_ch2;

import java.util.Scanner;

public class MultipleStatements {
    public static void main(String[] args) {
        // we can have as many if statements as we need
        // but only one else statement

        System.out.println("Welcome to pur shop!");

        char gender = 'F';

        if(gender == 'M' || gender == 'm')
            System.out.println("Here is our collection for women: " +
                    "\n1. some clothes" +
                    "\n2. some clothes" +
                    "\n3. some clothes");
        else System.out.println("Here is our collection for men: " +
                "\n1. some clothes" +
                "\n2. some clothes" +
                "\n3. some clothes");

        // I want to get a number from a user to print out the day of the week
        // and also print out if it's a week day of weekend [week days: 1 to 5]
        // Expected output: Monday, Weekday

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter a number from 1 to 7 to see the day of the week: ");
        byte numberOfDay = keyboard.nextByte();

        if(numberOfDay == 0) System.out.println("Monday, Weekday");
        if(numberOfDay == 1) System.out.println("Tuesday, Weekday");
        if(numberOfDay == 2) System.out.println("Wednesday, Weekday");
        if(numberOfDay == 3) System.out.println("Thursday, Weekday");
        if(numberOfDay == 5) System.out.println("Friday, Weekday");
        if(numberOfDay == 6) System.out.println("Saturday, Weekend");
        if(numberOfDay == 7) System.out.println("Sunday, Weekend");
        if(numberOfDay > 7 || numberOfDay < 1) System.out.println("Please enter a valid day from 1 to 7");
        else {}

        int dayNum = keyboard.nextInt();
        if (dayNum == 1) {
            System.out.println("Sunday");
        } else if (dayNum == 2) {
            System.out.println("Monday");
        } else if (dayNum == 3) {
            System.out.println("Tuesday");
        } else if (dayNum == 4){
            System.out.println("Wednesday");
        } else if (dayNum == 5) {
            System.out.println("Thursday");
        } else if (dayNum == 6) {
            System.out.println("Friday");
        } else if (dayNum == 7) {
            System.out.println("Saturday");
        } else {
            System.out.println("Enter a valid number in range 1 to 7");
        }
    }
}
