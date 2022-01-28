package oop.class4Inheritance;

class Car {
    int count;

    Car() {
        count++;
    }

    public void displayCount() {
        System.out.println(count);
    }
}

public class RecapOfStatic {
    public static void main(String[] args) {

        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();

        c1.displayCount();
        c2.displayCount();
        c3.displayCount();
    }


}

