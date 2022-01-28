package while_loop;

import java.util.Scanner;

public class While_Loop1 {

    /*
    while loops are used for repeated function
    It is a repetition control structure in java
     */

    public static void main(String[] args) {

        // in below while statement we are printing num from 1 to 10 including
        // and in order to break [stop] the iteration of the loop
        // we have to control the condition

        // condition defines how many times the iterations do you need to run

        // print out n form 1 to 10 times (by incrementing n on each iteration)
        // 1
        // 2
        // 3
        // ....
        int n = 1;

        while (n <= 10) {

            System.out.println(n);
            n = n + 1; //condition update expression
            // we are updating the value of n by adding 1 on each iteration of while loop
            // n += 1 or n++
        }

        if (n == 10) {
            System.err.println("Yeah");
        }

        //===========================================================

        // print out "8" 10 times (by incrementing n on each iteration)
        // 1
        // 2
        // 3
        // ....
        int num = 1;

        while (num <= 10) {

            System.out.println(8);
            num = num + 1; //condition update expression
            // we are updating the value of n by adding 1 on each iteration of while loop
            // n += 1 or n++
        }

        //===========================================================

        // print out "DevX" 5 times ( by incrementing "counter" each iteration
        // and this way updating the expression/condition
        // (controlling the condition - controlling iteration)

        // DevX
        // DevX
        // DevX
        // ....
        int counter = 0;
        int amountOfTimes = 5; //amount of times it will be run

        while (counter < amountOfTimes) {
            System.out.println("DevX");
            ++counter; //condition update expression
        }
        //===========================================================

        // JAVA - 1
        // JAVA - 2
        // JAVA - 3
        // .....

        int counter2 = 0;
        while (counter2 < 7) {

            // counter2++; // incrementing condition before printing bc we want to start from 1
            // increment has higher precedence of operation
            System.out.println("JAVA" + ++counter2);

        }

        // calculate the sum of numbers from 1-12;
        // ex: 1 + 2 + 3+ 4 + 5 + 6 + 7 + 8 + 9 + 10 + 11 + 12
        // 1 + 2 + 3 ......... = 78;

        int counter3 = 0;
        int sum = 0; // if we want to update value in loop
        // important to keep initialized variable outside while loop

        while (counter3 < 12) {

            // int sum = 0; // dangerous bc before every iteration sum will be reinitialized to 0

            ++counter3;
            System.out.print(counter3 + " + ");
            sum += counter3;
            System.out.println(sum);
        }

        //===========================================================================

        // ask to enter 5 exam scores
        // and print out the average
        // ex:
        // Enter Score 1
        // 100
        // your average score is: 70

        Scanner scan = new Scanner(System.in);

//        System.out.println("How many scores: ");
//        int amountOfScores = scan.nextInt();
//        int scoreCounter = 0;
//        // calculate the sum of all scores
//        int allScoresSum = 0;
//
//        while (scoreCounter < amountOfScores) {
//
//            System.out.println("Enter exam score: ");
//            int score = scan.nextInt();
//
//            allScoresSum += score;
//
//            scoreCounter++;
//
//        }
//
//        // use the result of calculation outside the loop, so its printing just once
//        System.out.println("Your average score is: " + allScoresSum / amountOfScores);

        // =====================================================================================

        // ask user to enter score
        // ask user if they want to enter another score

        // ex: Please enter score
        // 100
        // Do you want to enter another score?
        // yes, no

        // variable declared in the loop body is not visible
        // on the condition level
        String answer = "yes";
        int counter4 = 0;
        int allScores = 0;

        while (answer.equalsIgnoreCase("yes")) {
            System.out.println("Please enter score: ");
            int score = scan.nextInt();
            scan.nextLine();

            System.out.println("Do you want to enter another score?: ");
            answer = scan.nextLine().trim();
            counter4 += 1; // or counter4++;
            allScores+=score;
        }

        System.out.println("Average: " + allScores/counter4);

        // ===========================================================

        // D
        // e
        // v
        // X
        String str ="DevX School";
        int in = 0;
        while(in < str.length());{
            System.out.println(str.charAt(in));
            in++;
        }
    }
}
