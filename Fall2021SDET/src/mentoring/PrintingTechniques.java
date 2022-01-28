package mentoring;

public class PrintingTechniques {
    public static void main(String[] args) {
         // difference between System.out.print() and prinln()
        //println() - break line at the end of the statement (after this statement)
        System.out.print("Line 1");
        System.out.print("Line 2");
        System.out.println();//once you are done start next line

        //print out - "Stay hungry, stay foolish" - Steve Jobs
        //double quotes
        System.out.println("\"Stay hungry, stay foolish\" - Steve Jobs");

        //sysout("");
        System.out.println("-----------");

        // how to end line/break line
        System.out.println("I am\nentering a new line");

        //tab -> \t - 2-5 characters space
        //deleting on last character \b
        System.out.println("Hello\b World!");

        //stand for print function
        //we can use to better format what we are printing
        //2      x      iphone 13 Pro Max         $1399.00
        //quantity
        //description
        //price

        byte quantity = 2;
        String description = "iphone 13 Pro Max";
        double price = 1399.00;
        System.out.println(quantity + "\tX\t" + description +"\t$" + price);

        System.out.printf("quantity is %s", quantity);
        System.out.println();
        System.out.printf("quantity is %s and price is %s", quantity, price);
        System.out.println();
        System.out.printf("%s\tX\t%s\t$%s", quantity, description, price);

    }
}
//class structure
//public class Name {
/*
code
 */
