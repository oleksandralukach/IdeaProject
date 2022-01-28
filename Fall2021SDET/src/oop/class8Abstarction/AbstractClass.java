package oop.class8Abstarction;

abstract class Bank{ //incomplete class

    int balance;

    Bank(){

    }

    abstract void displayInterestRate();

    public void withdraw (int amount){
        balance = balance - amount;
    }

    public void deposit (int amount){
        balance = balance + amount;
    }
}

class HSBank extends Bank{

    @Override
    void displayInterestRate() {
        System.out.println("3.5%");
    }
}

public class AbstractClass {

    public static void main(String[] args) {
//        Bank b = new Bank(); // object of abstract class is not possible
//        b.displayInterestRate();

    }
}
