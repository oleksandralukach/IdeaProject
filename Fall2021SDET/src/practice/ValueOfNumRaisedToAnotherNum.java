package practice;

public class ValueOfNumRaisedToAnotherNum {
    /*
    Two numbers are entered through the keyboard.
    Write a program to find the value of one number raised
    to the power of another. (Do not use Java built-in method)
     */
    public static void main(String[] args) {

        int base = 4;
        int power = 3;

        int numResult = 1; // 4 power 3 = 4 * 4 * 4 = 64

        //numResult = (int) Math.pow(base,power);

        for(int i = 1; i <= power; i++ ){

            numResult = numResult * base;
        }
        System.out.println(numResult);

    }
}
