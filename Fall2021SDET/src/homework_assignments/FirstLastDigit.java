package homework_assignments;

public class FirstLastDigit {
    public static void main(String[] args) {

        //Last digit -> x % 10 -> returns the last digit of a number
        // First digit -> x/10 (for 2-digit number; depends on how many digits number has)
        // Remove last digit and print else -> x/10

        int num = 120;
        int firstDigit = num / 10;
        int lastDigit = num % 10;
        System.out.println(firstDigit);
        System.out.println(lastDigit);

        int sum = firstDigit + lastDigit;
        System.out.println("The sum of the digits is: " + sum);
    }
}
