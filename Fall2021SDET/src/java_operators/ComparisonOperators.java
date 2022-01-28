package java_operators;

public class ComparisonOperators {
    public static void main(String[] args) {

        /*
         * == returns true if both the left side and right side are equal when comparing 2 primitive types
         * != returns true if left side is not equal to the right side of operator.
         * > returns true if left side is strictly greater than right.
         * < returns true if left side is strictly less than right side.
         * >= returns true if left side is greater than or equal to right side.
         * <= returns true if left side is less than or equal to right side.
         */

        int num1 = 10;
        int num2 = 20;

        boolean isEqual = num1 == num2;
        System.out.println(isEqual);

        boolean isEqual2 = num1 != num2; // num1 = 10; num2 = 20; this should execute to true
        System.out.println(isEqual2);

        isEqual = isEqual2 = num2 != num1; // both of boolean variables are assigned same outcome of this comparison
        System.out.println(isEqual);

        boolean isGreater = num1 > num2;
        System.out.println("Is left side operand greater than right side operand? " + isGreater);

        boolean isLess = num1 < num2;
        System.out.println("is the left side less than the right? " + isLess);

        int var1 = 50;
        int var2 = 50;

        boolean isGreaterThanOrEqual = var1 >= var2;
        System.out.println("Is var1 greater than or equal to var2? " + isGreaterThanOrEqual);

        boolean isLessThanOrEqual = var1 <= var2;
        System.out.println("Is var1 less than or equal to var2? " + isLessThanOrEqual);
        // Logical complement or Negation Operator
        // Logical complement operator flips, changes the value of a boolean to it's opposite value.
        // boolean isOdd = true
        // then if I change isOdd to !isOdd then the value of isOdd executes to false

        isEqual = !isEqual;
        System.out.println(isEqual);

        isEqual = !true;
        System.out.println(isEqual);

        // Negation operator where it changes the value of a variable to negative
        int x = 1;
        System.out.println(x);
        x = -x;
        System.out.println(x);

        float f2 = 1.2F;
        f2 = -f2;
        System.out.println(f2);


    }
}
