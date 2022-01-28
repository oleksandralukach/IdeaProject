package java_operators;

public class ComparisonOperators_2 {
    public static void main(String[] args) {
        char gender = 'M';
        boolean isMale = gender == 'M';
        System.out.println("Welcome to Our Store!Our Fall collection we have for men");

        String str1 = "Devxschool";
        System.out.println("is the school equal to Devxschool?" + ("devxschool" == str1));//key sensitive

        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b2 = b1 = false); // assignment -> only one "=" symbol it is assigning operator
        System.out.println(b2 = b1 == false); // comparing b1 has been assigned 'false' on line 14 that's why the
        //b1 == false executes to true therefore the outcome of this operation gets assigned to b2 as true
        // == - comparing
        //assignment has the least priority (precedence)
        System.out.println(b1);
        System.out.println(b2);

        int x = 5;
        double d1 = 5.0;
        boolean b10 = x == d1;
        // whenever we perform a comparison operation between
        // 2 primitive literals such as int, short, double etc.
        // Java will convert the smaller data type to the larger data type
        // and then it performs the operation
        //EX: int x = 5; double d1 = 5.0; in comparison operation both will be 5.0 == 5.0
        System.out.println("Is 5 equal to 5.0? " + b10);

        // When char is compared with a number first char will get the ASCII value of it
        // and then performs the operation

        // and if the char is being compared to a double then first
        // java will get the decimal representation of that char from ASCII
        // and then convert it to a larger type [double]
        char b = 'B';
        System.out.println(b == 66.0);

        // boolean b12 = str2 == 7; // we cannot compare non-primitive with primitive type

        int i1 = 5;
        boolean b13 = !(i1 != 5); // first the comparison of not equal to get executed in the parenthesis
        // and then the outcome will be changed to the complement of it [ex: if true then becomes not true when there
        // is a '!' mark so the outcome of the comparison will become true and gets assigned to b13
        System.out.println(b13);

        boolean b14 = !(!(!true)); // the value of b14 is now 'false'

        //we cannot compare primitive with non-primitive type

    }
}
