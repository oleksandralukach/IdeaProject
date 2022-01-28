package coding_bat.array_1;

public class BiggerTwo {
    /**
     * Start with 2 int arrays, a and b, each length 2.
     * Consider the sum of the values in each array.
     * Return the array which has the largest sum.
     * In event of a tie, return a.
     * <p>
     * <p>
     * biggerTwo([1, 2], [3, 4]) → [3, 4]
     * biggerTwo([3, 4], [1, 2]) → [3, 4]
     * biggerTwo([1, 1], [1, 2]) → [1, 2]
     */

    public int[] biggerTwo(int[] a, int[] b) {

        int[] largestSum = new int[2];
        int sumOfElementsA = 0;
        int sumOfElementsB = 0;

        for (int i = 0; i < a.length; i++)
            sumOfElementsA += a[i];

        for (int i = 0; i < b.length; i++)
            sumOfElementsB += b[i];

        if(sumOfElementsA < sumOfElementsB){
            largestSum = b;
        }
        else largestSum = a;

        return largestSum;
    }

}
