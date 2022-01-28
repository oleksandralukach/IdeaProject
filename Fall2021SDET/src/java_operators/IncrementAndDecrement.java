package java_operators;

public class IncrementAndDecrement {
    public static void main(String[] args) {

            // We have 2 types of updating the value of a variable in unary operation which means
            // only one operand is required

            // Increment [increase] - which adds 1 to the value of a variable
            // Decrement [decrease] - which subtracts 1 from the value of a variable

            int i = 1;
            System.out.println("First value of i: " + i);
            i = i + 1; // i += 1;
            System.out.println("Second value of i: " + i);
            i += 1; // i = i + 1;
            System.out.println("Third value of i: " + i);

            i++; // this is called postfix increment [post increment] -> i = i + 1 or i += 1
            System.out.println("The value of i after auto increment: " + i);
            System.out.println(i++); // the post increment affects the value of a variable on the next statement only
            System.out.println(i);

            i--; // post decrement and it decreases the value of a variable by 1. -> i = i - 1 or i -= 1;
            System.out.println("After decrement: " + i); // the value of i is 4

            i = i++ + i-- + i--; // order precedence of increment/decrement takes higher precedence over math operation
            System.out.println(i);

            // Prefix increment [pre increment]
            int x = 1;
            System.out.println("The value of x: " + ++x);

            // Pre decrement where the value of a variable will be decreased by 1
            System.out.println("At the pre decrement: " + --x);
            System.out.println(--x);


            float f1 = 1.2f;
            f1++; // equivalent to 1.0 + 1.2 because java implicitly upcast the smaller data type to larger data type
            System.out.println("The float after post increment: " + f1);

            int counter = 0;
            System.out.println(counter); // Outputs 0
            System.out.println(++counter); // Outputs 1
            System.out.println(counter); // Outputs 1
            System.out.println(counter--); // Outputs 1
            System.out.println(counter); // Outputs 0

            int x1 = 3;
            int y = ++x1 * 5 / x1-- + --x1;
            System.out.println("x is " + x1);
            System.out.println("y is " + y);

    }
}
