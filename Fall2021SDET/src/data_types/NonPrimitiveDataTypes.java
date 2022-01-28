package data_types;

public class NonPrimitiveDataTypes {
    /**
     * A reference type refers to an object (an instance of a class).
     * Unlike primitive types that hold their values in the memory where the variable is
     * allocated, references do not hold the value of the object they refer to. Instead, a
     * reference “points” to an object by storing the memory address where the object is located,
     * a concept referred to as a pointer.
     */
        /*
        - all reference type begins with Uppercase letter.
        - non-primitive types have all the same size.
        - they can be used to invoke or call methods.
        - they can be null.
        - JVM allocates 8 bytes for each reference variable, by default.
        - are not pre-defined except the String.
         */
    // String is a sequence of characters in cadence
    // String can have very large amount of words or characters in it
    //plus sign is used to concatenate Strings

    public static void main(String[] args) {
        String firstName;
        firstName = "Nagesti";
        String lastName = "Gomez";
        String favoriteCar = "Aston Martin";

        System.out.println(firstName);
        System.out.println("First name is: " + firstName);
        System.out.println("Favorite car: " + favoriteCar);
        System.out.println(firstName + "'s " + "favorite car is a " + favoriteCar);
        System.out.println(firstName + " " + lastName + " " + favoriteCar );

    }
}
