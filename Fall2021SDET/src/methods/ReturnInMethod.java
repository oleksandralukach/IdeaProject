package methods;

public class ReturnInMethod {

    int number = 5; // we can use anywhere

    public static void main(String[] args) {

        ReturnInMethod obj = new ReturnInMethod();

        // int fiveAssigned = obj.number;

        // System.out.println(returnInMethod.subtractValue(2));
        int res = obj.subtractValue(2);
        // result = 2;
        System.out.println(res);

        System.out.println(obj.addNumber(6));
    }

    int subtractValue(int num){

        number = number;
        int result = 5 - num; // result var is local to subtractValue()
        addNumber(result);

        return result;
    }

    int randomMethod (){

        return subtractValue(3);
    }

    int addNumber (int num){

        int result = 4; // result var is local to addNumber() method only
        return num + result;
    }
}
