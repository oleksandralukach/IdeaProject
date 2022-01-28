package java_operators;

public class ConstantVariable {

        int i1; // instance variable - field
        static double PI = 3.14; // class variable because it belongs to the class now

        public static void main(String[] args) {
            //local variable - inside a method
            //scope - inside curly braces

            // Assignment operator will start from right to left
            /* whatever the value that's on the right side of the '=' sign
             will get assigned to the variable on the left of the '=' */
            // EX: int a;
            // a = 5; we are assigning 5 to variable a and this is also known as initialization of a variable

            int i; // declared but not initialized
            i = 3; // now i has been initialized
            System.out.println(i);
            i += 2; // i = i + 2 -> now i = 5
            System.out.println(i);
            System.out.println(i = 4); // the order here is first 4 will be assigned to i
            // then System will print i
            i = 10/2;
            System.out.println(i);

            int x;
            int z;
            System.out.println("The value of x is: " + (x = i = z = 9)); // all these variables are getting 9 assigned to them as value
            // but when we print out this statement the value of x will get printed out

            // There are variables called constants and they are also known as final variables
            // because "final" keyword is used in initialization of the variable
            // they can be declared and initialized only once
            // they cannot be updated during program execution so they are called immutable variables
            // CONSTANTS are capitalized [upper cased]

            final String DOB;
            DOB = "01/01/1871";
            // DOB = "Hi";

            System.out.println(DOB);
            System.out.println(DOB + "Mars"); // this is only string concatenation for printing out but the
            // DOB constant value is not being updated
            System.out.println(DOB);

            // The PI static final variable is static and it can be accessed within main() method
            // because both are static
            System.out.println("The value of PI: " + PI);

    }
}