package methods;

public class MethodCallsMethod {

    //we can call methods from inside other methods

    public static void main(String[] args) {

        method2();
        method1();

    }

    public static void method1(){
        method2();
        System.out.println("I am method 1");
    }

    protected static void method2(){
        System.out.println("I am method 2");
    }
}
