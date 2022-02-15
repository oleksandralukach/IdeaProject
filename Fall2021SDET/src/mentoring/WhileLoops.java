package mentoring;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WhileLoops {

    public static void main(String[] args) {

        // find the first o
        // how do you find the second o
        // how do you find the last o

        // What do I need to do if String does not have '0'
        // What do you want me to return?

        Scanner scan = new Scanner(System.in);
        String hasO = scan.nextLine();

        if(hasO.indexOf('o') == -1)
            System.out.println("The word has no \"o\"'s ");

        if(hasO.isEmpty()){
            System.out.println("String is empty. Please input a String");
        }

        int start = 0;
        int end = hasO.length() - 1;
        int temp2 = 0;


        int resultFirstO = hasO.indexOf('o');
        int resultLastO = hasO.lastIndexOf('o');
        int resultSecondO = hasO.indexOf('o', 2);


//        while (start < end) {
//
//            if (hasO.charAt(start) == 'o') {
//                System.out.println("First o is in index " + start);
//                break; // if no break all 'o' will be printed out
//            }
//            start++;
//        }

        //============================================================================

//        while (start < end) {
//
//            if (hasO.charAt(start) == 'o') {
//                System.out.println("First o is in index " + start);
//                temp2 = start+1;
//                System.out.println("Temp2 " + temp2);
//               // break; // if no break all 'o' will be printed out
//            }
//            if (start > temp2 && hasO.charAt(start) == 'o'){
//                System.out.println("second index is " + start);
//            }
//            start++;
//        }
//
//        //===================================================================
//
//        while (temp2 < end) {
//
//            if (hasO.charAt(temp2) == 'o') {
//                System.out.println("second index " + temp2);
//                break;
//            }
//            temp2++;
//        }

        //========================================

        while (start < end) {

            if (hasO.charAt(start) == 'o') {
                System.out.println("First o is in index " + start);
                temp2 = start+1;
                System.out.println("Temp2 " + temp2);
                break;
            }
            start++;
        }
        while(temp2 <= end){
            if (hasO.charAt(temp2) == 'o'){
                System.out.println("second index is " + temp2);
                break;
            }
            temp2++;
        }

    }

}