package practice;

public class SumOfFirst10Numbers {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);

        int i = 1;
        while (i <= 10) {
            sum += i;
            i++;

        }
        System.out.println(sum);

        String str = "Love";
        String str1 = "Hate";
        for (int in = 1; in <= 2; in++) {
            //System.out.println(str.concat(String.valueOf(in)));
            System.out.println(str += str1 + "\n");
        }
        //System.out.println(str);


    }
}
