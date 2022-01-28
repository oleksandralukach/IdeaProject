package oop.class9Exeptions;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        String value = "$12";

        try {
            System.out.println(Integer.parseInt(value));
        } catch (NumberFormatException e) {
            System.out.println("Error.Please enter only digits");
        }
//=====================================================================

        int a = 10, b = 0;

        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        sc.close(); //-> in finally

        try {
            System.out.println(a / b);
        } catch (Exception e) { //back up plan

        } finally {

            System.out.println("2nd");
            System.out.println("3nd");
        }
    }
}
