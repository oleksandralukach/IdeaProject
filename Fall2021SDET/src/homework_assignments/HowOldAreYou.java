package homework_assignments;

import java.util.Scanner;

public class HowOldAreYou {
    /*
    Using if statements, else if, and else statements,
    make a program which displays a different message depending on the age given.

age - message
less than 16 - "You can't drive."
16 to 17 - "You can drive but not vote."
18 to 24 - "You can vote but not rent a car."
25 or older - "You can do pretty much anything."
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input your age: ");
        int age = input.nextInt();

        if (age < 16){
            System.out.println("You can't drive");
        } else if (age >=16 && age <=17){
            System.out.println("You can drive but not vote");
        } else if (age >=18 && age <=24){
            System.out.println("You can drive, vote but not rent a car");
        } else {
            System.out.println("You can do pretty much anything");
        }

    }
}
