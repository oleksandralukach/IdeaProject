package homework_assignments;

public class MethodForApplicant {

    /*
    Write a function which will ask user for:
1. years in college
2. years of programming experience
3. GPA
and return true or false.

An applicant must meet two conditions to be called for interview:
4 or more years of college, AND 2 years experience programming in Java
OR a grade point average greater than 3.5.
     */

    public static void main(String[] args) {

        System.out.println(isEligible(1,1,4.0));

    }

    public static boolean isEligible (int years, int experience, double gpa){

        boolean isE = ((years >= 4 && experience >= 2) || gpa > 3.5)? true : false;

        return isE;
    }

}
