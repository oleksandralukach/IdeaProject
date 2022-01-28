package java_operators;

public class LogicalOperators {
    public static void main(String[] args) {
        /*
        There are 2 types of logical operators:
        1 - conditional OR -> ||
        2 - conditional AND -> &&
        * Conditional OR will evaluate to TRUE if only one side is TRUE;
        * Conditional AND will evaluate to TRUE only if BOTH sides are TRUE;
         */

        boolean b = true || false;
        System.out.println("OR operator: true || false will evaluate to: " + b);

        boolean b1 = false || false;
        System.out.println("OR operator: false || false will evaluate to: " + b1);

        boolean b2 = true && false;
        System.out.println("AND operator: true && false will evaluate to: " + b2);

        boolean b3 = false && false;
        System.out.println("AND operator: false && false will evaluate to: " + b3);

        boolean b4 = true && true;
        System.out.println("AND operator: true && true will evaluate to: " + b4);

        // these conditional logical operators can be used
        // as long as the expressions on both sides have boolean outcome
        int i1 = 12;
        int i2 = 34;

        boolean b5 = false;
        boolean b6 = b5 || i1 > i2;

        System.out.println("The result: " + b6);

        int x = 6;
        boolean y = x > 6 && x < 6 || x++ <= 7 && x > 6 && x == 7; // Page 65 of the OCA book for this example
        System.out.println("The final value of y is: " + y + ". And the value of x is: " + x);
        //int x = 6;
        //boolean y = (x >= 6) || (x++ == 7) && (x > 6);
        //System.out.println(y);
        //System.out.println(x);// value of x here was not post-incremented (updated) to "7"
        // Because x >= 6 is true, the increment operator on the right-hand side
        // of the expression is never evaluated, so the output is 6.

        /*
         XOR -> Exclusive OR x ^ r
         if both sides of the operation have the same value then it evaluates to false
         and if one side is true then it becomes true
        */

        boolean b7 = 4 < 5 ^ 6 > 7;
        System.out.println("b7: " + b7);

        // since both sides have the same value it will evaluate to false
        boolean b8 = true ^ true ^ false;
        System.out.println("b8: " + b8);
    }
}
