package homework_assignments;

import java.util.Scanner;

public class GradeAverage {
    /*
    This program calculates the grade of a student based on the marks entered by user in each subject.
    Program prints the grade based on this logic.
If the average of marks is >= 80 then prints Grade ‘A’
If the average is <80 and >=60 then prints Grade ‘B’
If the average is <60 and >=40 then prints Grade ‘C’
else prints Grade ‘D
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input your first mark: ");
        int mark1 = input.nextInt();
        System.out.println("Input your second mark: ");
        int mark2 = input.nextInt();
        System.out.println("Input your third mark: ");
        int mark3 = input.nextInt();

        int average = (mark1 + mark2 + mark3) / 3;

        if (average >= 80){
            System.out.println("Grade 'A'");
        } else if (average >= 60 && average < 80){
            System.out.println("Grade 'B'");
        } else if (average >= 40 && average < 60){
            System.out.println("Grade 'C'");
        } else {
            System.out.println("Grade 'D'");
        }

    }
}
