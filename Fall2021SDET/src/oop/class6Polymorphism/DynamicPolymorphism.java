package oop.class6Polymorphism;

public class DynamicPolymorphism {
    public static void main(String[] args) {
        // parent class instance
        Phone p = new Phone();
        p.call(); // calling
        p.text(); //texting

        // child class instance
        Smartphone sp = new Smartphone();
        sp.call(); // Wi-Fi calling
        sp.text(); // texting
        sp.surfInternet(); //surfing

        //dynamic polymorphism
        //reference parent class = child class object
        Phone ps = new Smartphone(); // just 2 methods from parent class will be available
        ps.call(); // Wi-Fi calling
        ps.text(); // texting


    }
}

class Phone{
    public void call(){
        System.out.println("calling");
    }
    public void text(){
        System.out.println("texting");
    }
}
class Smartphone extends Phone{
    public void surfInternet(){
        System.out.println("surfing");
    }

    public void call(){
        System.out.println("WIFI calling");
    }

}
