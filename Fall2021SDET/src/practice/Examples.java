package practice;

public class Examples {
    public static void main(String[] args) {
        Circle myCircle = new Circle();
        System.out.println("Radius is " + myCircle.getRadius());
        System.out.println("Static Radius is " + Circle.getRadiusS());
        System.out.println("Area of circle: " + myCircle.getArea());

        Ac ac = new Bc();
        ac.m1();

//        Ad ad = new Bd();
//        ad.m1();
    }

}

class Circle {
    private double radius = 1;
    private static double radiusS = 2;

    public double getRadius() {
        return radius;
    }

    public static double getRadiusS() {
        return radiusS;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}

abstract class Ac {
    abstract void m1();

    Ac() {
    }

    static void m2() {
        System.out.println("Hello Java!");
    }
}

class Bc extends Ac {
    void m1() {
        Ac.m2();
    }
}

//abstract class Ad {
//    abstract void m1();
//
//    private Ad() {
//    }
//
//}
// class Bd extends Ad {
//
//     @Override
//     void m1() {
//
//     }
// }




