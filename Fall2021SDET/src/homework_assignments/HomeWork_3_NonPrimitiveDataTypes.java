package homework_assignments;

public class HomeWork_3_NonPrimitiveDataTypes {
    public static void main(String[] args) {
        System.out.println("Letter to yourself");
        //Write a program that displays your name and address on the screen as if it were a letter.

        String myName = "Aleksandra Lukach";
        String myAddress = "1 Microsoft Way";
        String myTown = "Redmond, WA 98144";

        System.out.println("+---------------------------------------------------------+");
        System.out.println("|                                                     ####|");
        System.out.println("|                                                     ####|");
        System.out.println("|                                                     ####|");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|                                 " + myName + "       |");
        System.out.println("|                                  " + myAddress + "        |");
        System.out.println("|                                 " + myTown + "       |");
        System.out.println("|                                                         |");
        System.out.println("+---------------------------------------------------------+");

        System.out.println("More Variables And Printing");
        System.out.println();
        // Please declare here the needed variables with the correct data types.

        String myName2 = "Zed A. Shaw";
        byte myAge = 35;     //
        float myHeight = 74.5f;  // inches
        float myWeight = 180.0f; // lbs
        String myEyes = "Blue";
        String myTeeth = "White";
        String myHair = "Brown";

        System.out.println( "Let's talk about " + myName2 + "." );
        System.out.println( "He's " + myHeight + " inches tall." );
        System.out.println( "He's " + myWeight + " pounds heavy." );
        System.out.println( "Actually, that's not too heavy." );
        System.out.println( "He's got " + myEyes + " eyes and " + myHair + " hair." );
        System.out.println( "His teeth are usually " + myTeeth + " depending on the coffee." );

        System.out.println( "If I add " + myAge + ", " + myHeight + ", and " + myWeight
                + " I get " + (myAge + myHeight + myWeight) + "." );

    }
}
