package user_input;

import java.util.Scanner;

public class UserInput_2 {

    public static void main(String[] args) {

        // Scanner class does not have nextChar() method to take an input
        // from user directly as a character

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your grade: ");

//        char grade = sc.nextChar(); // there is no nextChar() method
        // if we want to get char input from the user then we need to get input as a String
        // and then get the first char from that String input

        char grade = sc.next().charAt(0);
        //
        System.out.println("Your grade is: " + grade);

    }
}
