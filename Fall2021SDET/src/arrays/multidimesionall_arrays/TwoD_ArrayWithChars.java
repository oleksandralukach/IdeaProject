package arrays.multidimesionall_arrays;

import java.util.Arrays;

public class TwoD_ArrayWithChars {

    public static void main(String[] args) {

        char[][] symbols = new char[4][2];

        symbols [0][0] = '!';
        symbols [0][1] = '@';

        symbols [1][0] = '#';
        symbols [1][1] = '$';

        symbols [2][0] = '%';
        symbols [2][1] = '^';

        symbols [3][0] = '&';
        symbols [3][1] = '*';

        System.out.println(Arrays.toString(symbols[0]));

        for (char[] chars : symbols){

            System.out.println(Arrays.toString(chars));
        }
    }
}
