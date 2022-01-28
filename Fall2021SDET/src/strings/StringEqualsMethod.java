package strings;

import java.util.Scanner;

public class StringEqualsMethod {

    // public boolean equals(String str)
    // returns true if 2 strings have the same value
    // vs '==' returns true if 2 strings are pointing to the same object

    public static void main(String[] args) {

        String s1 = new String("New");
        String s2 = s1;
        s1 = "New1"; // in String pool
        s2 = new String("New1"); // in Heap memory


        System.out.println(s1.equals(s2)); // -> if they have the same value // true

        System.out.println(s1 == s2); // -> check literals values (if it's the same object // false

        boolean isEqual = "Aisha".equals("aisha");
        System.out.println(isEqual);

        String str1 = "1";
        String str2 = str1.concat("2");
        str2.concat("3");
        System.out.println("str2: " + str2);

        //========================================================================

        String x = "HelloWorld"; // in String Pool
        String y = "HelloWorld";
        System.out.println(x == y); // true bc 2 Strings are pointing to the same object in String Pool

        String z = " HelloWorld".trim(); // ?since its new object with updates its saves to Heap Memory?
        // if just String z = "Hello World"; so it saves to Pool Memory

        System.out.println(z); // ? why it's not referring to the same obj in String Pool as 'x' and 'y' ?
        //String z1 = "HelloWorld";

        System.out.println(x == z); // false, it just compares addresses not values
        System.out.println("x.equal(z): " + x.equals(z)); // true bc compares values

        // new obj == new obj never return true bc it compares different addresses/references

        // new literal and new obj are different
        // is new literal(value) in Pool Memory is new obj

       // ====================================================================================

        String helloWorld1 = "hello world";
        //String helloWorld1 = new String("hello world");
        String helloWorld2 = new Scanner(System.in).nextLine(); // "hello world"

        System.out.println(helloWorld1 == helloWorld2); // false

       // ====================================================================================

        String helloWorld3 = "hello world"; // in String Pool

        String hello = "hello"; //Final method means the method cannot be overridden
        String world = "world";
        String helloWorld4 = hello + " " + world;
        System.out.println(helloWorld4); // in String Pool ??

        System.out.println("==: "+ helloWorld3 == helloWorld4);
    }
}
