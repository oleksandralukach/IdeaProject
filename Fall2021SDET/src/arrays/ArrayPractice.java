package arrays;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {

        // default value of array = default values of data types

        /**
         Output:
         */

//   1):
//        int i[];
//        System.out.println(i[0]);

//   2):
        int a[] = new int[5]; // collection of data (have to create object 'new')
        a[0] = 2;
        System.out.println(a.length);
        System.out.println(Arrays.toString(a)); // [2 0 0 0 0]
        //System.out.println(a[5]); //Index 5 out of bounds for length 5




//   3):
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        System.out.println(a); // memory location

//   4):
        for (int i = 1; i <= a.length; i++) {
            System.out.print(i); //12345 bc we're not accessing array
        }
        System.out.println();
//   5):
        for (int i = 1; i <= a.length; i++) {
            System.out.print(a[i - 1]); // 12345
        }
        System.out.println();

//   6):
        for (int i = 1; i < a.length; i++) { // 4 numbers
            System.out.print(a[i - 1]); // 1234
        }
        System.out.println();

//   7):
        for (int i = 1; i < a.length; i++) { //4 numbers
            System.out.print(a[i]); // 2345
        }
        System.out.println();

//   8):
        for (int i = 0; i < a.length; i++) { // 5 numbers
            System.out.print(a[i]); // 12345
        }
        System.out.println();
        //=========================================================

        int[] scoreArray = {2, 14, 35, 67, 85};
        //int[] scoreArray = new int[5]; {00000}

        for(int val : scoreArray)
            System.out.println(val);
        //=============================================================

        int[] numbers = {1, 4, 7, 11};
        numbers[2] = numbers[2] + 5;

        for (int n: numbers){
            System.out.println(n);
        }

        //====================================================

        String[][] smartPhones = {{"IPhone", "IPhone x"},{"Samsung", "Note 10"},{"Windows Phone"}};

        //System.out.println("Sm 2: " + Arrays.toString(smartPhones)); // ?

      int j;
        for (int i = 0; i < smartPhones.length; i++){

            for (j = 0; j < smartPhones[i].length; j++){

            System.out.println("Smartphones: " + smartPhones[i][j]);
            }

        }


        // write a method that returns an int array which has the same length as the cities array
        // and at each index it should have the number of times letter 'l' or 'L' appears?

        String[] cities = {"Los Angeles", "San Francisco", "Chicago", "New York", "Boston"};

        System.out.println(Arrays.toString(createNewArray(cities)));

    }

    public static int[] createNewArray(String[] str) {

        int[] newArray = new int[str.length];

       for (int i = 0; i < newArray.length; i++){
           int counter = 0;

           for (int j = 0; j < str[i].length();j++){  // using length method to each String element
                if (str[i].charAt(j) == 'l'|| str[i].charAt(j) == 'L'){
                    counter++;
                }
            }
            newArray[i] = counter;
       }

        return newArray;
    }

    //======================================================


}
