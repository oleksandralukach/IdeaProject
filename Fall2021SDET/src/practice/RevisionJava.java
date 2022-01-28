package practice;

public class RevisionJava {
    public static void main(String[] args) {
        //modulo:

        //modulo 2 always will be 0 or 1 depends on odd or even number
        System.out.println(54 % 2);
        System.out.println(53 % 2);
        //modulo 10 always will be last digit as remainder
        System.out.println(99 % 10);
        System.out.println(12 % 10);
        System.out.println(25 % 10);

        //if at least one logical operator is true, result will be true
        boolean b1 = true, b2 = false, b3 = false;
        boolean result = b1 && b2 && b3 || b2 && b1 || b1;

        //Conditional Statements:
        // if
        // else
        // else if
        // nested if
        //switch (no boolean condition, just value to evaluate)

        //Looping Statements
        // - for
        // - while
        // - do while
        // - for each(enhanced loop)

        //Arrays:
        // 1d
        // 2d
        // 1. Declare & initialize array
        int[] a = {3, 4, 5, 6};
        int[] b = new int[5];
        int[] c = new int[]{3, 4, 5, 6};
        int[][] data = new int[4][5]; //4 rows, 5 columns
        //2. Length of array
        System.out.println(a.length);
        //3.Initial value of array
        System.out.println(b[0]);
        //4.ArrayIndexOutOfBound
        //System.out.println(b[5]);
        //5.Length of 2d array
        System.out.println(data.length); //rows: 4
        System.out.println(data[2].length); //columns:5

        B b5 = new B();
        System.out.println(b5.x);

        A a5 = new A();
        System.out.println(a5.x);

        A a6 = new B();
        System.out.println(a6.x);

        RevisionJava r  = new RevisionJava();
        System.out.println(r.getClass().getPackageName());
    }

}

//Inheritance:


class A {
    int x = 20;
}

class B extends A {
    int x = 30;
}

class Test {

}

// Abstraction:
class Hello {

}

interface Person {
    void walk();
}

abstract class Child extends Hello implements Person {

}

class Child2 implements Person {
    @Override
    public void walk() {
        System.out.println();
    }
}

//child class reference can not hold parent class object
