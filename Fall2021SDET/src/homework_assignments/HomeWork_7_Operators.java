package homework_assignments;

public class HomeWork_7_Operators {

    public static void main(String[] args) {
        System.out.println("------------Assignment_1------------");
        float width = 5.6f;
        float height = 8.5f;
        float area = width * height;
        float perimeter = 2 * (width + height);

        System.out.printf("Area is %s * %s = %s", width, height, area);
        //System.out.println("Area is " + width + " * " + height + " = " + area);
        System.out.println();
        System.out.printf("Perimeter is 2 * (%s + %s) = %s", width, height, perimeter);
        //System.out.println("Perimeter is " + 2 + " * (" + width + " + " + height + ") = " + perimeter);
        System.out.println();

        System.out.println("------------Assignment_2------------");
        double radius = 7.5;
        double pi = 3.141592653589793238;
        double perimeter2 = 2 * radius * pi;
        double area2 = pi * radius * radius;

        System.out.printf ("Perimeter is = %s", perimeter2);
        //System.out.println ("Perimeter is = " + perimeter2);
        System.out.println();
        System.out.printf("Area is = %s", area2);
        //System.out.println ("Area is = " + area2);

        System.out.println();
        System.out.println("------------Assignment_3------------");
        int number = 25;
        int firstDigit = number / 10;
        int secondDigit = number % 10;
        int sum = firstDigit + secondDigit;
        System.out.printf("The sum of the digits is: %s + %s = %s", firstDigit, secondDigit, sum);

    }
}
