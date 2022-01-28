package coding_bat.array_2;

import java.util.Arrays;

public class FizzArray {
    public static void main(String[] args) {
        FizzArray fizzArray = new FizzArray();
        int[] newArray = fizzArray.fizzArray(4);
        System.out.println(Arrays.toString(newArray));
    }
    public int[] fizzArray(int n){

        int[] newArray = new int[n];

        if(newArray.length == 0){
            return new int[0];
        }
        else {

            for (int i = 0; i < n; i++) {
                newArray[i] = i;
            }
        }
        return newArray;
    }
}
