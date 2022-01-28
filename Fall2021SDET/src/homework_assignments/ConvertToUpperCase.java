package homework_assignments;

import java.util.Locale;
import java.util.Scanner;

public class ConvertToUpperCase {
    /*
    Write a Java program to convert all the characters in a string to lowercase and uppercase.
    OPTIONAL:
If you want you can try to use different methods
to change the string (for loop, while loop, prescribed methods)
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input string: ");
        String str = scan.nextLine();
        covertToLowerCase(str);
        covertToUpperCase(str);

//        String str2 = "DevX";
//        int i = 0;
//
//        // while loop option
//        while (i < 1){
//            str2 = str2.toUpperCase();
//            System.out.println(str2);
//            str2 = str2.toLowerCase();
//            System.out.println(str2);
//            i++;
//        }
//
//        // for loop option:
//        for (int in = 0; in < 1; in++){
//            str2 = str2.toUpperCase();
//            System.out.println(str2);
//            str2 = str2.toLowerCase();
//            System.out.println(str2);
//        }
    }

    public static String covertToUpperCase (String str){
        String strUpperCase = str.toUpperCase();
        System.out.println(strUpperCase);
        return strUpperCase;
    }
    public static String covertToLowerCase (String str){
        String strLowerCase = str.toLowerCase();
        System.out.println(strLowerCase);
        return strLowerCase;
    }
}
