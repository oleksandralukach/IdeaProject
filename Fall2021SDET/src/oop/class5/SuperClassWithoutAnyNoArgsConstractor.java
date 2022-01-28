package oop.class5;

class Person{
    Person(String name){
        System.out.println("Name - " + name);
    }
}
class Engineer extends Person{
    Engineer(){
        super("Mansur");
        System.out.println("Engineer does not need a name");
    }

}
public class SuperClassWithoutAnyNoArgsConstractor {
    public static void main(String[] args) {
        Engineer e = new Engineer();
    }
}
