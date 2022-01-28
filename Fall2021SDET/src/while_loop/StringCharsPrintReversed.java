package while_loop;

public class StringCharsPrintReversed {

    // ex: reverse ("Hello") -> olleH
    // without using SB

    public static void main(String[] args) {

        System.out.println(reverse("1DevX"));
        System.out.println(reverse2("2Devx"));
        printCharsOfStringReversed("3Devx");

    }
    // using predefined word with predefined amount of chars
    static String reverse(String str) {

        String result = "";

        result += str.charAt(4);
        result += str.charAt(3);
        result += str.charAt(2);
        result += str.charAt(1);
        result += str.charAt(0);

        return result;
    }

//==================================================================

    // using while loop
    static String reverse2(String str) {

        String result = "";
        // counters also can be viewed as starting point of the loop
        int index = str.length() -1;

        while(index >= 0 ) {
            result += str.charAt(index);

            index--; // condition update to go in reverse
        }

        return result;
    }


//    static String printCharsOfStringReversed(String str) {
//
//        int i = str.length() - 1; // last char index // 3
//
//        String s = "";
//
//        while (i >= 0) {
//            System.out.println(str.charAt(i));
//            s += str.charAt(i);
//
//            i--; // to go in reverse
//        }
//
//        return s;
//    }

        public static void printCharsOfStringReversed(String str) {

            int i = str.length() - 1; // last char index // 3

            while (i >= 0) {
                System.out.println(str.charAt(i));

                i--; // to go in reverse

            }
        }
}
