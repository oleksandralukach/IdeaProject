package string_builder;

public class SBReverseMethod {

    /*
    StringBuilder reverse()
    returns a reference to the same string builder
    by reversing the characters in it
     */

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Ciuperca");
        sb.reverse();
        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder();
        sb1.append("Maryna Nesterenko");
        System.out.println(sb1.reverse());

        String s = "Mykhailo";
        System.out.println(reverseStr(s));

    }
    public static String reverseStr (String str){

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        return sb.toString();
    }
}
