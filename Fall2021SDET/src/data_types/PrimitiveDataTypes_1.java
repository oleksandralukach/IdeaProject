package data_types;
/**
 Data types are there to store some information because every piece of
 information needs to get stored in the memory, every information uses a memory in the computer.
 Depending on the data type we use it takes or reserves that much memory from the
 storage of the server or the computer. [EX: age can be easily stored in an int, imagine we use
 long for it and see how much memory it takes up to for social media sites]

 Data Types specifies the size and type of values that can be stored in identifier.

 Data Types in java are classified in 2 types:
 1. Primitive (8):
 -byte,short,int,long L(integer types stores whole numbers)
 -float f, double(floating types stores fractional numbers, containing 6 and 15 decimal digits relatively)
 -boolean( holds true or false values),
 -char(single character)
 -pre-defined (defined by java)
 -lower case
 -size is fixed
 2. Non-primitive (Reference): System, String (holds string of characters), Object - non pre-defined
 */
// A variable is a name for a piece of memory that stores data.
// Variables in Java are data containers that stores data values.
// Variable is a memory location name of the data

public class PrimitiveDataTypes_1 {
    public static void main(String[] args) {
        //Variables names are always camelCase but the first letter is lowerCase
        //all variable should have a data type and a name for that variable [data type] + [name]
        //this process is called declaring a variable
        byte firstByteVariable;
        byte b1; //declared a byte type variable name b1

        // variable names cannot be the same
        // there will be a naming conflict

        firstByteVariable = 13; // assigning a value to a variable is called initializing a variable
        System.out.println(firstByteVariable);

        b1 = 127;
        System.out.println(b1);

        // byte b2 = 13;
        byte b2 = firstByteVariable;
        System.out.println(b2);

        int age; // variable declaration
        age = 32; // variable initializing

        int numberOfTires = 4; // this is both declaring and initializing a variable

        System.out.println(numberOfTires);

        int minNum = -3_000_000; // underscore are also allowed to be included in the value for whole number
        System.out.println(minNum);

        // multiple variables can be declared in one statement
        // but they have to have the same data type

        int numberOfComments = 50, numberOfLikes, numberOfFollowers = 1_000_000;
        //anything that comes before semicolon - ; is one statement

        //int numberOfComments;
        //int numberOfLikes;
        //int numberOfFollowers;

        numberOfLikes = 999_000;
        System.out.println(numberOfComments);
        System.out.println(numberOfLikes);
        System.out.println(numberOfFollowers);

        // each data type will have its own functionalities and meaning

        char gender = 'm';
        char gradeExcellent = 'A';
        char currency = '$';

        // it takes time to set up and it costs a lot
        // naming variables - reusability. it should be intuitive what the class is about just by looking into multiple variables

        // Advantages of variables

    }

}
