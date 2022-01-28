package homework_assignments;

import java.util.Scanner;

public class MethodsPracticeClass {
    /*
    the task is to create a class called MethodsPracticeClass;
1. create main method
2. create a static method that prints out your name
3. create a nonstatic method that takes as a parameter your age and prints out by subtracting 10 out of it
4. create a static private method that asks for an input for your favorite quote and prints it out
NOTE: make sure to call those methods from your main() method
but remember the ways to call the static and nonstatic methods from the static main() method.
[Hint: some method will require an object creation before calling them]
5. add a nonstatic method and call that from printQuote method to print out your favorite quote.
6. Create a static method that takes data about person’s dob, firstName, lastName, height, weight
as parameters and checks whether the height of person is above 160 cm and weight is less than 220 lbs, if it matches those
 conditions then print
out saying you qualify for United States Air Force if not then sorry you don’t qualify.
     */
    public static void main(String[] args) { //1.

        printMyName();

        //==============================================================================================================

        MethodsPracticeClass object = new MethodsPracticeClass();
        object.printSubtraction(29);
        // or:
//        new MethodsPracticeClass().printSubtraction(29);

        //==============================================================================================================

        takeInputFromUserAndPrintQuote();

        //==============================================================================================================

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your DOB: ");
        String dOB = scan.nextLine();
        System.out.println("Please enter your first name: ");
        String firstN = scan.nextLine();
        System.out.println("Please enter your last name: ");
        String lastN = scan.nextLine();
        System.out.println("Please enter your height: ");
        double height = scan.nextDouble();
        System.out.println("Please enter your weight: ");
        double weight = scan.nextDouble();

        printQualificationForAirForce(dOB,firstN,lastN,height,weight);

    }

    public static void printMyName(){ // 2.

        System.out.println("My name is Alex");
    }

    public void printSubtraction(int myAge){ // 3.

        System.out.printf("My age by subtracting 10 out of it is: %s", myAge - 10);
        System.out.println();
    }

    private static void printMyFavoriteQuote(String favoriteQuote){ // 4.1

        System.out.printf("My favorite quote is:\n%s", favoriteQuote);
        System.out.println();
    }

    public static void takeInputFromUserAndPrintQuote (){ // 4.2

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your favorite quote: ");
        String myFavoriteQuote = scan.nextLine();

        printMyFavoriteQuote(myFavoriteQuote);
    }
    public static void printQualificationForAirForce (String dob, String firstName, String lastName, double height, double weight){ //6.

        if (height >= 160 && weight <= 220){

            System.out.println("You qualify for United States Air Force");
        } else {

            System.out.println("You not qualify for United States Air Force");
        }
    }
}
