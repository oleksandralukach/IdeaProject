package oop.class7Encapsulation;

public class Car {
//    private int price;
//
//    Car(int price){
//        this.price = price;
//    }
//
//    public void printPrice(){
//        System.out.println(price);
//    }

    private int price = 1000;

    //Getter - get value of var - read access
    // displaying private var
    public int getBalance(){
        //ask security questions
        //username/password
        //then:
        return price;
    }

    //Setter - set value of variable - write access
    // if we want to modify private var
    public void setPrice(int price){
        this.price = price;
    }


}
