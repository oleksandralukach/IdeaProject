package if_else_statements_oca_ch2;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        // print out the grade depending on the test Grade
        // if between 90 - 100 -> A
        // if between 80 - 89 -> B
        // if between 70 - 79 -> C
        // if between 60 - 69 -> D
        // if between 50 - 59 -> E
        // if below 50 -> F

        Scanner s = new Scanner(System.in);

        System.out.println("Please enter your test Grade: ");
        int testGrade = s.nextInt();
        char grade = ' ';

        if (testGrade <= 100 && testGrade >= 90) {
            System.out.println (grade = 'A');
        } else if (testGrade <= 89 && testGrade >= 80)
            System.out.println (grade = 'B');
        else if (testGrade <= 79 && testGrade >= 70)
            System.out.println (grade = 'C');
        else if (testGrade <= 69 && testGrade >= 60)
            System.out.println (grade = 'D');
        else if (testGrade <= 59 && testGrade >= 50)
            System.out.println (grade = 'E');
        else if (testGrade < 50)
            System.out.println (grade = 'F');
        else {
            System.out.println("Grade is invalid");}

        if (testGrade > -1 && testGrade <101) {
                System.out.println("Your test score is: " + testGrade);
                System.out.println(" our garde is: " + grade);
        }
    }
}

