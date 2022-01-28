package oop.class5;

class Bank{

    int data;

    public void printData(){
        System.out.println(data);
    }
    Bank(){
        System.out.println("From bank class");
    }
}
class HSBCBank extends Bank{
    HSBCBank(){
        System.out.println("From HS Bank class");
    }
}

class CitiBank extends HSBCBank{
    CitiBank(){
        System.out.println("From Citi Bank class");
    }
}

public class ChainingConstructor {
    public static void main(String[] args) {
        HSBCBank h = new HSBCBank(); // chaining constructor. It first goes to parent class constructor, then child

    }

}
