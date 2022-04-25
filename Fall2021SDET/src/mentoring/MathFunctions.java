package mentoring;

import java.util.Random;
import java.util.Scanner;

public class MathFunctions {
    public static void main(String[] args) {
        //Math.sqrt() is overloading method(it can take double, int, long) but only returns double
        //Math.round() will round the number to the nearest whole number
        System.out.println("The square root of 6 is: " + Math.round(Math.sqrt(6)));

        System.out.println("The max number out of 6,9,10:" + Math.max(Math.max(6, 9), 10));

        // Math.random() - return double value of 0.0 to 1.0. so multiply it to num you want to have selection of
        // But better use Random class with the seed(range from 0 to your seed):
        Random random = new Random(9);
        int randomNum = (int) (Math.random() * 9);

        System.out.println("Guess the number: ");
        Scanner input = new Scanner(System.in);
        int guessNum = input.nextInt();
        int count = 1;

        //limited tries:
        for (int i = 1; i < 4; i++) {
            if (randomNum > guessNum && count < 3) {
                System.out.println("Too small! Try one more time. You have: " + (3 - i) + " tries left");
                guessNum = input.nextInt();
            } else if (randomNum < guessNum && count < 3) {
                System.out.println("Too big! Try one more time. You have: " + (3 - i) + " tries left");
                guessNum = input.nextInt();
            } else if (randomNum == guessNum){
                    System.out.println("You won!");
                    break;
                }
            count++;
        }

        if (randomNum != guessNum) {
            System.out.println("You lost!");
        }
        System.out.println("random num is: " + randomNum);

        //unlimited tries:

        while (randomNum != guessNum) {
            if (randomNum < guessNum) {
                System.out.println("Too big! Try one more time");
            } else {
                System.out.println("Too small! Try one more time");
            }
            guessNum = input.nextInt();
        }

        System.out.println("You won!");

    }
}
