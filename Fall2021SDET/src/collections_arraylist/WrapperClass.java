package collections_arraylist;

public class WrapperClass {

    // Wrapper classes are classes that wraps a primitive types to Objects
    // Each primitive type has a corresponding wrapper class
    // Since arraylist is part of collection framework it is designed to work with
    // wrapper classes to store primitive types.

    // boolean -> Boolean
    // int -> Integer
    // double -> Double
    // char -> Character
    // short -> Short
    // byte -> Byte
    // float -> Float
    // long -> Long

    public static void main(String[] args) {

        String stringNumber = "2021";

        System.out.println(stringNumber + 5); // 20215 -> concatenation

        short shortPrimitive = Short.parseShort(stringNumber);

        System.out.println(shortPrimitive + 5); // 2026

        short n = 5;

        short addedTwoShorts = (short) (shortPrimitive + n); // when adding short, byte with arithmetic operations
        // jvm converts both operands to int in order to perform the operation

        System.out.println(addedTwoShorts);

        // ==================================================================


        String yearBuilt = "1977";

        System.out.println(yearBuilt + 1);

        int intValueOfYear = Integer.parseInt(yearBuilt); // parseInt() method comes from Integer class
        // and it parses String into an int

        System.out.println(intValueOfYear + 1);

        // Now let's try to get the Integer object value of String yearBuilt

        Integer i = Integer.valueOf(yearBuilt);

        // ==================================================================

        char c = 'a';

        Character objectC = Character.valueOf(c); // converted primitive type c to an Object of Character objectC

        char numC = '8';

        int primitiveIntC = Integer.parseInt(String.valueOf(numC)); // converting char to String and then
        // parsing String to an int

        int primitiveOfChar = Character.getNumericValue(numC); // converted char to int by using
        // getNumericValue() method of Character class

        if (primitiveIntC == primitiveOfChar) System.out.println("Yes these 2 int vars are equal");

        System.out.println("Is numC a digit? " + Character.isDigit(numC));

        System.out.println("Is c a digit? " + Character.isDigit(c));

        System.out.println("Is c a letter? " + Character.isAlphabetic(c));

        System.out.println("Is c a letter? " + Character.isLetter(c));

        char symbol = '&';

        System.out.println("Is symbol variable a letter or digit? " + Character.isLetterOrDigit(symbol));

        //==============//==============//==============//==============//=============

    }
}
