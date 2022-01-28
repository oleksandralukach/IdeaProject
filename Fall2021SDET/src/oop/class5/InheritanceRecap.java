package oop.class5;

    class Parent {
        int data = 5; // instance
    }

    class Child extends Parent{
        int data = 6; // instance or can be static //hiding the value of parent class


        public void printData(){
            int data = 10; // local var hiding value of in stance var
            // can not be static(don't belong to the class, just local)
            System.out.println(data);
        }
    }

public class InheritanceRecap {
    public static void main(String[] args) {
        Child c = new Child();
        Parent p = new Parent();
        c.printData();
    }
}
