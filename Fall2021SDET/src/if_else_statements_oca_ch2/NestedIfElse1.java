package if_else_statements_oca_ch2;

import java.util.Scanner;

public class NestedIfElse1 {
    public static void main(String[] args) {
        /* Requirements:
        If raining outside and temp < 30 -> stay indoors
            raining + temp >= 30 and 50 ->  coat + umbrella
            raining + temp >= 50 and 70 -> rain jacket + umbrella
            raining + temp > 70 -> light clothing + umbrella
        Not raining and temp below 30 -> stay indoors
            not raining + temp >= 30 and 50 ->  coat
            not raining + temp >= 50 and 70 -> rain jacket
            not raining + temp > 70 -> light clothing
         */
        Scanner scan = new Scanner(System.in); // we instantiated a Scanner class to get input from user

        String stayInside = "Stay indoors.";
        String coat = "Put on a coat!";
        String lightClothes = "Put on a light clothing!";
        String umbrella = "";

        System.out.println("Is it raining outside? Type 'Y' for Yes or 'N' for No");
        char yesOrNo = scan.nextLine().charAt(0); // in order to take char as an input we will use next() or nextLine()
        // to take it as a String and then get the first character of it by using charAt(0) method;

        boolean isRaining = false; // expecting a boolean input from user
        if (yesOrNo == 'y' || yesOrNo == 'Y') isRaining = true;
        // isRaining = yesOrNo == 'y' || yesOrNo == 'Y' ? true : false;

        // jacket variable will get it's value depending on the isRaining value
        // if isRaining true then it will have "Put on a RAIN jacket!"
        // if isRaining false then it will be assigned "Put on a jacket!"
        String jacket = isRaining ? "Put on a RAIN jacket!" : "Put on a jacket!";

        System.out.println("What is the temp outside?");
        byte temp = scan.nextByte(); // expecting a byte input from use

        if (isRaining) {
            System.out.print("Grab your umbrella! And ");
            // temp < 30 -> stay indoors
            if (temp < 30) {
                System.out.println(stayInside);
            }
            // raining + temp >= 30 and 50 ->  coat + umbrella
            if (temp >= 30 && temp <= 50) {
                System.out.println(coat + umbrella);
            }
            // raining + temp >= 50 and 70 -> rain jacket + umbrella
            if (temp > 50 && temp <= 70) {
                System.out.println(jacket + umbrella);
            }
            // raining + temp > 70 -> light clothing + umbrella
            if (temp > 70) {
                System.out.println(lightClothes + umbrella);
            }
        } else {
            // temp < 30 -> stay indoors
            if (temp < 30) {
                System.out.println(stayInside);
            }
            // raining + temp >= 30 and 50 ->  coat
            if (temp >= 30 && temp <= 50) {
                System.out.println(coat);
            }
            // raining + temp >= 50 and 70 -> rain jacket
            if (temp > 50 && temp <= 70) {
                System.out.println(jacket);
            }
            // raining + temp > 70 -> light clothing
            if (temp > 70) {
                System.out.println(lightClothes);
            }
        }
    }
}
