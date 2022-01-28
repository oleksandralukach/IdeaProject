package homework_assignments;

import java.util.Scanner;

public class Increase_The_Score {
    public static void main(String[] args) {
        /* Suppose that score is a variable of type double.
         Write the java statement that increases the score by
         5 marks if the score is between 80 and 90.
         */
            Scanner scan = new Scanner(System.in);
            System.out.println("please enter your score.");
            double score1 = scan.nextDouble();

            if (score1 >=80 &&  score1 <= 90) {
                double newScore= score1 + 5;
                System.out.println("the sum of the score is " + newScore);
            }
            else {
                System.out.println("the score is not within limits.");
            }
    }
}
