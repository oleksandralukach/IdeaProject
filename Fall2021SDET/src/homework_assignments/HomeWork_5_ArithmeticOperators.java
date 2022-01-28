package homework_assignments;

public class HomeWork_5_ArithmeticOperators {

    public static void main(String[] args) {
        System.out.println("Assignment_1");
        int num1 = 25;
        int num2 = 5;
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        System.out.println("Sum of two integers: " + sum);
        System.out.println("Difference of two integers: " + difference);
        System.out.println("Product of two integers: " + product);

        System.out.println("Assignment_2");
        int a = 5, b = 8, c = 6, d = 55, e = 9, f = 20, g = 3, h = 15, i = 2;
        int result =-a + b * c;
        System.out.println(result);
        int result2 = (d + e) % e;
        System.out.println(result2);
        int result3 = f + -g * a / b;
        System.out.println(result3);
        int result4 = h + i /g * i -b % g;
        System.out.println(result4);

        System.out.println("Assignment_3");
        int number = 8, number1 = 1, number2 = 2, number3 = 3, number4 = 4, number5 = 5,
                number6 = 6, number7 = 7, number8 = 8 , number9 = 9, number10 = 10;
        System.out.println(number + " x " + number1 + " = " + number*number1);
        System.out.println(number + " x " + number2 + " = " +number*number2);
        System.out.println(number + " x " + number3 + " = " +number*number3);
        System.out.println(number + " x " + number4 + " = " +number*number4);
        System.out.println(number + " x " + number5 + " = " +number*number5);
        System.out.println(number + " x " + number6 + " = " +number*number6);
        System.out.println(number + " x " + number7 + " = " +number*number7);
        System.out.println(number + " x " + number8 + " = " +number*number8);
        System.out.println(number + " x " + number9 + " = " +number*number9);
        System.out.println(number + " x " + number10 + " = " +number*number10);

        System.out.println("Assignment_4");
        int num_1 = 20;
        int num_2 = 30; // declared and initialized num_2 variable to run the code

        System.out.println("num1 + num2: " + (num_1 + num_2) );
        System.out.println("num1 - num2: " + (num_1 - num_2) );
        System.out.println("num1 * num2: " + (num_1 * num_2) );
        System.out.println("num1 / num2: " + (num_1 / num_2) );
        System.out.println("num1 % num2: " + (num_1 % num_2) );
    }
}
