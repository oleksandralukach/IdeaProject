package coding_bat.array_1;

import java.util.Scanner;

public class ArraysCentsToDollar {

    public static int[] getCentsToDollars(int cents) {

        return new int[]{cents / 100, cents % 100};
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        int cents;
        System.out.print("Input the cents: ");
        cents = scan.nextInt();

        int[] result = getCentsToDollars(cents);
        System.out.println("That is " + result[0] + " dollars and " + result[1] + " cents");
        scan.close();
    }
}