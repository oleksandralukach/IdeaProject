package homework_assignments;

import java.util.Scanner;

public class HomeWork_8_FahrenheitToCelsius {
    /*
    Input a degree in Fahrenheit: 212
Expected Output:
212.0 degree Fahrenheit is equal to 100.0 in Celsius

Example
Convert 68 degrees Fahrenheit to degrees Celsius:
T(°C) = (68 - 32) × 5/9 = 20 °C
// your Fahrenheit variable is here 68 the rest value are given in number values
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a degree in Fahrenheit: ");
        double degreeInF = s.nextDouble();

        double degreeInC = (degreeInF -32) * 5/9;
        System.out.println(degreeInF + " degrees Fahrenheit is equal to " + degreeInC + " in Celsius");

    }
}
