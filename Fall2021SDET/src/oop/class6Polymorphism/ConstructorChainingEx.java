package oop.class6Polymorphism;

class Animal1{
    Animal1(String name){
        System.out.println("1. From Animal"+ name);
        System.out.println(name);
    }
}
class Cat1 extends Animal1{
    Cat1(String name){
        super("Coco");
        System.out.println("2. From Cat" + name);

    }
}
// whenever in the parent class we have only constructor which is taking arguments,
// then we have call that constructor explicitly from child class constructor
class WildCat1 extends Cat1{
    WildCat1(String name){
        super("Lala"); // here we call the parent constructor explicitly by passing arguments
        System.out.println("3. From Wild Cat"+ name);
    }
}
public class ConstructorChainingEx{
    public static void main(String []args){
        WildCat1 w = new WildCat1("Johny");

    }
}
