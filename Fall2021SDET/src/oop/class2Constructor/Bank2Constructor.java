package oop.class2Constructor;

public class Bank2Constructor {
    String branch;
    String accNumber;
    String accName;
    double balance;

    public void printAccountInfo(){
        System.out.println(branch);
        System.out.println(balance);
        System.out.println(accNumber);
        System.out.println(accName);

    }

    // constructor (special method with the same name as class name)
    // you can take data from user
//    Bank2(String accNameFromUser, int balanceFromUser){ //constructor
//        accName = accNameFromUser;
//        balance = balanceFromUser;
//    }
    //Bank2(){} //default constructor

    Bank2Constructor(int balances){
        System.out.println("from constructor");
        balance = balances;
    }

    void Bank2(String accNameFromUser, int balanceFromUser){ //method
        System.out.println(accNameFromUser);
    }
    public void testMethod(){
        Bank2("Alex",1000);
    }


}
