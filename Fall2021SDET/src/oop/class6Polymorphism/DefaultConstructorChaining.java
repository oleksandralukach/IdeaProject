package oop.class6Polymorphism;

class Animal2 {
    Animal2 (String n){
        System.out.println(1);
    }
}

class Cat2 extends Animal2 {

    Cat2(String name) {
        super(name);
        System.out.println(2);
    }
}

class WildCat2 extends Cat2 {
    WildCat2(String name) {
        super(name); // java creates it by default bc there is default constructor in parent classes
        System.out.println("3. From Wild Cat" + name);
    }
}

public class DefaultConstructorChaining {
    public static void main(String[] args) {
        WildCat2 w = new WildCat2("Johny");

    }
}
