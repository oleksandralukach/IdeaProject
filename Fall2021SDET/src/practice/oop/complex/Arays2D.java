package practice.oop.complex;

import java.util.Arrays;
import java.util.Comparator;

public class Arays2D {
    public static void main(String[] args) {
        int[][] multi = new int[][]{
                {4, 9, 8},
                {7, 5, 2},
                {3, 0, 6},

        };
        for (int i = 0; i < multi.length; i++) {
            for (int j = 0; j < multi[i].length; j++) //length of first outer array
                System.out.print(multi[i][j] + " ");
            System.out.println();

        }
        //sort according to 3 column
        Sort2DArrayBasedOnColumnNumber(multi, 3);
        System.out.println("after sorting");
        for (int i = 0; i < multi.length; i++) {
            for (int j = 0; j < multi[i].length; j++)
                System.out.print(multi[i][j] + " ");
            System.out.println();

        }
    }

    public static void Sort2DArrayBasedOnColumnNumber(int[][] array, final int columnNumber) {

        Arrays.sort(array, (a, b) -> Integer.compare(a[1], b[1]));
//        Arrays.sort(array, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] first, int[] second) {
//                if (first[columnNumber - 1] > second[columnNumber - 1]) return 1;
//                else return -1;
//            }
//        });
    }

}

