package oop.class4Inheritance;

public class CalculatorTester {
    public static void main(String[] args) {
        BasicCalculator basic = new BasicCalculator();
        AdvancedCalculator advance = new AdvancedCalculator();
        basic.sum(10,20);
        advance.sum(10,20);
        advance.mul(10,20);

        advance.basic.sum(10,20);

        System.out.println(advance.a);

    }
}


