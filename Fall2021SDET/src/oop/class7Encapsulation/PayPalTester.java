package oop.class7Encapsulation;


class PayPal{
//    void display(HSBCBank h){
//        h.displayRate();
//    }
//    void display(CitiBank c){ //overloading
//        c.displayRate();
//    }
//    void display(Chase ch){ //overloading
//        ch.displayRate();
//    }

    void displayRate(Bank bank){
        bank.displayRate();
    }
}
public class PayPalTester {
    public static void main(String[] args) {
//        HSBCBank hsbcBank = new HSBCBank();
//        hsbcBank.displayRate();
//
//        CitiBank citiBank = new CitiBank();
//        citiBank.displayRate();

        //instead:
        CitiBank acc1 = new CitiBank();
        PayPal p = new PayPal();
        p.displayRate(acc1);





    }
}
