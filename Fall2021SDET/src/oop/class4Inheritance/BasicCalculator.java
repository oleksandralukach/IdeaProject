package oop.class4Inheritance;

public class BasicCalculator {

    int a = 10;

    public void sum(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    public void sub(int a, int b) {
        System.out.println("Sub: " + (a - b));
    }
}

class AdvancedCalculator extends BasicCalculator {

    BasicCalculator basic = new BasicCalculator();


   // int a = 20; // hiding the value of parent class


    public void mul(int a, int b) {

        System.out.println(a * b);
    }

    public void div(int a, int b) {

        System.out.println(a / b);
    }
}