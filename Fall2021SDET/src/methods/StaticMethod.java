package methods;

public class StaticMethod {

    // static methods belong to the class
    // and that enables us to call those static methods
    // form other classes without creating an object of that class

    public  static void addTwoNumbers(int a, int b){
        System.out.printf("The sum is %s", a + b);
    }

    // addTwoNumber() method belongs to staticMethod class
    // since it's static I can call this method from other static methods
    // directly without creating an object of a class

    public void subtractNumber(int num1, int num2){ //non static
        System.out.printf("The subtractNumber is %s", num1 - num2);
    }

    public static void main(String[] args) {

        addTwoNumbers(1,2);

        StaticMethod myObj = new StaticMethod(); // we have just created our own object of type StaticMethod
        myObj.subtractNumber(2,5); // in order to call method which is not "static"
        new StaticMethod().subtractNumber(2,7); // same as above in 1 line
    }

    // there are methods called instance methods aka nonstatic methods
    // and these instance methods belong to an object of the class
    // EX: Scanner scan = new Scanner()
    // scan. next() -> after '.' java shows all the methods that are in the object "scan" of a class

    // instance methods can call static methods directly without creating object
    // nonstatic methods can call nonstatic methods directly within a class only without creating object

}
