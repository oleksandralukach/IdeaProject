package practice;

import java.util.Scanner;

public class ATMDoWhile {

    // After inserting your card
    // ask for pin code from customer
    // if you get it incorrectly then you will have 3 tries
    // if you get it wrong all 3 times then we need to print "Go into office or call 1-800-..."

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please insert your card and enter pin");

        int pin = 1234;
        int tries = 0;


        do {
            int enteredPin = scan.nextInt();

            if (enteredPin == pin) {
                System.out.println("Successful logged in");
                tries = 0;
            } else {
                tries++;
                if (tries < 3) {
                    System.out.println("Incorrect pin. Try again:");
                } else
                    System.out.println("You reached the limit");
            }

        } while (tries < 3);

        // ===================================
//        int counter = 0;
//
//        for (int i = 1; i <= 3; i++) {
//            int enteredPin = scan.nextInt();
//
//            if (enteredPin == pin) {
//                System.out.println("Successful login. Thank you!");
//                break;
//            } else {
//                counter++;
//                if (counter == 3) break;
//                System.out.println("Entered pin is incorrect. Please try again:");
//                i--;
//            }
//        }
//
//        if (counter == 3) {
//            System.out.println("You have reached the limit of tries. Your card is blocked.\n" +
//                    "Call 1-800-... to resolve!");
//        }
    }
}
