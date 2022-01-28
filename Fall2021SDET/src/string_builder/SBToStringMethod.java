package string_builder;

public class SBToStringMethod {

    /*
    String to String()
    returns a String by converting String Builder to String
     */

    public static void main(String[] args) {

        String studentName = "Alex";

        // 1. SB sb = new SB(); HEAP memory reserve default capacity of 16 number of characters
        // 2. SB sb = new SB(32);
        // 3. SB sb = new SB("Any String);
        // 4. sb.append("Any String");

        StringBuilder sb = new StringBuilder("Alex"); // (studentName)
        String name = sb.toString();
        System.out.println(name);

        //converting String to sb
        StringBuilder sb2 = new StringBuilder(name);
        sb2.append("Ole");
        System.out.println(sb2);

    }
}
