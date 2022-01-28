package format_printing;

import java.util.Calendar;

public class FormatPrintingEx {

        // Formatting Numeric Print Output - is a way we can control the format of our output print
        // especially useful to print out Calendar date and time, double and floating number so that
        // we can format the number of digits that can be printed after the decimal point

        // Format specifiers are special characters that start with a percent sign [%] and followed by a
        // letter are used to specify the output format and the data type
        // of the varargs. Varargs are the arguments that we pass as a variable to be printed

        // % - placeholder for variable (varargs)
        // , var - varargs (arguments)
        // -> argument specifiers (used to specify the output format and the data type):
        // %d -> integer
        // %s -> string
        // %f -> float and double
        // %n -> new line


        public static void main(String[] args) {

            int numberOfMonthsInAYear = 12;

            // formatting method
            System.out.format("Number of months in a year is %d as an int %n", numberOfMonthsInAYear+1);

            //regular print out
            System.out.println("Number of months in a year is " + numberOfMonthsInAYear + " as a String");

            String schoolName = "Devx";
            System.out.printf("The name of the school is %S\n", schoolName);

            double PI = 3.14149265359;
            System.out.println("The value of PI is " + PI + " <- println()");
            System.out.format("The value of PI is %.3f <- format() %n", PI); // '.3f' -> format specifier

            Calendar cal = Calendar.getInstance();
            System.out.format("%tB %te, %tY %n", cal, cal, cal); // November 01, 2021

            System.out.println("Year is " + 2021 + 1); //20211
            System.out.printf("Year is %d%n", 2021 + 1); // 2022
            System.out.printf("!Year is %s%n", 2021 + "" + 1); // 20211
            System.out.println(2021 + 1 + " year"); // 2022 year
            System.out.println( 2021 + "" + 1 + " year"); // 20211 year

        }
}
