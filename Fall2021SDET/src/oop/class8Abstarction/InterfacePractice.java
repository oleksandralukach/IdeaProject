package oop.class8Abstarction;

public class InterfacePractice {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(1, 2);  // upcast
        System.out.println("Area is " + s1.getArea());
        // Apply for the Triangle
        Shape s2 = new Triangle(1, 2, 3);
        System.out.println(s2.getArea());

        // Cannot create instance of an interface
        //Shape s3 = new Shape("green");   // Compilation Error!!
    }
}

interface Shape {  // Use keyword "interface" instead of "class"
    // List of public abstract methods to be implemented by its subclasses
    // All methods in interface are "public abstract".
    // "protected", "private" and "package" methods are NOT allowed.

    double getArea();

}

class Rectangle implements Shape {
    int a;
    int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a + a + b + b;
    }

}
class Triangle implements Shape {
    int a;
    int b;
    int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
