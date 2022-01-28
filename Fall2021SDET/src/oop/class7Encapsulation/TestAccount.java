package oop.class7Encapsulation;

public class TestAccount {

    /**
     * The Account class models a bank account with a balance.
     * <p>
     * The expected
     * outputs are:
     * <p>
     * A/C no:1234,Balance=99.99
     * A/C no:8888,Balance=0.00
     * A/C no:1234,Balance=88.88
     * Account Number is:1234
     * <p>
     * Balance is:88.88
     * A/C no:1234, Balance=98.88
     * A/C no:1234, Balance=93.88
     * amount withdrawn exceeds the current balance!
     * A/C no:1234,Balance=93.88
     */

    public static void main(String[] args) {
        // Test Constructors and toString()
        Account a1 = new Account(1234, 99.99);
        System.out.println(a1);  // toString()
        Account a2 = new Account(8888);
        System.out.println(a2);  // toString()

        // Test Setters and Getters
        a1.setBalance(88.88);
        System.out.println(a1);  // run toString() to inspect the modified instance
        System.out.println("The account Number is: " + a1.getAccountNumber());
        System.out.println("The balance is: " + a1.getBalance());

//        // Test credit() and debit()
        a1.credit(10);
        System.out.println(a1);  // run toString() to inspect the modified instance
        a1.debit(5);
        System.out.println(a1);
        a1.debit(500);   // Test debit() error
        System.out.println(a1);
    }
}

class Account {
    // The private instance variables
    private int accountNumber;
    private double balance;

    // The constructors (overloaded)
    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public Account(int accountNumber) {  // with default balance
        this.accountNumber = accountNumber;
        balance = 0.00;
    }

    // The public getters/setters for the private instance variables.
    // No setter for accountNumber because it is not designed to be changed.

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //Add the given amount to the balance.
    public void credit(double amount) {
        balance += amount;
    }

    // Subtract the given amount from balance, if applicable.
    public void debit(double amount) {
        if (balance < amount) {
            System.out.println("amount withdrawn exceeds the current balance!");
        } else {
            balance -= amount;
        }
    }

    // The toString() returns a string description of this instance.
    public String toString() {
        // Use built-in function System.format() to form a formatted String
        return String.format("A/C no:%d, Balance=%.2f", accountNumber, balance);
    }
}



