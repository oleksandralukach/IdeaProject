package oop.class3.Static;

class Bank3 {

    static int balance;
    static String accName;

    public void displayBalance() {
        System.out.println(balance);

    }

    public static void displayAccName() {
        System.out.println(accName);
    }

}

public class StaticKeyword {

    public static void main(String[] args) {
        Bank3 b1 = new Bank3();
        Bank3 b2 = new Bank3();
        b1.balance = 20;
        b2.balance = 50;

        b1.displayBalance();
        b2.displayBalance();

        Bank3.displayAccName(); //calling static method directly without object creating
    }
}


