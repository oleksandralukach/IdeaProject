package while_loop;

public class StringCharsPrint {

    public static void main(String[] args) {

        printCharsOfString("Devx");
    }

    static void printCharsOfString(String str){
        int i = 0; // first char

        while (i < str.length()){ // from 1st index to last (including) (until last index)
            System.out.println(str.charAt(i));
            i++;
        }
    }
}
