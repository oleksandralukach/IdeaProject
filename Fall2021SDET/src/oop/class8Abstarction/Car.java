package oop.class8Abstarction;

public interface Car { // basic functionality each car needs to provide
    // its like a contract with a child class

    //by default interface is abstract/ just abstract methods by default

    abstract void drive();
    abstract void pressReverse();
    abstract void playMusic();
    void go();
}

interface SportsCar extends Car {

    void accelerateAtHighSpeed();
}

class Toyota implements Car,SportsCar {

    @Override
    public void drive() {
    }

    @Override
    public void pressReverse() {
    }

    @Override
    public void playMusic() {
        System.out.println("Play using bluetooth");
    }

    @Override
    public void go() {
    }

    @Override
    public void accelerateAtHighSpeed() {
        System.out.println("I am a sport car");
    }
}

class Ford implements Car{

    @Override
    public void drive() {
    }

    @Override
    public void pressReverse() {
    }

    @Override
    public void playMusic() {
        System.out.println("Play using cd");
    }

    @Override
    public void go() {
    }

}

class RepairShop{
    public void repair(Car c){

    }
}
