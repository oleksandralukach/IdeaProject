package oop.class3.Static;


class Phone2 {
    int memory;
    static String model;

    void printInfo(){
        System.out.println(memory);
        System.out.println(model);
    }
}
public class PhoneTester {
    public static void main(String[] args) {

        Phone2 o1 = new Phone2();
        Phone2 o2 = new Phone2();
        Phone2 o3 = new Phone2();

        o1.memory = 100;
        o2.memory = 200;
        o3.memory = 300;

        o1.model = "Samsung";
        o2.model = "Nokia";
        o3.model = "Apple";

        o1.printInfo();
        o2.printInfo();
        o3.printInfo();
    }
}

