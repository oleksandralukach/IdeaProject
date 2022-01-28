package oop.class2Constructor;

public class BankTester {

    public static void main(String[] args) {

        Bank acc1 = new Bank("Cl", 5000);// creating object of a class with calling constructor and our vars got initialized

        Bank acc2 = new Bank();
        acc1.displayCustomerInfo(); //using object to call method


    }
}
