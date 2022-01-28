package oop.class8Abstarction;

public class Car2 {

    public int a = 10;

    public Car2() { //constructor also needs to be public to access from outside the package
        System.out.println("1. Starting the car"); // start the car
        System.out.println(a);
    }
//    private Car2() { //constructor also needs to be public to access from outside the package
//        System.out.println("1. Starting the car"); // start the car
//        System.out.println(a);
//    } no one will be able to create object or access instance methods, just static methods,
// so we're making constructor private so the user is not able to create an object of class (Math class)

    public void drive() {
        System.out.println("2. Driving"); // driving
    }
}

