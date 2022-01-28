package java_operators;

public class TernaryOperator {
    public static void main(String[] args) {

        /*
         * variable varName = (expression) ? expressionIsTrue: expressionIsFalse;
         * The origin of the name “ternary” refers to how a ternary operator has three parts.
         * Our statement takes in three operands:
         * expression is the expression the operator should evaluate
         * expressionIsTrue is the value assigned to variable if the expression is true
         * expressionIsFalse is the value assigned to variable if the expression is false
        */

        int x = 1;
        int y = 2;

        int res;

        res = (x < y) ? x : y; // the value that res variable will get assigned
        // depends on the outcome of the expression
        // if x is smaller than y, then x will be the value assigned to res
        // otherwise if x is greater than y, then y will get assigned to res

        System.out.println("The value of \"res\" is: " + res);

        // suppose we have an e-commerce website and the users are allowed to make purchases
        // only if they are 16 y.o. or older

        int age = 15;

        String qualification = (age >= 16) ? "Yes, user is 16 or older." : "No, user is not qualified.";

        System.out.println("Hello welcome to our store. Please let us check if you qualify to proceed " +
                "to make a purchase!");
        System.out.println("Is the user qualified to make purchase? " + qualification);
    }
}
