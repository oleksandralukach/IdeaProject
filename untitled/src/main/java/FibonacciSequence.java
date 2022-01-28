public class FibonacciSequence {

    //1 1 2 3 5 8 13 21 34
    //write a function that will return the nth fibonacci number
    //ex: 5
    //result 5

    public int nthNumber(int n) {
        /* Declare an array to store Fibonacci numbers. */
        int f[] = new int[n + 1];
        int i;
        /* 0th and 1st number of the series are 0 and 1*/
        f[0] = 0;
        if (n > 0) {
            f[1] = 1;
            for (i = 2; i <= n; i++) {
                /* Add the previous 2 numbers in the series
             and store it */
                f[i] = f[i - 1] + f[i - 2];
                // f5 = f4 + f3;
            }
        }
        return f[n];
    }

    public static void main(String[] args) {

        FibonacciSequence f = new FibonacciSequence();
        System.out.println(f.nthNumber(6));
    }

}

