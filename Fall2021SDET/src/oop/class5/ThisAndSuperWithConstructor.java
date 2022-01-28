package oop.class5;

class Vehicle{

    Vehicle(){
        System.out.println("1.From Vehicle");
    }
    Vehicle(String vType){
        System.out.println("From vehicle - " + vType);
    }
}
class Car extends Vehicle{
    int a;

    Car(){
        this("Audi");
        a = 10;
        System.out.println("2.From Car");
    }
    Car(String carName){
        super();
        System.out.println("3. From Car - " + carName);
    }
}

public class ThisAndSuperWithConstructor {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.a);
    }
}
