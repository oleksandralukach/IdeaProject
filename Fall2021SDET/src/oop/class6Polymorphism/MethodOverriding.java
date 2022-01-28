package oop.class6Polymorphism;

class Bank {
    void displayRateOfInterest() {
        System.out.println("6%");
    }
}

class HSBBank extends Bank {
    void displayRateOfInterest(){
        super.displayRateOfInterest(); // we can use parent class method
        System.out.println("3%"); // plus what we want to add
    }
}

class Chase extends Bank {
    void displayRateOfInterest(){
        System.out.println("2%");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        HSBBank h = new HSBBank();
        h.displayRateOfInterest();
        Chase c = new Chase();
        c.displayRateOfInterest();



    }
}