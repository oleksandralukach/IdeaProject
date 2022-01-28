package homework_assignments;

import java.util.Scanner;

public class PowerOfNumber {
    /*
    Write a Java program to compute the power of a number (acceptable boundaries for power is 0 till 9).
Example:
Input the number: 2
Input the Power: 5
Expected Output
Result: 64
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please input number: ");
        int num = input.nextInt();
        System.out.println("Please input power: ");
        int power = input.nextInt();
        int result = 0;

        if (power >= 0 && power <=9) {
            if (power == 0){
                result = 1;
            } else if (power == 1){
                result = num;
            } else if (power == 2){
                result = num * num;
            }else if (power == 3){
                result = num * num * num;
            }else if (power == 4){
                result = num * num * num * num;
            }else if (power == 5){
                result = num * num * num * num * num;
            }else if (power == 6){
                result = num * num * num * num * num * num;
            }else if (power == 7){
                result = num * num * num * num * num * num * num;
            }else if (power == 8){
                result = num * num * num * num * num * num * num * num;
            }else if (power == 9){
                result = num * num * num * num * num * num * num * num * num;
            }
        } else {
            System.out.println("Invalid input. Acceptable boundaries for power is 0 till 9");
        }
        System.out.println("Number " + num + " power " + power + " is " + result);
    }
}
