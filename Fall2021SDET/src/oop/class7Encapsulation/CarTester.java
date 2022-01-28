package oop.class7Encapsulation;

public class CarTester {
    public static void main(String[] args) {
//        Car obj = new Car(1000);
//        obj.printPrice();

        Car c = new Car();
        c.setPrice(5000);
        System.out.println(c.getBalance()); //5000
    }
}
