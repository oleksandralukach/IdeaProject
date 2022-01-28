package strings;

import java.util.Locale;
import java.util.Scanner;

public class ToUpperCase {

    // public String toUpperCase()
    // returns a string by converting each character in it to upper case

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the word: ");
        String input = scan.nextLine();
        System.out.println(input.toUpperCase());

        int index = lookForChar(input.charAt(input.length() -1),input);
        System.out.println(index);
    }

    static int lookForChar (char c, String str){

        if (c == str.charAt(str.length()-1)){
            System.out.println("This is the last char");
            return 100;
        }
        else if (str.indexOf(c) == -1){
            System.out.println("Not found");
            return 999;
        }
        else
            return str.indexOf(c);
    }
}
