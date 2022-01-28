package arrays.multidimesionall_arrays;

public class TwoD {
    /*
    Arrays can be nested which means that we can store other arrays inside the arrays
     */

    public static void main(String[] args) {

        int [] evenNumbers = {2, 4, 6, 8, 10, 24, 96, 1048};
        System.out.println(evenNumbers[3]);

        // for 2 dimensional arrays we need to provide a pair of square brackets
        // after the data type of the name of array

        int[][] oddNumbers = {{1,3,5},{7,9,11}}; // int[2][3]

        // to access the element of multidimensional arrays
        // we need to provide the index of nested array itself and then provide the
        // index of an element inside that nested array

        System.out.println(oddNumbers[0][0]); // to print out "1" from array
        System.out.println(oddNumbers[0][2]); // to print out "5" from array
        System.out.println(oddNumbers[oddNumbers.length -1]
                [oddNumbers[oddNumbers.length-1].length-1]); // to print out "11" from array
    }
}
