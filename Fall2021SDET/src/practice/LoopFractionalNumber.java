package practice;

public class LoopFractionalNumber {
    /*
    Write a program to find the factorial value of any number entered through the keyboard.
    5! = 1*2*3*4*5
     */

    public static void main(String[] args) {

        int num = 5;
        int factorialOfNum = 1;

       for(int i = 0; i < num; i++){
            factorialOfNum += factorialOfNum * i;
        }

//        for(int i = 1; i <= num; i++)
//        {
//            factorialOfNum = factorialOfNum * i;
//        }

        System.out.println(factorialOfNum);
    }
}
