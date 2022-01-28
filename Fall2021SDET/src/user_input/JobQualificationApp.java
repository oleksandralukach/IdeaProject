package user_input;

import java.util.Scanner;

public class JobQualificationApp {

    public static void main(String[] args) {
        /*
        1. We want to get full name -> String
        2. age -> short
        3. Years of experience -> byte
        4. Eligible to work -> boolean
        5. Expected compensation -> double
         */

        System.out.println("Welcome to ZIP recruiter. Please fill in the requirements");
        Scanner input = new Scanner(System.in);

        System.out.println("Your name");
        String name = input.nextLine();

        System.out.println("Your age");
        short age = input.nextShort();

        System.out.println("Enter the number years you have worked in IT");
        byte experience = input.nextByte();

        System.out.println("Are you eligible to work. Type 'y' for yes or 'n' to no");
        //char isEligible = 'y';
        //boolean isEligible2 = isEligible== 'y'? true : false;

        char workEligibility = input.next().charAt(0);
        boolean isEligible = workEligibility =='y';

        System.out.println("What is your expected annual compensation?");
        double comp = input.nextDouble();

        System.out.println("Candidate info\n"
                + name +"\n"
                + age + "\n"
                + experience + "\n"
                + (isEligible ? "Yes" : "No") + "\n"
                + comp);

        boolean isQualified = isEligible
                && comp <= 140_000
                && experience>=5
                && age>=21;

        System.out.println(isQualified ? "The candidate is qualified": "The candidate is not qualified");




    }
}
