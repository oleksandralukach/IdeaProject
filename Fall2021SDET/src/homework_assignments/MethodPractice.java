package homework_assignments;

public class MethodPractice {

    public static void main(String[] args) {

        int x = 5;
        int y = 20;
        int p = 3;

        System.out.println(printResult(x,y,p));



    }

    public static int printResult (int x, int y, int p){

        if(x % p == 0){
            return (y/p - x/p + 1);
        }
        return (y/p - x/p);
    }

}
