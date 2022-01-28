package oop.class10Throw;

public class ThrowExample {
    public static void main(String[] args) {
        int dayNumber = 15;

        switch (dayNumber) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                throw new RuntimeException("Please enter valid number");
                //creating an object of our exception class and pass our message
        }
        System.out.println("We are using entered number");
    }
}
