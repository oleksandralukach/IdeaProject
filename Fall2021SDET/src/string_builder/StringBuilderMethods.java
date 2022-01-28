package string_builder;

public class StringBuilderMethods {

    /*
       substring(), length(), charAt(), indexOf() -> these 4 methods work exactly like in String class.
       they don't update the value of StringBuilder object.
     */

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");
        String str = sb.substring(sb.indexOf("J"), sb.indexOf("v"));

        System.out.println(str);
        System.out.println(sb);

        sb.substring(1, 3);
        System.out.println(sb); // "Java" because substring will not update the value of sb
    }
}
