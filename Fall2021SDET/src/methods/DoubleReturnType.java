package methods;

import java.util.Scanner;

public class DoubleReturnType {

    /*
    1. Input for their salary
    2. Ask if married or not
    3. Recreate the method that calculate the tax and return the tax amount
        - if married -> salary * 5/100;
        - if not -> salary * 30/100;
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System. in); //input is an instance of a Scanner class
        System.out.println("Please input your salary: ");
        double salary = input.nextDouble();
        System.out.println("Are you married: ");
        boolean isMarried = input.nextBoolean();

        DoubleReturnType obj = new DoubleReturnType();
        double resultTaxAmount = obj.printTaxAmount(salary, isMarried);
    }

    public double printTaxAmount(double salary, boolean isMarried){

        double taxAmount;

        if(isMarried){
            taxAmount = salary * 5/100;
        }
        else
            taxAmount = salary * 30/100;

        System.out.println("Your tax amount is: " + taxAmount);

        return taxAmount;
    }
}
