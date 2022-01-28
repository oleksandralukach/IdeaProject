package homework_assignments;

public class HomeWork_7_LogicalOperators {
    public static void main(String[] args) {

        //1)
        //Write an expression for all unmarried male, age between 21 and 35,
        //with height above 180, and weight between 70 and 80.

        int age = 21;
        int height = 180;
        int weight = 70;
        boolean isHeight = height >= 180;
        boolean male1 = age >= 21 && age < 35;
        boolean male2 = weight >= 70 && weight < 80;

        String male3 = male1 && male2 && isHeight? "Yes, user is qualified" : "No, user is not qualified";
        System.out.println(male3);

        // 2) Given the year, month (1-12), and day (1-31), write
        // a boolean expression which returns true for dates before October 15,
        // 2010 (Gregorian calendar cut-over date).

        int year = 2010;
        int month = 12;
        int day = 25;

        // using ternary operator:
        String calendar = (year < 2010 || (year == 2010 && month <10) || (year == 2010 && month == 10 && day < 15))? "Yes":"No";
       System.out.println(calendar);

       //using boolean:
        boolean isValid = (year < 2010 || (year == 2010 && month <10) || (year == 2010 && month == 10 && day < 15));
        System.out.println(isValid);

        //using if statement:
        if (year < 2010 || (year == 2010 && month <10) || (year == 2010 && month == 10 && day < 15)) {
            System.out.println ("true");}
        else
            System.out.println("false");

        // ========================================================================
//                int a = 1;
//                int b = 10;
//
//                if (!(a>4 && b<12)) {
//                    System.out.println("I am learning logical operators");
//                }
//                System.out.println("So what would be printed out in a console?");

        //=====================================================================

        int a = 101;
        int b = 10;

        if (a < b) {
            System.out.println("b is greater");
        }
        if (a > b) {
            System.out.println("a is greater");
        }
        if (a >= b) { // A IS GREATER or equal to be
            System.out.println("a is greater and equal to b");
        }
        if (a <= b) {
            System.out.println("a is less and equal to b");
        }
        if (a == b) {
            System.out.println("a is equal to b");
        }
        if (a != b) {
            System.out.println("a is not equal to b");
        }
    }
}
