package while_loop;

public class EvenNumbers {

    public static void main(String[] args) {

        int n = 1;

        while (n <= 10){
            n++;
            if (n % 2 == 0)
            System.out.println(n);

        }

        //================================================

        int num = 0;

        while (num < 10){

            num = num + 2;
            System.out.println(num);
        }

    }
}
