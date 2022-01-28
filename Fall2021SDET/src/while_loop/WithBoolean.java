package while_loop;

public class WithBoolean {
    public static void main(String[] args) {

        boolean flag = true;
        int n = 1;

        while (flag){

            // int n = 1 -> this will be initialized to 1 every iteration,
            // so it will never break out of this while loop

            System.out.println("Yay! While Loop iterated" + n + " times.");

            if (n == 5) {flag = false;} // control flow of condition
            n++;
        }
    }
}
