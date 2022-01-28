package data_types;

public class PrimitiveDataTypes_2 {
    public static void main(String[] args) {
        long numberOfViews = 3_000_000_000L; //for long data size we add L
        System.out.println(numberOfViews);

        //float data type should include f or F at the end of the value
        float engineSize = 3.5f;
        System.out.println(engineSize);

        //double data type can store up to 15 decimal digits
        double pi = 3.14d; //it is optional to put d at the end of the value, but it's best to not put it
        System.out.println(pi);

        //boolean data is primitive type that has only 2 states
        //boolean can only have true or false values

        boolean isPresent;
        isPresent = true;
        isPresent = false;

        boolean has4Tires = true;
        boolean isCold = false;

        //char [character] that can only hold one character as a value
        //they can be used for different scenarios EX: grades, gender etc
        //chars use single quotes to wrap it's values

        char Gender = 'M';
        char ampersand = '&';

        //decimal value of character [letter] [G] is 71 in an ASCII




    }
}
