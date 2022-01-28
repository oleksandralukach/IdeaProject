package oop.class2Constructor;

public class Bank {

    String branch = "Cl";
    int balance = 1000;

    public void displayCustomerInfo(){
        System.out.println(branch);
        System.out.println(balance);
    }

    Bank(){ // default/no params
        System.out.println("Hello");
    }

    Bank(String branchFromUser, int balanceFromUser){
        branch = branchFromUser;
        balance = balanceFromUser;
        System.out.println("Hello");
    }
}
