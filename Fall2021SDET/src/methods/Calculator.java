package methods;

public class Calculator {
    public static void main(String[] args) {

        System.out.println(calculateTax(222, true));

    }

    // if you have a task to print out smth you will just use void
    // if you have a task to calculate smth and give the result you will need return

    public static double calculateTax(double salary, boolean isMarried){

        double tax;

        if (isMarried == true){
            tax = salary * 5/100;
        } else {
            tax = salary * 30/100;
        }

        return tax;

        // should I write a method?
        // what should be the return type? -> should I just print out or return? return tax
    }
}
