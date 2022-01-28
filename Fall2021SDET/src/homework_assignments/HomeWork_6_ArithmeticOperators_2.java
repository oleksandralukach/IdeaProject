package homework_assignments;

public class HomeWork_6_ArithmeticOperators_2 {
    public static void main(String[] args) {

        System.out.println("Assignment_1");
        double a1 = 25.5, a2 = 3.5, a3 = 40.5, a4 = 4.5;
        double result1 = (a1 * a2 - a2 * a2) / (a3 - a4);
        System.out.println("Output #1: " + result1);

        System.out.println("Assignment_2");
        /*
        Write a Java program to compute a specified formula.
        Specified Formula : 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
        Expected Output: 2.9760461760461765
         */
        double b = 4.0;
        double c = 1.0;
        int d = 1;
        double result2 = b * (d-(c/(d+=2)) + (c/(d+=2)) - (c/(d+=2)) + (c/(d+=2)) - (c/(d+=2)));
        System.out.println("Output #2: " + result2); // Output: 4.846176046176046
    }
}
