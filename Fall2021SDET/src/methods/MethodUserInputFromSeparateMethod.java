package methods;

import java.util.Scanner;

public class MethodUserInputFromSeparateMethod {

    public static void takeInputFromUser(){

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter unit number");
        int unit = scan.nextInt();
        scan.nextLine();
        System.out.println("Please enter street");
        String street = scan.next();
        System.out.println("Please enter city");
        String city = scan.next();
        System.out.println("Please enter state");
        String state = scan.next();
        System.out.println("Please enter zip");
        int zipcode = scan.nextInt();

//        //printAddress(unit,street,city, state, zipcode); //or:
//        System.out.println("The address: "
//                + unit + "\n"
//                + street + "\n"
//                + city + "\n"
//                + state + ", " + zipcode);
    }

    public static void printAddress(int unit, String street, String city, String state, int zipcode) {

        System.out.println("The address: "
                + unit + "\n"
                + street + "\n"
                + city + "\n"
                + state + ", " + zipcode);
    }
    public static void main(String[] args) {

        takeInputFromUser();
    }
}
