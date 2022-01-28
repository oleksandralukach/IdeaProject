package practice;

public class FactorialNum {

    // 5! = 1*2*3*4*5
    // factorial number is function that multiplies the number by every natural number below it.
    public static void main(String[] args) {

        int factorialNum = 1;

        for(int i = 1; i <= 5; i++){

            factorialNum *= i;
        }
        System.out.println(factorialNum);

    }
}
