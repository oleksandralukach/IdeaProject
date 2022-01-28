package oop.class2Constructor;

public class CarTester {

static int a3; //class level var

    public static void main(String[] args) {

        Car c1 = new Car();
        c1.drive(); // Driving null car
        System.out.println(c1.numberOfGear); // 0

        //=============================================

        int a[] = new int[5];
        System.out.println(a[0]); // 0

        //=============================================

//        int a1; // local var
//        System.out.println(a1); // error/ not initialized

        System.out.println(a3); // 0, class level var

        //====================================


    }
}
