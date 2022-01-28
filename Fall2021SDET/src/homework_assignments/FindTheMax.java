package homework_assignments;

import java.util.Scanner;

public class FindTheMax {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number for 'a': ");
        int a = input.nextInt();
        System.out.println("Please enter a number for 'b': ");
        int b = input.nextInt();
        System.out.println("Please enter a number for 'c': ");
        int c = input.nextInt();

        int max = 0;

        if (a > b && a > c){
            max = a;
        } else if (b > c && b > a){
            max = b;
        } else if (c > a && c >b){
            max = c;
        } else if (a == b && a > c ){
            max = a;
        } else if (a == c && a > b){
            max = b;
        } else if (b == c && c > a){
            max = c;
        } else {
            System.out.println("The are equal");
        }

        System.out.println("The max number is: " + max);
    }
}
