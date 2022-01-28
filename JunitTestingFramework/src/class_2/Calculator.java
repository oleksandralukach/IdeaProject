package class_2;

public class Calculator {

    public double sum(int a, int b) {

        return a + b;
    }
    public double sum(double a, double b) {

        return a + b;
    }

    public double sub(int a, int b) {

        return a - b;
    }
    public double sub(double a, double b) {

        return a - b;
    }

    public double div(double a, double b) {

        return a / b;
    }

//    public int div(int a, int b) {
//
//        return a / b;
//    }

    public double mul(int a, int b) {

        return a * b;
    }
}
// 1) a = 10, b = 10  exp - 1
// 2) a = 10, b = 20  exp - 0.5
// 3) a = 20, b = 10  exp - 2
// 4) a = 10, b = 10.5  exp -
// 5) a = -10, b = 20  exp - 0.5
// 6) a = 10, b = -10  exp - 1
// 7) a = 0, b = 10  exp - 0
// 8) a = 10, b = 0  exp - Cannot divide by zero
// 9) a = 0, b = abc  exp - Error
// 10) a = 0, b = -10  exp - 0
// 11) a = 0, b = 0  exp - Cannot divide zero
// 12) a = 20 digit, b = 0  exp - Success
// 13) a = 2^16 digit, b = 2^16  exp - Undefined
// 14) -10 -10