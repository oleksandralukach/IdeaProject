package oop.class1ObjectsAndClasses;

// package / java / Object

public class Tester {

    public static void main(String[] args) {

        int i; // 4 bytes already saved for this variable
        Bank acc1 = new Bank(); // need to declare as new variable to store name
        System.out.println(acc1.accNumber); // null (by default java initialize non-primitive)

        Bank acc2 = new Bank();

        acc1.balance = 1000;
        acc1.accName = "Tom";
        acc1.accName = "Saving";
        System.out.println(acc2.balance); //0.0

        acc1.checkBalance();

        acc2 = acc1;
        acc2.checkBalance();

        acc2.balance = 5000;
        acc1.checkBalance();

        acc2.balance = 5000;
        acc2.typeOfAccount = "Saving";
        acc2.accName = "Jerry";

        acc1.printAccountInfo();
    }
}
