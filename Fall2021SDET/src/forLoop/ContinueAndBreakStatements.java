package forLoop;

public class ContinueAndBreakStatements {
/*
break statement -> switch and loops can contain break statements to stop the iteration of
the nearest loop.

continue statement stops one iteration in a loop and continues to the next iteration.

breakPointOfTheLoop -> optional label to continue or break statement
 */

    public static void main(String[] args) {

        String school = "Devx School";

        breakPointOfTheLoop:
        for (int i = 0; i < school.length(); i++) {

            if (school.charAt(i) == 'h') continue;
            if (school.charAt(i) == 'o') break breakPointOfTheLoop; // optional label
            System.out.print(school.charAt(i) + "");
        }

        //==========================================

        // print

        int i = 0;
        optOutOfWhile:
        while (i < 10) {
            i++;
            if (i == 3 || i == 5) break optOutOfWhile;
            System.out.println("Value of i " + i);

        }
    }
}
