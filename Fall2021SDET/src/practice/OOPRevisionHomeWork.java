package practice;

public class OOPRevisionHomeWork {
    private int x = 50;

    void m1() {
        System.out.println(x);
    }
}

class J extends OOPRevisionHomeWork {
    @Override
    void m1() {
        System.out.println("Hello. I am overridden method");
    }
}

class Test2 {
    public static void main(String[] args) {
        OOPRevisionHomeWork a = new J();
        a.m1();
    }

//Inheritance:

    /**
     * Will this code run successfully? If yes, what will be the output?
     * public class A {
     *    int x = 20;
     * }
     * public class B extends A {
     *    int x = 30;
     * }
     * public class Test {
     * public static void main(String[] args)
     * {
     *    B b = new B();
     *    System.out.println(b.x);
     *
     *    A a = new A();
     *    System.out.println(a.x);
     *
     *    A a2 = new B();
     *    System.out.println(a2.x);
     *   }
     * }
     */
    // Answer: This code will not compile as all classes declared as public in one file.
    // If think that they are in different files - code will compile and output will be:
    // 30 -> object of child class accessing child class variable
    // 20 -> object of parent class accessing parent class variable
    // 20 -> reference variable of parent class pointing to object of child class
    // which will access the variable of parent class (as vars are not polymorphic and can not be overridden)


    /** Will this code run successfully? If yes, what will be the output?
     * public class A
     * {
     *    private int x = 50;
     *    void m1() {
     *        System.out.println(x);
     *  }
     * }
     * public class B extends A {
     *
     * }
     * public class Test {
     * public static void main(String[] args)
     * {
     *    A a = new B();
     *     a.m1();
     *   }
     * }
     */

    //Answer:
    // Code will compile and the output will be:
    // 50 -> parent class reference pointing to object of child class (dynamic polymorphism)
    // which will call overridden method.
    // Because it's not overridden in child class it will call original method of super class

    //Polymorphism:
    /**
     * class A {
     *  void sum(int x, int y){
     *   System.out.println("Sum of two numbers: " +(x+y));
     *  }
     *  void sum(int y, int x){
     *   System.out.println("Sum of three numbers: " +(x+y));
     *  }
     * public static void main(String[] args){
     *  A a = new A();
     *   a.sum(20, 30);
     *  }
     * }
     */
    //Answer:
    //Output:
    //Error: code will not compile as we have 2 methods with the sane name and same params in one class

    /**
     * class A {
     * void m1(String x){
     *  System.out.println("One");
     * }
     * protected void m1(String x, String y){
     *  System.out.println("Two");
     * }
     * public static void main(String[] args){
     *  A a = new A();
     *  a.m1("ABC");
     *  a.m1("PQR", "XYZ");
     *  }
     * }
     */
    //Answer:
    //Output:
    // One
    // Two
    // Here we have method overriding -> static polymorphism (same method name, but different params)

    /**
     * What is the output of the following program if no error?
     * class A {
     *  void sum(int x, int y){
     *   System.out.println("Sum of two numbers: " +(x+y));
     *  }
     *  void sum(int x, int y, int z){
     *   System.out.println("Sum of three numbers: " +(x+y+z));
     *  }
     * public static void main(String[] args){
     *  A a = new A();
     *   a.sum(20, 30);
     *   a.sum(30, 40, 50);
     *  }
     * }
     */
    //Answer:
    //Output:
    // 50
    // 120
    // Method overriding

//Encapsulation:
    /**
     * In the following code, radius is declared as private in the class Circle, and myCircle is an instance of class Circle.
     * Does the code cause any error problems? If so, explain why? If no, what is the output?
     class Circle {
     private double radius = 1;
     public double getArea() {
     return radius * radius * Math.PI;
     }
     public static void main(String[] args) {
     Circle myCircle = new Circle();
     System.out.println("Radius is " + myCircle.radius);
     System.out.println("Area of circle: " + myCircle.getArea());
     }}
     */
    //Answer:
    //Output:
    // 1.0 -> we can access private variable radius and method as they are in the same class
    // 3.141592463723456

    //Abstraction:
    /**
     * Which among the following code have errors?
     * a) abstract class A {  ------------->  error (non-abstract method should have a body{})
     *      void m1();
     *    }
     * b) public class A {
     *      abstract void m1(); ------------> error (class should be declared as abstract to have abstract methods)
     *    }
     * c) abstract public class A { ------------> no errors (abstract class can have both abstract and non-abstract methods)
     *     abstract void m1();
     *    }
     * d) abstract public class A { ------------> no errors (abstract class can have both abstract and non-abstract methods)
     *      void m1() { }
     *    }
     * e) public abstract class A { ------------> no errors (abstract class can have both abstract and non-abstract methods, it can have constructor)
     *     abstract void m1();
     *     A(){ }
     *     void m2() { }
     *     }
     * f) public abstract class A { ------------> error (vars can not be abstract)
     *      abstract int x = 100;
     *      abstract void m1();
     *      abstract void m2();
     *     }
     * g) public abstract class A { ------------> error (we can not have object of abstract class as it can have abstract methods with no implementation)
     *     abstract void m1();
     *    }
     *    public class Test {
     *    public static void main(String[] args) {
     *     A a = new A();
     *     }
     *    }
     * h) public abstract class A { ------------> no errors (we implementing method inside child class B. And in the method we calling static method which not require instantiating)
     *     abstract void m1();
     *     A(){ }
     *     static void m2() {
     *     System.out.println("Hello Java!");
     *     }
     *     }
     *     public class B extends A {
     *      void m1(){
     *         A.m2();
     *      }
     *     }
     * i) public abstract class A { ------------> error (class B need to override methods from abstract method as it extends it)
     * (not sure about private constructor in abstract class: why we have it and how we use it)
     *     abstract void m1();
     *    private A(){ }
     *    }
     *    public class B extends A { }
     */


}
