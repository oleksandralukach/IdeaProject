package methods;

public class MethodInReturn1 {

    public static int addTwoNumbers (int num){

        return num + 3; // num = 2 and we are adding 3
    }

    public static void main(String[] args) {

        int result = addTwoNumbers(2);

        System.out.println(result);

    }
}
