package oop.class1ObjectsAndClasses;

public class Bank {

    String branchAddress;
    String accNumber; //we can initialize them here and its will be default value
    String accName;
    String typeOfAccount;
    double balance;

    public void withdraw(int amount){ balance = balance - amount;}
    public void deposit(int amount){ balance = balance + amount;}
    public void checkBalance(){System.out.println(balance);}
    public void printAccountInfo(){
        System.out.println(typeOfAccount);
        System.out.println(balance);
        System.out.println(accNumber);
        System.out.println(accName);

    }
}
