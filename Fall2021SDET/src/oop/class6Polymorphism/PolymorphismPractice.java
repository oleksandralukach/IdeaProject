package oop.class6Polymorphism;

public class PolymorphismPractice {
    public static void main(String[] args) {
        Circle c = new Circle();
        Square s = new Square();
        Triangle t = new Triangle();
        c.draw();
        s.draw();
        t.draw();
        c.erase();

        Shape shape = new Shape();
        Shape ss = new Circle(); //dynamic polymorphism
        ss.draw();
    }
}
class Shape{

    void draw(){
        System.out.println("Let's draw");
    }
    void erase(){
        System.out.println("Let's erase everything");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Draw Circle");
    }

}
class Square extends Shape{
    void draw(){
        System.out.println("Draw Square");
    }

}
class Triangle extends Shape{
    void draw(){
        System.out.println("Draw Triangle");
    }

}
