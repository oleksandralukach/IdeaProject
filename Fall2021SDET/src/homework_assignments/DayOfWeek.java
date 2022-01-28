package homework_assignments;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        /*
        Write a Java program that keeps a number from the user and
        generates an integer between 1 and 7 and displays the name of the weekday.
        Test Data
        Input number: 3
        Expected Output :
        Wednesday
         */

        Scanner s = new Scanner(System.in);
        System.out.println("Enter weekday number: ");
        int num = s.nextInt();

        // using just ternary operator:
        int day1 = 1, day2 = 2, day3 = 3, day4 = 4, day5 = 5, day6 = 6, day7 = 7;

        String dayOfWeek = num == day1 ? "Monday": (num == day2 ? "Tuesday" :
                        (num == day3 ? "Wednesday" : (num == day4 ? "Thursday" :
                        (num == day5 ? "Friday" : (num == day6 ? "Saturday" :
                                (num == day7 ? "Sunday" : "Please enter a valid day number from 1 to 7"))))));

        System.out.println(dayOfWeek);

//        // using if else if statement:
//        if (num == 1) {
//            System.out.println("Monday");
//        }
//        else if (num == 2) {
//            System.out.println("Tuesday");
//        }
//        else if (num == 3) {
//            System.out.println("Wednesday");
//        }
//        else if (num == 4) {
//            System.out.println("Thursday");
//        }
//        else if (num == 5) {
//            System.out.println("Friday");
//        }
//        else if (num == 6) {
//            System.out.println("Saturday");
//        }
//        else if (num == 7) {
//            System.out.println("Sunday");
//        }
//        else {
//            System.out.println("Please enter a valid day number from 1 to 7");
//        }
    }
}
